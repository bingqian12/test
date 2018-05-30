package cn.itcast_02;

public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.hashCode());
		System.out.println(s1.getClass().getName());
		System.out.println("-----------");
		System.out.println(s1.toString());
		System.out.println(s1.getClass().getName() + "@" + Integer.toHexString(s1.hashCode()));
	}
}
