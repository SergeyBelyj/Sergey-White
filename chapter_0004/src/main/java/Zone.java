import java.util.Arrays;
import java.util.List;

public class Zone {
    public static void badMethod() throws Exception {
    }

    public static interface Wrapper<T> {
        T get();

        void set(T value);

        boolean isEmpty();
    }

    public static void main(String[] args) throws Exception {
        List<String> names = Arrays.asList("Petr", "Nick", "Ban");
        Wrapper<Exception> ex = null;
        names.forEach(
                n -> {
                    try {
                        badMethod();
                    } catch (Exception e) {
                        ex.set(e);
                    }
                }
        );
        if (!ex.isEmpty()) {
            throw ex.get();
        }
    }
}
