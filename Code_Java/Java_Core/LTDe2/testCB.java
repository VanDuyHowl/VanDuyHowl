package LTDe2;

import java.util.Scanner;

public class testCB {
	public static void main(String[] args) {
		QLCB qlcb = new QLCB();
		Scanner sc = new Scanner(System.in);
		qlcb.nhapDanhSach(sc);
		qlcb.hienThiDanhSach();
		qlcb.timKiemTheoHoTen("Duy");
	}
}
