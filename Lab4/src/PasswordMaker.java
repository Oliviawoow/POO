import java.util.Random;

public class PasswordMaker {
	public final int MAGIC_NUMBER = 7;
	public final String MAGIC_STRING = new RandomStringGenerator(20,"ABCDEFGHIJKLMNOPQRSTUVWXYZ").next();
	public String name;
	
	 private static PasswordMaker instance = null;
	
	private PasswordMaker(String name) {
		this.name = name;
	}
	
	public static PasswordMaker getInstance(String name) {
	      if(instance == null) {
	          instance = new PasswordMaker(name);
	      }
	      return instance;      
	   }
	
	public String getPassword() {
		String rezultat = new RandomStringGenerator(MAGIC_NUMBER,"ABCDEFGHIJKLMNOPQRSTUVWXYZ").next();
		rezultat += new RandomStringGenerator(10, MAGIC_STRING).next();
		rezultat += name;
		Random rn = new Random();
		int number = rn.nextInt(100 - 1 + 1) + 1;
		rezultat += String.valueOf(number);
		return rezultat;
	}
}