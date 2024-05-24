package fita.vnua.bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QLNS {
	
	private List<Nguoi> dsns;
	
	public QLNS() {
		dsns = new ArrayList<>();
		
	}
	
	public void themNhanSu(Nguoi ns) {
		dsns.add(ns);
	}
	public void nhapDanhSach(Scanner sc) {
		System.out.println("Nhap so nhan su: ");
		int n = sc.nextInt(); sc.nextLine();
		
		int chon=0;
		Nguoi ns = null;
		for(int i=0;i<n;i++) {
			System.out.println("Chon loai ns muon nhap(0:hs, 1:sv): ");
			chon = sc.nextInt();sc.nextLine();
			switch(chon) {
			case 0:
				ns=new HocSinh();
				break;
			case 1:
				ns=new SinhVien();
				break;
			
			}
			ns.nhapThongTin(sc);
			themNhanSu(ns);
		}
		
	}
	
	public void inDanhSach() {
		for (Nguoi ns : dsns) {
			ns.inThongTin();
		}
	}
	public void timKiemTheoMSV(String msv) {
		System.out.println("----------");
		System.out.println("Sinh vien co ma sinh vien"+msv+" la:");
		for (Nguoi ns : dsns) {
			if(ns instanceof Nguoi) {
				SinhVien sv = (SinhVien)ns;
				if(msv.equals(sv.getMsv())) {
					sv.inThongTin();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		QLNS qlns = new QLNS();
		Scanner sc = new Scanner(System.in);
		qlns.nhapDanhSach(sc);;
		qlns.inDanhSach();
		qlns.timKiemTheoMSV("671370");
	}

	
	
}
