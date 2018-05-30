package cn.itcast_03;

public class StudentDemo {
	public static void main(String[] args) {
	Student s1 = new Student("林青霞",27);
	Student s2 = new Student("林青霞",27);
	System.out.println(s1 == s2);
	System.out.println("-----------");
	Student s3 = s1;
	System.out.println(s1 == s3);
	System.out.println("-----------");
	System.out.println(s1.equals(s1));
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s3));
	System.out.println(s2.equals(s3));
	System.out.println("-----------");
	Student s4 = new Student("风清扬",30);
	System.out.println(s1.equals(s4));
	}
}
