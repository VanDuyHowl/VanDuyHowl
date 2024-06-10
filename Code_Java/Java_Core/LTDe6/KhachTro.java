package LTDe6;

import java.util.Date;
import java.util.Scanner;

public class KhachTro extends Nguoi{
	private int soNgayTro;
	private String loaiPhong;
	private int giaPhong;
	
	public KhachTro() {
		
	}
	
	public KhachTro(String hoTen, Date ngaySinh, int CMND, int soNgayTro, String loaiPhong, int giaPhong) {
		super(hoTen, ngaySinh, CMND);
		this.soNgayTro=soNgayTro;
		this.loaiPhong=loaiPhong;
		this.giaPhong=giaPhong;
	}
	
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("Nhap so ngay tro: ");
		soNgayTro=sc.nextInt();sc.nextLine();
		System.out.print("Nhap loai phong: ");
		loaiPhong=sc.nextLine();
		System.out.print("Nhap gia phong: ");
		giaPhong=sc.nextInt();sc.nextLine();
	}
	
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("So ngay tro: " + soNgayTro);
		System.out.println("Loai phong: " + loaiPhong);
		System.out.println("Gia phong: " + giaPhong + "VNĐ");
	}

	public int getSoNgayTro() {
		return soNgayTro;
	}

	public int getGiaPhong() {
		return giaPhong;
	}
	
	
	
	
}
