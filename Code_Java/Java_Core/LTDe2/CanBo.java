package LTDe2;

import java.util.Scanner;

public class CanBo {
	private String hoTen;
	private String ngaySinh;
	private String gioiTinh;
	private String diaChi;

	public CanBo() {

	}

	public CanBo(String hoTen, String ngaySinh) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
	}

	public CanBo(String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
		this(hoTen, ngaySinh);
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
	}

	public void nhapThongTin(Scanner sc) {
		System.out.print("Ho ten: ");
		hoTen=sc.nextLine();
		System.out.print("Nhap ngay sinh(dd/MM/yyyy): ");
		ngaySinh = sc.nextLine();
		System.out.print("Gioi tinh: ");
		gioiTinh=sc.nextLine();
		System.out.print("Dia chi: ");
		diaChi=sc.nextLine();
	}

	public void hienThi() {
		System.out.println("Ho ten: "+hoTen);
		System.out.println("Ngay sinh: "+ngaySinh);
		System.out.println("Gioi tinh: "+gioiTinh);
		System.out.println("Dia chi: "+diaChi);
	}

	public String getHoTen() {
		return hoTen;
	}

}
