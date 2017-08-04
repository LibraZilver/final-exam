import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class Final01Test {
    Final01 final01 = new Final01();

    @Test
    public void test01() {
        int  actualResult = final01.getResult(8);
        assertEquals(8, actualResult);
    }
    @Test
    public void test02() {
        int  actualResult = final01.getResult(10);
        assertEquals(9, actualResult);
    }

    @Test
    public void test03() {
        int  actualResult = final01.getResult(132);
        assertEquals(129, actualResult);
    }

    @Test
    public void test04() {
        int  actualResult = final01.getResult(1110);
        assertEquals(999, actualResult);
    }
}
