package LTDe3;

import java.util.Scanner;

public class TapChi extends TaiLieu{
	private int soPhatHanh;
	private int thangPhatHanh;
	
	public TapChi() {
		
	}
	public TapChi(String MTL, String tenNSX, String soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
		super(MTL, tenNSX, soBanPhatHanh);
		this.soPhatHanh=soPhatHanh;
		this.thangPhatHanh=thangPhatHanh;
		
	}
	
	public void nhapTaiLieu(Scanner sc) {
		super.nhapTaiLieu(sc);
		System.out.println("So phat hanh: ");
		soPhatHanh=sc.nextInt();
		System.out.println("Thang phat hanh: ");
		thangPhatHanh=sc.nextInt();
	}
	
	public void hienThiTaiLieu() {
		super.hienThiTaiLieu();
		System.out.println("So phat hanh: " + soPhatHanh);
		System.out.println("Thang phat hanh: " + thangPhatHanh);
	}
	
}
