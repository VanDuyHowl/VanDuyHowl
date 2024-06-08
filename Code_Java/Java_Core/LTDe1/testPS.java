package LTDe1;

import java.util.Scanner;

public class testPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		phanSo ps1 = new phanSo();
		phanSo ps2 = new phanSo();
		phanSo psTong = new phanSo();
		phanSo psHieu = new phanSo();
		phanSo psTich = new phanSo();
		phanSo psThuong = new phanSo();
		
		//nhap
		System.out.println("Nhap PS1: ");
		ps1.nhapPS(sc);
		System.out.println("Nhap PS2: ");
		ps2.nhapPS(sc);
		
		//Tinh
		psTong = ps1.congPS(ps2);
		psHieu = ps1.truPS(ps2);
		psTich = ps1.nhanPS(ps2);
		psThuong = ps1.chiaPS(ps2);
		
		//Hien thi
		System.out.println("\nPhan so 1: ");
		ps1.inPS();
		System.out.println("\nPhan so 2: ");
		ps2.inPS();
		System.out.println("\nTong 2 phan so la: ");
		psTong.inPS();
		System.out.println("\nHieu 2 phan so la: ");
		psHieu.inPS();
		System.out.println("\nTich 2 phan so la: ");
		psTich.inPS();
		System.out.println("\nThuong 2 phan so la: ");
		psThuong.inPS();
		
		sc.close();
	}

}
