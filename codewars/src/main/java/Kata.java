import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Kata {
    public static String HighAndLow(String numbers) {
        String[] subStr;
        String del = " ";
        subStr = numbers.split(del);
        int[] mass = new int[subStr.length];
        for (int index = 0; index < mass.length; index++) {
            mass[index] = Integer.parseInt(subStr[index]);
        }
        Arrays.sort(mass);
        String result = mass[mass.length - 1] + del;
        result = result + mass[0];
        return result;
    }
}
