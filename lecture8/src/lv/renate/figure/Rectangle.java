package lv.renate.figure;

public class Rectangle {
	private float lenght = 1.0f;
	private float width = 1.0f;

	public Rectangle() {
		this.lenght = 0;
		this.width = 0;
	}

	public Rectangle(float width) {

		this.lenght = 2.2f;
		this.width = width;
	}
	
	public Rectangle(float lenght, float width){
		this.lenght = lenght;
		this.width = width;
	}

	public float getLenght() {
		return lenght;
	}

	public void setLenght(float lenght) {
		this.lenght = lenght;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}
	public String toSting(){
		return "Lenght: "+this.lenght+" Width: "+ this.width;
	}

}
