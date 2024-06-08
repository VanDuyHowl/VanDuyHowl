package LTDe1;

import java.util.Scanner;

public class phanSo {
	// Thuoc tinh
	private int tuSo;
	private int mauSo;

	// Phuong thuc
	// ham tao khong doi so
	public phanSo() {
		tuSo = 0;
		mauSo = 1;
	}

	// ham tao co doi so
	public phanSo(int tuSo, int mauSo) {
		this.tuSo = tuSo;
		this.mauSo = mauSo;
	}

	// ham nhap ps
	public void nhapPS(Scanner sc) {
		int a = tuSo;
		int b = mauSo;
		do {
			System.out.println("Nhap tu so:");
			a = sc.nextInt();

			System.out.println("Nhap mau so:");
			b = sc.nextInt();

			if (b == 0) {
				System.out.println("Nhap lai!");
			}else {
				tuSo=a;
				mauSo=b;
			}
		} while (b == 0);
	}

	// ham dua ra mh
	public void inPS() {
		if (tuSo * mauSo < 0) {
			System.out.println("-" + Math.abs(tuSo) + "/" + Math.abs(mauSo));
		} else {
			System.out.println(Math.abs(tuSo) + "/" + Math.abs(mauSo));
		}
	}

	// Cac phep + - x /
	public phanSo congPS(phanSo ps2) {
		int a = tuSo * ps2.mauSo + ps2.tuSo * mauSo;
		int b = mauSo * ps2.mauSo;
		return new phanSo(a, b);
	}

	public phanSo truPS(phanSo ps2) {
		int a = tuSo * ps2.mauSo - ps2.tuSo * mauSo;
		int b = mauSo * ps2.mauSo;
		return new phanSo(a, b);
	}

	public phanSo nhanPS(phanSo ps2) {
		int a = tuSo * ps2.tuSo;
		int b = mauSo * ps2.mauSo;
		return new phanSo(a, b);
	}

	public phanSo chiaPS(phanSo ps2) {
		int a = tuSo * ps2.mauSo;
		int b = mauSo * ps2.tuSo;
		return new phanSo(a, b);
	}

	// ham tim úcln
	public int timUSCLN(int a, int b) {
		int r = a % b;

		while (r != 0) {
			a = b;
			b = r;
			r = a % b;
		}
		return b;
	}

	// ktra toi gian
	public Boolean ktToiGianPS() {
		if (timUSCLN(tuSo, mauSo) == 1) {
			return true;
		} 
		return false;
	}

	// ham thuc hien neu ps chua toi gian
	public void toiGianPS() {
		if (ktToiGianPS() == true) {
			int x = timUSCLN(tuSo, mauSo);
			tuSo /= x;
			mauSo /= x;
		}
	}

}
