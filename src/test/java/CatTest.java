import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.example.Cat;

import java.util.List;

public class CatTest {

    Cat cat;

    @Before
    public void init(){
        Feline feline = new Feline();
        cat = new Cat(feline);
    }

    @Test
    public void testGetSound(){
        Assert.assertEquals("Мяу", cat.getSound());
    }

   @Test
    public void testListGetFood() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }

}
