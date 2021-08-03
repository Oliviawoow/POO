package task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Main {
    private static void addAll(Collection<? extends Sumabil> summable) {
        Iterator<? extends Sumabil> it = summable.iterator();

        try {
        	Sumabil firstElem = it.next();

            while (it.hasNext()) {
                firstElem.addValue(it.next());
            }
            System.out.println(firstElem);
        } catch (NoSuchElementException e) {
            System.out.println("Empty collection!");
        }
    }

    public static void main(String[] args) {

        MyMatrix m1 = new MyMatrix(1, 2, 3 , 4,
        		1, 2, 3 , 4,
        		1, 2, 3 , 4,
        		1, 2, 3 , 4);

        ArrayList<Sumabil> summales = new ArrayList<>();
        summales.add(m1);
        summales.add(m1);

        addAll(summales);

        MyVector3 v1 = new MyVector3(1, 2, 3);

        summales.clear();
        summales.add(v1);
        summales.add(v1);

        addAll(summales);
    }
}