package LTDe5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	private String hoTen;
	private Date ngaySinh;
	private String ngheNghiep;
	
	public Nguoi() {
		
	}
	
	public Nguoi(String hoTen,Date ngaySinh, String ngheNghiep) {
		this.hoTen=hoTen;
		this.ngaySinh=ngaySinh;
		this.ngheNghiep=ngheNghiep;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhap ho va ten: ");
		hoTen=sc.nextLine();
		System.out.println("Nhap ngay sinh(dd/MM/yyyy):");
		String ngaySinhstr=sc.nextLine();
		ngaySinh=stringToDate(ngaySinhstr);
		System.out.println("Nhap nghe nghiep: ");
		ngheNghiep=sc.nextLine();
	}
	
	public Date stringToDate(String ngaySinhStr) {
		Date ngaySinhDate = null;
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			ngaySinhDate =sdf.parse(ngaySinhStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Loi chuyen doi");
		}
		return ngaySinhDate;
	}
	
	public void hienThiThongTin() {
		System.out.println("Ho ve ten: " + hoTen);
		System.out.println("Ngay sinh: " + ngaySinh);
		System.out.println("Nghe nghiep: " + ngheNghiep);
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}
	
	
}
