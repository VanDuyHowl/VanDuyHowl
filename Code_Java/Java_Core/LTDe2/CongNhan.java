package LTDe2;

import java.util.Scanner;

public class CongNhan extends CanBo{
	private String Bac;
	
	public CongNhan() {
		
	}
	
	public CongNhan(String hoTen, String ngaySinh, String gioiTinh, String diaChi,String Bac) {
		super(hoTen, ngaySinh, gioiTinh, diaChi);
		this.Bac=Bac;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.println("Bac: ");
		Bac=sc.nextLine();
	}
	
	public void hienThi() {
		super.hienThi();
		System.out.println("Bac: "+Bac);
		
	}
	
}
