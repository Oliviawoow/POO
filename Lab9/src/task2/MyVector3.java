package task2;

public class MyVector3 implements Sumabil {
    private int[] arr;

    MyVector3(int t1, int t2, int t3) {
        arr = new int[3];

        arr[0] = t1;
        arr[1] = t2;
        arr[2] = t3;
    }

    @Override
    public String toString() {
        String str = "";

        for (int i = 0; i < 3; ++i) {
            str += arr[i] + " ";
        }

        return str;
    }

    @Override
    public void addValue(Sumabil value) {
        for (int i = 0; i < 3; ++i) {
            arr[i] += ((MyVector3)value).arr[i];
        }
    }

}
