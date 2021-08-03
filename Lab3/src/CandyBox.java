import java.util.Objects;

public class CandyBox {
	private String flavor;
	private String origin;
	
	public CandyBox() {
		flavor = "";
		origin = "";
	}
	
	public CandyBox(String flavor, String origin) {
		this.flavor = flavor;
		this.origin = origin;
	}
	
	public float getVolume() {
		return 0;
	}

	@Override
	public String toString() {
		return "CandyBox: [flavor=" + flavor + ", origin=" + origin + "]";
	}
	
	public String getFlavor() {
		return flavor;
	}
	
	public String getOrigin() {
		return origin;
	}
	
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CandyBox other = (CandyBox) obj;
		return Objects.equals(flavor, other.flavor) && Objects.equals(origin, other.origin);
	}
	
	
}
