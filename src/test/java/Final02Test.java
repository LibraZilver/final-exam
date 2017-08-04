import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Final02Test {
    Final02 final02 = new Final02();

    @Test
    public void test01() {
        int actualResult = final02.getResult(1);
        assertEquals(100, actualResult);
    }
}
