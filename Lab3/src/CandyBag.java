import java.util.ArrayList;

public class CandyBag {
	ArrayList<CandyBox> bag;
	
	public CandyBag() {
		bag =  new ArrayList<CandyBox>();
	}
	
	public CandyBag(ArrayList<CandyBox> b) {
		bag =  new ArrayList<CandyBox>();
		for (int i = 0; i < b.size(); i++) {
			bag.add(b.get(i));
		}
	}

	public ArrayList<CandyBox> getBag() {
		return bag;
	}

	public void setBag(ArrayList<CandyBox> bag) {
		this.bag = bag;
	}
}
