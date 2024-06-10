package LTDe6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	private String hoTen;
	private Date ngaySinh;
	private int CMND;
	
	
	public Nguoi() {
		
	}
	
	public Nguoi(String hoTen, Date ngaySinh, int CMND) {
		this.hoTen=hoTen;
		this.ngaySinh=ngaySinh;
		this.CMND=CMND;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.print("Nhap ho ten: ");
		hoTen=sc.nextLine();
		System.out.print("Nhap ngay sinh(dd/MM/yyyy): ");
		String ngaySinhstr = sc.nextLine();
		ngaySinh = stringToDate(ngaySinhstr);
		System.out.print("Nhap so CMND: ");
		CMND=sc.nextInt();
		
	}

	private Date stringToDate(String ngaySinhstr) {
		// TODO Auto-generated method stub
		Date ngaySinhDate = null;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
			try {
				ngaySinhDate = sdf.parse(ngaySinhstr);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Loi dinh dang!");
			}	
		
		return ngaySinhDate;
	}
	
	public void hienThiThongTin() {
		System.out.println("Ho ten: " + hoTen);
		System.out.println("Ngay sinh: " + ngaySinh);
		System.out.println("So CMND: " + CMND);
	}

	public int getCMND() {
		return CMND;
	}
	
	
	
}
