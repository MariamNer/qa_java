import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;
import com.example.Feline;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


public class FelineTest {

    @Test
    public void getFamilyTest(){
        Feline feline = new Feline();
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensTest(){
        Feline feline = new Feline();
        int kittensCount = 1;
        Assert.assertEquals(kittensCount, feline.getKittens());
    }
    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.getFood("Хищник"));
    }


}
