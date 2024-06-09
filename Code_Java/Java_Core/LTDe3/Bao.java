package LTDe3;

import java.util.Scanner;

public class Bao extends TaiLieu{
	private String ngayPhatHanh;
	
	public Bao() {
		
	}
	public Bao(String MTL, String tenNSX, String soBanPhatHanh,String ngayPhatHanh) {
		super(MTL, tenNSX, soBanPhatHanh);
		this.ngayPhatHanh=ngayPhatHanh;
	}
	
	public void nhapTaiLieu(Scanner sc) {
		super.nhapTaiLieu(sc);
		System.out.println("Ngay phat hanh(dd/MM/YYYY): ");
		ngayPhatHanh=sc.nextLine();
	}
	
	public void hienThiTaiLieu() {
		super.hienThiTaiLieu();
		System.out.println("Ngay phat hanh: "+ngayPhatHanh);
	}
	
}
