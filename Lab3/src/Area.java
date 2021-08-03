
public class Area {
	private CandyBag present;
	private int number;
	private String street;
	
	public Area() {
		this.present = new CandyBag();
		this.number = 0;
		this.street = "";
	}
	
	public Area(CandyBag c, int n, String s) {
		this.present = new CandyBag(c.getBag());
		this.number = n;
		this.street = s;
	}
	
	public void getBirthdayCard() {
		System.out.println(street + number);
		System.out.println("La multi ani!");
		System.out.println("-------------");
		for (int i = 0; i < present.getBag().size(); i ++) {
			present.getBag().get(i).toString();
			if (present.getBag().get(i) instanceof ChocAmor) {
				((ChocAmor) present.getBag().get(i)).printChocAmorDim();
			} else if (present.getBag().get(i) instanceof Lindt) {
				((Lindt) present.getBag().get(i)).printLindtDim();
			} else if (present.getBag().get(i) instanceof Baravelli) {
				((Baravelli) present.getBag().get(i)).printBaravelliDim();
			}
		}
		
	}
}
