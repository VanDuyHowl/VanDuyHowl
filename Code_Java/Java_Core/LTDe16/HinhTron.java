package LTDe16;

import java.lang.Math;

public class HinhTron {
	private Diem tam;
	private float r;
	
	public HinhTron() {
		tam=new Diem(0,0);
		r=0;
	}
	
	public HinhTron(Diem tam, float r) {
		this.tam=tam;
		this.r=r;
	}
	
	public float tinhCV() {
		return 2*r*(float)Math.PI;
	}
	
	public float tinhDT() {
		return r*r*(float)Math.PI;
	}
	
}
