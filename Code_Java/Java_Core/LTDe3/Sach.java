package LTDe3;

import java.util.Scanner;

public class Sach extends TaiLieu{
	private String tenTG;
	private int soTrang;
	
	public Sach() {
		
	}
	
	public Sach(String MTL, String tenNSX, String soBanPhatHanh, String tenTG, int soTrang) {
		super(MTL, tenNSX, soBanPhatHanh);
		this.tenTG=tenTG;
		this.soTrang=soTrang;
	}
	
	public void nhapTaiLieu(Scanner sc) {
		super.nhapTaiLieu(sc);
		System.out.println("Ten tac gia: ");
		tenTG=sc.nextLine();
		System.out.println("So trang: ");
		soTrang=sc.nextInt();
	}
	
	public void hienThiTaiLieu() {
		super.hienThiTaiLieu();
		System.out.println("Ten tac gia: " + tenTG);
		System.out.println("So trang: " + soTrang);
	}
	
}
