import java.util.Objects;

public class ChocAmor extends CandyBox {
	private float length;
	
	public ChocAmor() {
		super();
		length = 0;
	}
	
	public ChocAmor(String flavor, String origin, float length) {
		super(flavor, origin);
		this.length = length;
	}
	
	public float getVolume() {
		return length * length * length;
	}
	
	@Override
	public String toString() {
		return "The " + getOrigin() + " " + getFlavor() + "has volume " + getVolume();
	}
	
	public void setLength(float length) {
		this.length = length;
	}
	
	public float getLength() {
		return length;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChocAmor other = (ChocAmor) obj;
		return Float.floatToIntBits(length) == Float.floatToIntBits(other.length);
	}
	
	public void printChocAmorDim() {
		System.out.println(length);
	}
}
