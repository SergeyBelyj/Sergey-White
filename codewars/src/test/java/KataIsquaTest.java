import org.junit.Test;

import static org.junit.Assert.*;

public class KataIsquaTest {
    private double precision = 0.0000000000001;

    @Test
    public void sampleTestCases() {
    //    assertEquals(0.0, KataIsqua.findUniq(new double[]{0, 1, 0,}), precision);
        assertEquals(2.0, KataIsqua.findUniq(new double[]{1, 1, 1, 2, 1, 1}), precision);
    }
}
