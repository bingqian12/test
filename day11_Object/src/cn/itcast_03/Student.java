package cn.itcast_03;

public class Student {
	private String name ;
	private int age ;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
		
/*	@Override
	public boolean equals(Object obj) {
		Student s = (Student)obj;
		if (this.name.equals(s.name) && this.age == s.age) {
			return true;
		}else {
			return false;
		}
	}*/
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		} 
		// TODO Auto-generated method stub
		Student s = (Student)obj ;
		System.out.println("同一个对象，还需要向下转型比较");
		return this.name.equals(s.name)&&this.age == s.age;
	}
}
