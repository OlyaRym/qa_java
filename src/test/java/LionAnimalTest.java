import com.example.Feline;
import com.example.Lion;
import com.example.WithKittens;
import org.junit.Test;

import static org.junit.Assert.*;

public class animalTest {

    @Test
    public void lionMaleTest() throws Exception {
        Lion lion = new Lion("Самец");
        assertTrue("hasMane", lion.doesHaveMane());
    }

    @Test
    public void lionFemaleTest() throws Exception {
        Lion lion = new Lion("Самка");
        assertFalse("hasMane", lion.doesHaveMane());
    }
    @Test
     public void lionExceptionTest() throws Exception {
         Lion lion = new Lion("неизвестный");

    }
   @Test
    public void lionGetKitten() throws Exception {
       Lion lion = new Lion("Самец");
       lion.getKittens();
    }
   @Test
   public void lionGetFoodTom() throws Exception {
    Lion lion = new Lion("Самец");
    lion.getFood();
    }
}
