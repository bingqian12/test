package cn.itcast_01;

public class StudengTest {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		System.out.println(s1.hashCode());
		
		Student s2 = new Student();
		System.out.println(s2.hashCode());
		
		Student s3 = s1;
		System.out.println(s3.hashCode());
		
		System.out.println("----------");
		
		Student s4 = new Student();
		Class c = s4.getClass();
		String str = c.getName();
		System.out.println(str);
		
		String str2 = s4.getClass().getName();
		System.out.println(str2);
	}
}
