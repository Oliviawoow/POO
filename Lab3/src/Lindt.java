import java.util.Objects;

public class Lindt extends CandyBox {
	private float length;
	private float width;
	private float height;
	
	public Lindt() {
		super();
		length = 0;
		width = 0;
		height = 0;
	}
	
	public Lindt(String flavor, String origin, float length, float width, float height) {
		super(flavor, origin);
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public float getVolume() {
		return length * width * height;
	}

	@Override
	public String toString() {
		// return "Lindt [length=" + length + ", width=" + width + ", height=" + height + "]";
		return "The " + getOrigin() + " " + getFlavor() + "has volume " + getVolume();
	}
	
	public void setLength(float length) {
		this.length = length;
	}
	
	public void setWidth(float width) {
		this.width = width;
	}
	
	public void setHeight(float height) {
		this.height = height;
	}
	
	public float getLenght() {
		return length;
	}
	
	public float getWidth() {
		return width;
	}
	
	public float getHeight() {
		return height;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lindt other = (Lindt) obj;
		return Float.floatToIntBits(height) == Float.floatToIntBits(other.height)
				&& Float.floatToIntBits(length) == Float.floatToIntBits(other.length)
				&& Float.floatToIntBits(width) == Float.floatToIntBits(other.width);
	}
	
	public void printLindtDim() {
		System.out.println(length + " " + width + " " + height);
	}
}
