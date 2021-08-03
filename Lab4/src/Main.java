import java.util.ArrayList;

public class Main {
	static PasswordMaker instance = PasswordMaker.getInstance("Ollie");
	public static void main(String[] args) {
		System.out.println(instance.getPassword());
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		System.out.println(MyImmutableArray.getImmutableArray());
	}
}