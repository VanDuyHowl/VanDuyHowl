package LTDe16;

import java.lang.Math;

public class Diem {
	private float x;
	private float y;
	
	public Diem() {
		x=0;
		y=0;
	}
	
	public Diem(float x,float y) {
		this.x=x;
		this.y=y;
	}
	
	public float kc (Diem d) 
	{
		float kc = (float)Math.sqrt((x - d.x) * (x - d.x) + (y - d.y) * (y - d.y));
		return kc;
	}
	
	public void inDiem() 
	{
		System.out.println ("(" + x + "," + y +")");
	}
	
}
