package fita.DeThiMau;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student("Nguyen Thanh Nam", "Trau Quy - Gia Lam");
		stu.addCourseGrade("Java", 9);
		stu.addCourseGrade("CSDL", 8);
		stu.addCourseGrade("Pascal", 10);
		stu.addCourseGrade("Network", 6);
		
		System.out.println(stu.toString());
		System.out.println("Điểm trung bình môn là: "+stu.getAverageGrades());
	}

}
