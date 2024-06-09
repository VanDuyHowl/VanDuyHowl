package LTDe3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySach {
	private List<TaiLieu> dstl;

	public QuanLySach() {
		dstl = new ArrayList<TaiLieu>(100);
	}

	public void themTaiLieu(TaiLieu tl) {
		dstl.add(tl);
	}

	public void nhapDanhSachTL(Scanner sc) {
		System.out.print("Nhap so tai lieu co trong danh sach: ");
		int n = sc.nextInt();
		sc.nextLine();

		int chon = 0;
		TaiLieu tl = null;
		for (int i = 0; i < n; i++) {
			System.out.println("Tai lieu thu " + (i + 1));
			System.out.println("Nhap tai lieu muon nhap(0:Sach, 1:Bao, 2:TapChi): ");
			chon = sc.nextInt();
			sc.nextLine();

			switch (chon) {
			case 0:
				tl = new Sach();
				break;
			case 1:
				tl = new Bao();
				break;
			case 2:
				tl = new TapChi();
				break;
			}
			
			//Khi chon xong se nhap thong tin tai lieu do va them vao mang
			tl.nhapTaiLieu(sc);
			themTaiLieu(tl);
		}
	}
	
	public void hienThiDS() {
		System.out.println("\n=== DANH SACH TAI LIEU ===");
		for(TaiLieu tl : dstl) {
			tl.hienThiTaiLieu();
		}
	}
	
	public void timKiemTaiLieu(String MTL) {
		System.out.println("==========");
		System.out.println("\nTai lieu co ma tai lieu " +MTL+ " la:");
		for (TaiLieu tl : dstl) {
			if(MTL.equals(tl.getMTL())) {
				tl.hienThiTaiLieu();
			}
		}
	}
	
	
}
