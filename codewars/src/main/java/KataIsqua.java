import java.util.Arrays;

public class KataIsqua {
    public static double findUniq(double arr[]) {
        double res = 0;
        if (arr.length > 2) {
       for (int i = 0; i < arr.length / 2 + 1; i++) {
           if ((arr[i] != arr[arr.length- i -1]) && (arr[i] != arr[i + 1])) {
               res = arr[i];
           }
       }
       } else if (arr[0] == arr[1]) {
            res = arr[2];
        } else if (arr[0] == arr[2]) {
            res = arr [1];
        } else res = arr [0];
        return res;
    }
}
