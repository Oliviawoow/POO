
public class Main {
	public static void main(String[] args) {
        MyHashMap<MyString, Double> hashMap = new MyHashMap<>(10);

        hashMap.put(new MyString("Ollie"), 2.6);
        hashMap.put(new MyString("Olivia"), 4.5);
        hashMap.put(new MyString("Maria"), 3.9);
        hashMap.put(new MyString("Magdalena"), 1.1);
        hashMap.put(new MyString("Robert"), 2.3);
        hashMap.put(new MyString("Mihai"), 5.3);

        for (MyMapEntry<MyString, Double> currEntry : hashMap) {
            System.out.println(currEntry.getKey() + " " + currEntry.getValue());
        }
    }

}
