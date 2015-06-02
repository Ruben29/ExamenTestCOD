package examentest3ºcod;

import java.util.Arrays;
import java.util.Collection;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Suite;

/**
 *
 * @author rfernandezgonzalez
 */
@RunWith(Parameterized.class)
public class CalculoParametrosTest {

    private int res;
    Calculo calcu = new Calculo();

    @Before
    public void initialize() {

    }

    public CalculoParametrosTest(Calculo calcu, int res) {
        this.calcu = calcu;
        this.res = res;
    }

    @Parameterized.Parameters
    public static Collection MCDnumbers() {
        return Arrays.asList(new Object[][]{
            {new Calculo(40, 20), 20},
            {new Calculo(14, 7), 7},
            {new Calculo(22, 2), 2},
            //Este calculo va a dar un error
            {new Calculo(50, 15), 2}

        });
    }

    @Test
    public void testMCDnumbersChecker() {
        System.out.println("El maximo comun divisor es: " + res);
        assertEquals(res, calcu.obtenerMCD(calcu.getNumero1(), calcu.getNumero2()));
    }
}
