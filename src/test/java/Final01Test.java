import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class Final01Test {
    Final01 final01 = new Final01();

    @Test
    public void test01() {
        String  actualResult = final01.getResult("8");
        assertEquals("8", actualResult);
    }
    @Test
    public void test02() {
        String  actualResult = final01.getResult("9");
        assertEquals("9", actualResult);
    }

    @Test
    public void test03() {
        String  actualResult = final01.getResult("132");
        assertEquals("129", actualResult);
    }

    @Test
    public void test04() {
        String  actualResult = final01.getResult("1110");
        assertEquals("999", actualResult);
    }
    @Test
    public void test05() {
        String  actualResult = final01.getResult("653161544328834085");
        assertEquals("599999999999999999", actualResult);
    }
    @Test
    public void test06() {
        String  actualResult = final01.getResult("111111111111111110");
        assertEquals("99999999999999999", actualResult);
    }
}
