package LTDe5;

import java.util.Scanner;

public class testHoDan {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		KhuPho qlkp = new KhuPho();
		
		qlkp.nhapDanhSach(sc);
		qlkp.hienThiDanhSach();
		System.out.println("\nDanh sach ho dan co nguoi 80 tuoi la: ");
		qlkp.timKiemThongTin();
	}
}
