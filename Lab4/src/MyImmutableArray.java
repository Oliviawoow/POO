import java.util.ArrayList;

public class MyImmutableArray {
	private static ArrayList<Integer> immutableArray;
	
	public MyImmutableArray(ArrayList<Integer> im) {
		MyImmutableArray.immutableArray.addAll(im);
	}
	
	public static ArrayList<Integer> getImmutableArray() {
		return MyImmutableArray.immutableArray;
	}
}
