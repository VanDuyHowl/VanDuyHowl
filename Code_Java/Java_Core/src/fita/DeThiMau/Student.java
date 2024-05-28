package DeThiMau;

public class Student extends Person{
	//Khai bao so mon hoc dang hoc
	private int numCourse;
	
	//Khai bao mang ten mon hoc
	private String[] courses = new String[30];
	
	//Khai bao mang diem cua cac mon hoc
	private int[] grades = new int[30];
	
	public Student(String name, String address) {
		super(name,address);
		
	}
	
	//Ham tra ve
	public String toString() {
		return ("Student: "+getName()+"( " + getAddress()+" )");
	}
	
	//Ham them mon hoc
	public void addCourseGrade(String course, int grade) {
		courses[numCourse] = course;
		grades[numCourse] = grade;
		numCourse++;
	}
	
	//Ham tra diem TB cac mon hoc
	public double getAverageGrades() {
		int sum = 0;
		for(int i=0;i<numCourse;i++) {
			sum += grades[i]; 
		}
		double diemTB = sum/numCourse;
		return diemTB;
	}
	
}
