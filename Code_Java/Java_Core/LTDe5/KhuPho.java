package LTDe5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class KhuPho {
	private List<HoDan> dshd;
	
	public KhuPho() {
		dshd = new ArrayList<HoDan>(50);
	}
	
	public void themHoDan(HoDan hd) {
		dshd.add(hd);
	}
	
	public void nhapDanhSach(Scanner sc) {
		HoDan hd;
		System.out.println("Nhap vao so ho dan: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Nhap thogn tin cua tung ho dan: ");
		for(int i=0;i<n;i++) {
			System.out.println("Ho dan thu "+(i+1)+" la:");
			hd=new HoDan();
			hd.nhapThongTin(sc);
			themHoDan(hd);
		}
	}
	
	public void hienThiDanhSach() {
		int n=dshd.size();
		
		for(int i=0;i<n;i++) {
			System.out.println("\nHo dan thu "+(i+1)+" la:");
			dshd.get(i).hienThiThiongTin();
		}
	}
	
	public void timKiemThongTin() {
		//Lay ra nam hien tai
		Date now = new Date();
		int namHienTai = now.getYear() + 1900;
		
		Nguoi[] dstv = null;
		
		for(HoDan hd : dshd) {
			dstv = hd.getList();
			for(int i=0;i<hd.getsoNguoi();i++) {
				if(namHienTai - (dstv[i].getNgaySinh().getYear() + 1900 ) == 80) {
					hd.hienThiThiongTin();
				}
			}
		}
	}
	
}
