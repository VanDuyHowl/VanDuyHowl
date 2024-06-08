package LTDe2;

import java.util.Scanner;

public class KySu extends CanBo{
	private String nganhDaoTao;
	
	public KySu() {
		
	}
	
	public KySu(String hoTen, String ngaySinh, String gioiTinh, String diaChi,String nganhDaoTao) {
		super(hoTen, ngaySinh, gioiTinh, diaChi);
		this.nganhDaoTao=nganhDaoTao;
	}
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.println("Nganh dao tao: ");
		nganhDaoTao=sc.nextLine();
	}
	
	public void hienThi() {
		super.hienThi();
		System.out.println("Nganh dao tao: "+nganhDaoTao);
		
	}
	
}
