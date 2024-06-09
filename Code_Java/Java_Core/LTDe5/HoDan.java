package LTDe5;

import java.util.Date;
import java.util.Scanner;

public class HoDan extends Nguoi{
	private int soNguoi;
	private int soHo;
	private Nguoi[] list;
	
	public HoDan() {
		list=new Nguoi[50];
	}
	
	public HoDan(String hoTen,Date ngaySinh, String ngheNghiep, int soNguoi, int soHo ) {
		super(hoTen, ngaySinh, ngheNghiep);
		this.soNguoi=soNguoi;
		this.soHo=soHo;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhap vao so nguoi: ");
		soNguoi=sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap so ho: ");
		soHo=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Nhap thong tin tung nguoi co trong ho: ");
		for(int i=0;i<soNguoi;i++) {
			System.out.println("Nguoi thu "+(i+1)+" la:");
			list[i]=new Nguoi();
			list[i].nhapThongTin(sc);;
		}
	}
	
	public void hienThiThiongTin() {
		System.out.println("So nguoi: "+soNguoi);
		System.out.println("So ho: "+soHo);
		System.out.println("\n=== Thong tin tung nguoi trong ho ===");
		for(int i=0;i<soNguoi;i++) {
			System.out.println("Nguoi thu "+(i+1)+" la:");
			list[i].hienThiThongTin();
		}
	}
	
	public Nguoi[] getList() {
		return list;
	}
	
	public int getsoNguoi() {
		return soNguoi;
	}
	
}
