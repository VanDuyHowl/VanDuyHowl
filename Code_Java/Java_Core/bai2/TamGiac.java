package bai2;

public class TamGiac {
	private Diem A;
	private Diem B;
	private Diem C;
	
	//khai bao bien
	private float AB;
	private float BC;
	private float CA;
	
	//constructor 1
	public TamGiac() {
		
	}
	
	//constructor 2
	public TamGiac(Diem A,Diem B,Diem C) {
		//Khai bao diem
		this.A = A;
		this.B = B;
		this.C = C;
		
		//Tinh kc
		AB = A.kc(B);
		BC = B.kc(C);
		CA = C.kc(A);
		
	}
	//Tinh chu vi
	public float chuVi() {
		return AB + BC + CA;
	}
	
	//Tinh dien tich
	public float dienTich() {
		//Tinh nua chu vi
		float p = (AB + BC + CA) / 2;
		
		return (float)Math.sqrt(p * (p - AB) * (p - BC) * (p - CA));
	}
	
	
}

