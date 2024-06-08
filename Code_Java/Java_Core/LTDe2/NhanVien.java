package LTDe2;

import java.util.Scanner;

public class NhanVien extends CanBo{
	private String congViec;
	
	public NhanVien() {
		
	}
	
	public NhanVien(String hoTen,String ngaySinh,String gioiTinh, String diaChi,String congViec) {
		super(hoTen, ngaySinh, gioiTinh, diaChi);
		this.congViec=congViec;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.println("Cong viec: ");
		congViec=sc.nextLine();
	}
	
	public void hienThi() {
		super.hienThi();
		System.out.println("Cong viec: "+congViec);

	}
	
}
