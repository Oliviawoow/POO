package task2;
import java.util.Scanner;

public class MyMatrix implements Sumabil {
    private int[][] m;

    MyMatrix(int t1, int t2, int t3, int t4,
    		int t11, int t22, int t33, int t44,
    		int t111, int t222, int t333, int t444,
    		int t1111, int t2222, int t3333, int t4444) {
        m = new int[4][4];
        
        m[0][0] = t1;
        m[0][1] = t2;
        m[0][2] = t3;
        m[0][3] = t4;
        
        m[0][0] = t11;
        m[0][1] = t22;
        m[0][2] = t33;
        m[0][3] = t44;
        
        m[0][0] = t111;
        m[0][1] = t222;
        m[0][2] = t333;
        m[0][3] = t444;
        
        m[0][0] = t1111;
        m[0][1] = t2222;
        m[0][2] = t3333;
        m[0][3] = t4444;
    }

    @Override
    public String toString() {
        String str = "";

        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                str += m[i][j] + " ";
            }
            str += "\n";
        }

        return str.substring(0, str.length() - 1);
    }

    @Override
    public void addValue(Sumabil value) {
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                m[i][j] += ((MyMatrix)value).m[i][j];
            }
        }
    }
}
