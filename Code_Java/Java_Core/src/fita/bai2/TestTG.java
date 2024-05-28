package fita.bai2;

public class TestTG {
	public static void main (String []args) {
		Diem A = new Diem();
		Diem B = new Diem(3,0);
		Diem C = new Diem(0,4);
		
		//Tao tam giac
		TamGiac tg = new TamGiac(A, B, C);
		
		//in chu vi
		System.out.println("Chu vi hinh tam giac la: " + tg.chuVi());
		System.out.println("Dien tich hianh tam giac la: " + tg.dienTich());
	} 
}
