public class TriangleTester {
    public static boolean isTriangle(int a, int b, int c){
        boolean result = false;
        if ((a + b > c) && (a + c > b) && (c + b > a)) result = true;
        return result;
    }
}
