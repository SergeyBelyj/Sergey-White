import static java.lang.Math.*;

public class AreSame {
    public static boolean comp(int[] a, int[] b) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] * a [i] == b[j]) {
                    sum++;
                    break;
                }
            }
        }
        if (sum == a.length) {
            return true;
        } else return false;

    }
}
