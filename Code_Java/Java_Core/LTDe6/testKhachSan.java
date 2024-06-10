package LTDe6;

import java.util.Scanner;

public class testKhachSan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		KhachSan qlks = new KhachSan();
		int CMND;
		
		qlks.nhapDanhSach(sc);
		System.out.println("\n=== DANH SACH KHACH TRO ===\n");
		qlks.hienThiDanhSach();
		
		System.out.println("\nNhap vao CMND cua khach hang muon xoa: ");
		CMND=sc.nextInt();
		qlks.XoaKT(CMND);
		System.out.println("\n=== DANH SACH KHACH TRO SAU KHI XOA ===\n");
		qlks.hienThiDanhSach();
		
		System.out.println("\nNhap vao CMND cua khach hang muon tinh tien: ");
		CMND=sc.nextInt();
		System.out.println("Tong tien: " + qlks.tinhTien(CMND)); 
		
	}
}
