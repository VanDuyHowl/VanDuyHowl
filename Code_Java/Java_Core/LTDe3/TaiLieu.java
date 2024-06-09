package LTDe3;

import java.util.Scanner;

public class TaiLieu {
	private String MTL;
	private String tenNSX;
	private String soBanPhatHanh;
	
	public TaiLieu() {
		
	}
	
	public TaiLieu(String MTL, String tenNSX, String soBanPhatHanh) {
		this.MTL=MTL;
		this.tenNSX=tenNSX;
		this.soBanPhatHanh=soBanPhatHanh;
	}
	
	public void nhapTaiLieu(Scanner sc ) {
		System.out.print("Ma tai lieu: ");
		MTL=sc.nextLine();
		System.out.print("Ten nha san xuat: ");
		tenNSX=sc.nextLine();
		System.out.print("So ban phat hanh: ");
		soBanPhatHanh=sc.nextLine();
	}
	
	public void hienThiTaiLieu() {
		System.out.println("Ma tai lieu: "+ MTL);
		System.out.println("Ten nha san xuat: "+ tenNSX);
		System.out.println("So ban phat hanh: "+ soBanPhatHanh);
	}

	public String getMTL() {
		return MTL;
	}
	
}
