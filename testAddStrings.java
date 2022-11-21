package jUnitTestPackage;

import org.junit.Test;
import static org.junit.Assert.*;

public class testAddStrings {
    @Test
    public void test() {
        jUnitFunctions junitstring = new jUnitFunctions();
        String result = junitstring.addStrings("capstone", "project");
        assertEquals("capstoneproject", result);

    }
}