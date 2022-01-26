package Retangle;

public class Retangle {
	float length;
	float width;
	
	Retangle(){}
	
	Retangle(float length, float width){
		this.length = length;
		this.width = width;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}
	
	public void getArea() {
		float Area = width * length;
		System.out.println("Dien tich hinh chu nhat la: " + Area);
	}
	
	public String toString() {
		return "Chieu dai la: " + this.length + " Chieu rong la: " + this.width;
	}
	
}
