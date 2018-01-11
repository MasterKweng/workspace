package demo;

public class Volumn {
	private float l;
	private float w;
	private float h;
	public Volumn (float l,float w,float h){
		this.setLong(l);
		this.setWidth(w);
		this.setHeight(l);
	}

	private void setLong(float l) {
		this.l=l;		
	}
	private float getLong(float l) {
		return l;		
	}
	private void setWidth(float w) {
		this.w=w;
	}
	private float getWidth(float w) {
		return w;		
	}
	private void setHeight(float h) {
		this.h=h;
	}
	private float getHeight(float h) {
		return h;		
	}
	/*
	 * 计算体积的方法
	 */
	public float Volumn1(float l,float w,float h) {
		float v=l*w*h;
		return v;		
	}

			
}



