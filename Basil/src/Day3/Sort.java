package Day3;

import java.util.ArrayList;
import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>(Arrays.asList(1, 3, 4, 0, 10, 0, 8, 0, 7, 0));
        x.sort((i1,i2) -> i1.compareTo(i2));
        System.out.println(x);
    }
}
