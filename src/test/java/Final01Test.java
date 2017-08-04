import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Final01Test {
    String N;
    Final01 final01 = new Final01();

    @Test
    public void start_game_should_love_all() {
        N = "8";
        int actualResult = final01.getResult(N);
        assertEquals(8, actualResult);
    }
}
