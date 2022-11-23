package Controller;

import java.lang.reflect.Type;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import Entity.Classes;
import Entity.Messenger;
import Entity.Student;

@Controller
@RequestMapping(value = "/student")
public class StudentController {
    
	@GetMapping(value = {"","/list-student"})
	public String listStudent(Model model) {
		String URL = "http://localhost:8080/Service-Server/rest/student/list-student";
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(URL);
		Gson gs = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();	
		Type typeOfT = new TypeToken<List<Student>>(){}.getType();
		String dulieu = target.request(MediaType.APPLICATION_JSON).get(String.class);
		List<Student> lst = gs.fromJson(dulieu, typeOfT);
		model.addAttribute("lst", lst);
		return "student/list";
	}
	
	@GetMapping(value = "/insert")
	public String insertStudent(Model model) {
		Student std = new Student();
		std.setGender(true);
		model.addAttribute("std", std);
		//Khởi tạo CLasses
		Gson gs = new Gson();
		String URL = "http://localhost:8080/Service-Server/rest/classes/list-classes";
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(URL);
		String dulieu = target.request(MediaType.APPLICATION_JSON).get(String.class);
		Type typeOfT = new TypeToken<List<Classes>>(){}.getType();
		List<Classes> lstcl = gs.fromJson(dulieu, typeOfT);
		model.addAttribute("lst", lstcl);
		return "student/insert";
	}
	
	@PostMapping(value = "/insertok")
	public String insertOk(@ModelAttribute(value = "std")Student stu, Model model) {
		String URL = "http://localhost:8080/Service-Server/rest/student/insert-student";
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(URL);
		Gson gs = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
		Classes clok = new Classes();
		clok.setIdClass(stu.getIdClass());
		Student stok = new Student(0, stu.getFullname(), stu.isGender(), stu.getBirthday(), stu.getAddress(), clok);
		String dulieu = gs.toJson(stok);
		Response response = target.request(MediaType.APPLICATION_JSON_TYPE)
				.post(Entity.entity(dulieu, MediaType.APPLICATION_JSON));
		//lấy dữ liêu về
//		String data = response.readEntity(String.class);
//		Messenger mess = gs.fromJson(data, Messenger.class);
//		model.addAttribute("mess", mess);
		return "student/insert";
	}
	
}
