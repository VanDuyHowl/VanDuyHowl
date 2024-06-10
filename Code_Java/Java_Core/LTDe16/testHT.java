package LTDe16;

public class testHT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diem I=new Diem(1,2);
		int r=10;
		
		HinhTron ht=new HinhTron(I,r);
		System.out.println("Chu vi: " + ht.tinhCV());
		System.out.println("Dien tich: " + ht.tinhDT());
	}

	
}
