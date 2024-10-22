import org.junit.Test;
import com.example.Lion;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionSexManeParameterizedTest {

    private final boolean doesHaveMane;
    private final String sex;


    public LionSexManeParameterizedTest(boolean doesHaveMane, String sex) {
        this.doesHaveMane = doesHaveMane;
        this.sex = sex;
    }

    @Parameterized.Parameters
    public static Object[][] getLion() {
        return new Object[][] {
                {true, "Самец"},
                {false, "Самка"},
        };
    }

    @Test
    public void testGetLion() throws Exception {
        Lion lion = new Lion(sex);
        boolean actual = lion.doesHaveMane();
        assertEquals(doesHaveMane, actual);

    }

}
