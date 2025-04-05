package com.koma.stu.pojo;

public class Student {
	
	private int id;
	private String studentName;
	private String studentNo;
	private int age;
	private int gender;
	private String major;
	private String grade;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String studentName, String studentNo, int age, int gender, String major, String grade) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.studentNo = studentNo;
		this.age = age;
		this.gender = gender;
		this.major = major;
		this.grade = grade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", studentNo=" + studentNo + ", age=" + age
				+ ", gender=" + gender + ", major=" + major + ", grade=" + grade + "]";
	}


}
