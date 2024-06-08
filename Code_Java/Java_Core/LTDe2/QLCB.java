package LTDe2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
	private List<CanBo> dscb;

	public QLCB() {
		// khoi tao danh sach 100 phan tu
		dscb = new ArrayList<CanBo>(100);
	}

	public void themCanBo(CanBo cb) {
		// Them nhan su vao arraylist
		dscb.add(cb);
	}

	public void nhapDanhSach(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.print("Nhap so can bo n = ");
		int n = sc.nextInt();
		sc.nextLine();

		// Vong lap 0 -> (n-1): nhap thong tin can bo va them vao danh sach
		int chon = 0;
		CanBo cb = null;
		for (int i = 0; i < n; i++) {
			System.out.println("Can bo thu "+ i+" :");
			System.out.print("Chon loai cb muon nhap(0: nv, 1: cn, 2:Ks); ");
			chon = sc.nextInt();
			sc.nextLine();
			switch (chon) {
			case 0:
				cb = new NhanVien();
				break;
			case 1:
				cb = new CongNhan();
				break;
			case 2:
				cb = new KySu();
				break;
			}
			cb.nhapThongTin(sc); // Tinh da hinh
			themCanBo(cb);
		}
	}

	public void hienThiDanhSach() {
		// TODO Auto-generated method stub
		System.out.println("\nDANH SACH CAN BO LA:");
		for (CanBo cb : dscb) {
			cb.hienThi(); // Tinh da hinh
			System.out.println("==========");
		}
	}

	public void timKiemTheoHoTen(String hoTen) {
		// TODO Auto-generated method stub
		System.out.println("Can bo co ho ten " + hoTen + " la:");
		for (CanBo cb : dscb) {
			if (hoTen.equals(cb.getHoTen())) {
				cb.hienThi();
			}
		}
	}

}
