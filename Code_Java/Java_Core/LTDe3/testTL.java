package LTDe3;

import java.util.Scanner;

public class testTL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuanLySach qltl = new QuanLySach();
		Scanner sc = new Scanner(System.in);
		qltl.nhapDanhSachTL(sc);
		qltl.hienThiDS();
		qltl.timKiemTaiLieu("HD-2004");
	}

}
