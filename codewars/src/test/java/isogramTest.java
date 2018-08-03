import org.junit.Test;

import static org.junit.Assert.*;

public class isogramTest {
    @Test
    public void FixedTests() {
        assertEquals(isogram.isIsogram("Dermatoglyphics"), true);
        assertEquals(isogram.isIsogram("isogram") , true);
        assertEquals(isogram.isIsogram("moose") , false);
        assertEquals(isogram.isIsogram("isIsogram") , false);
        assertEquals(isogram.isIsogram("aba") , false);
        assertEquals(isogram.isIsogram("moOse") , false);
        assertEquals(isogram.isIsogram("thumbscrewjapingly") , true);
        assertEquals(isogram.isIsogram("") , true);
    }
}