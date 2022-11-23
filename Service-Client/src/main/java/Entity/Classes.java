package Entity;

import java.util.List;

public class Classes {

	private String idClass;
	private String className;
	private List<Student> listStudent;

	public Classes(String idClass, String className, List<Student> listStudent) {
		super();
		this.idClass = idClass;
		this.className = className;
		this.listStudent = listStudent;
	}

	public Classes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getIdClass() {
		return idClass;
	}

	public void setIdClass(String idClass) {
		this.idClass = idClass;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public List<Student> getListStudent() {
		return listStudent;
	}

	public void setListStudent(List<Student> listStudent) {
		this.listStudent = listStudent;
	}

	@Override
	public String toString() {
		return "Classes [idClass=" + idClass + ", className=" + className + ", listStudent=" + listStudent + "]";
	}

}
