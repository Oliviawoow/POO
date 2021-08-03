import java.util.Objects;

public class Baravelli extends CandyBox {
	private float radius;
	private float height;
	private float  pi = 3.14f;
	
	public Baravelli() {
		super();
		radius = 0;
		height = 0;
	}
	
	public Baravelli(String flavor, String origin, float radius, float height) {
		super(flavor, origin);
		this.radius = radius;
		this.height = height;
	}
 	
	public float getVolume() {
		return pi * (radius * radius) * height;
	}
	
	@Override
	public String toString() {
		return "The " + getOrigin() + " " + getFlavor() + "has volume " + getVolume();
	}
	
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	public void setHeight(float height) {
		this.height = height;
	}
	
	public float getRadius() {
		return radius;
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
		Baravelli other = (Baravelli) obj;
		return Float.floatToIntBits(height) == Float.floatToIntBits(other.height)
				&& Float.floatToIntBits(pi) == Float.floatToIntBits(other.pi)
				&& Float.floatToIntBits(radius) == Float.floatToIntBits(other.radius);
	}
	
	public void printBaravelliDim() {
		System.out.println(radius + " " + height);
	}
}
