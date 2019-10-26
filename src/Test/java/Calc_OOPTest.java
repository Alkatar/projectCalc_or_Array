import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.Assert.assertThat;


public class Calc_OOPTest {


    @Test
    public void multiplication_check() throws Exception {
        Calc_OOP calc = new Calc_OOP();
        Assert.assertEquals("Деление работает некорректно",10, calc.calc(5,2,'*'), 0);

    }
    @Test
    public void sum_check() throws Exception{
        Calc_OOP calc = new Calc_OOP();
        Assert.assertEquals("Сложение работает некорректно",7, calc.calc(5,2,'+'), 0);

    }
    @Test
    public void subtraction_check() throws Exception{
        Calc_OOP calc = new Calc_OOP();
        Assert.assertEquals("Вычитание работает некорректно",3, calc.calc(5,2,'-'), 0);

    }


   // @Rule
   // public ExpectedException exception  = ExpectedException.none();

    @Test (expected = java.lang.Exception.class)
    public void division_by_zero_check() throws Exception {
        Calc_OOP calc = new Calc_OOP();
      //  exception.expect(NumberFormatException.class);
       // exception.expectMessage(calc.main());
        try {
            calc.calc(5,0,'/');
            fail("Expected NumberFormatException");
        } catch (NumberFormatException ex) {
            assertThat(ex.getMessage(), containsString("Деление на ноль запрещено!"));
        }
    }

}