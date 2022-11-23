package Entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Student {

	private int id;
	private String fullname;
	private boolean gender;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthday;
	private String address;
	private Classes classid;
	private String idClass;
	private String nameClass;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String fullname, boolean gender, Date birthday, String address, String idClass,
			String nameClass) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
		this.idClass = idClass;
		this.nameClass = nameClass;
	}

	public Student(int id, String fullname, boolean gender, Date birthday, String address, Classes classid) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
		this.classid = classid;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Classes getClassid() {
		return classid;
	}

	public void setClassid(Classes classid) {
		this.classid = classid;
	}

	public String getIdClass() {
		return idClass;
	}

	public void setIdClass(String idClass) {
		this.idClass = idClass;
	}

	public String getNameClass() {
		return nameClass;
	}

	public void setNameClass(String nameClass) {
		this.nameClass = nameClass;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fullname=" + fullname + ", gender=" + gender + ", birthday=" + birthday
				+ ", address=" + address + ", classid=" + classid + "]";
	}

}
