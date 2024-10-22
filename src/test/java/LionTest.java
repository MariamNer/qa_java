import com.example.Feline;
import com.example.Lion;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getkittensTest() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        Mockito.when(feline.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFoodSamkaTest() throws Exception{
        Lion lion = new Lion(feline, "Самка");
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expected);
        assertEquals(expected, lion.getFood());
    }

    @Test
    public void getFoodSamecTest() throws Exception{
        Lion lion = new Lion(feline, "Самец");
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expected);
        assertEquals(expected, lion.getFood());
    }

    @Test
    public void throwExceptionTest() throws Exception {
        Exception exception = assertThrows(Exception.class, () -> {
            Lion lion = new Lion(feline, "");
        }
        );
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

    @Test
    public void throwExceptionSexTest() throws Exception {
        Exception exception = assertThrows(Exception.class, () -> {
                    Lion lion = new Lion("");
                }
        );
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

}
