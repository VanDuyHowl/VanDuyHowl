package LTDe6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KhachSan {
	private List<KhachTro> dsks;

	public KhachSan() {
		dsks = new ArrayList<KhachTro>(100);
	}

	public void themKhachTro(KhachTro kt) {
		dsks.add(kt);
	}

	public void xoaKhachTro(KhachTro kt) {
		dsks.remove(kt);
	}

	public void nhapDanhSach(Scanner sc) {
		KhachTro kt;

		System.out.print("Nhap vao so luong khach tro: ");
		int n = sc.nextInt();
		sc.nextLine();

		System.out.println("Nhap vao thong tin khach tro: ");
		for (int i = 0; i < n; i++) {
			System.out.println("Khach tro thu " + (i + 1));
			kt = new KhachTro();
			kt.nhapThongTin(sc);
			themKhachTro(kt);
		}
	}
	
	

	public void hienThiDanhSach() {
		for (KhachTro kt : dsks) {
			kt.hienThiThongTin();
		}
	}

	public int tinhTien(int CMND) {
		int Tien = 0;
		for (KhachTro kt : dsks) {
			if (CMND == kt.getCMND()) {
				System.out.println("\nSo tien cua khach hang co so CMND "+ CMND +" la:");
				Tien = kt.getSoNgayTro() * kt.getGiaPhong();
			}
		}
		return Tien;
	}
	
	public void XoaKT(int CMND) {
		int n=dsks.size();
	    for (int i=0;i<n;i++) {
	        KhachTro kt = dsks.get(i);
	        if (CMND == kt.getCMND()) {
	            dsks.remove(i);
	            System.out.println("Da xoa khach tro co so CMND la: " + CMND);
	            return;
	        }
	    }
	    System.out.println("Khong tim thay khach hang co so CMND la: " + CMND);
	}

}
