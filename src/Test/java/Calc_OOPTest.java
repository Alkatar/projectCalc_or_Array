import org.junit.Assert;
import org.junit.Test;


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


    @Test (expected = java.lang.Exception.class)
    public void division_by_zero_check() throws Exception {
        Calc_OOP calc = new Calc_OOP();
        calc.calc(5,0,'/');
    }

}