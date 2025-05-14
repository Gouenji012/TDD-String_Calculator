import org.incubyte.KataStringCalculatorTDD;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class KataStringCalculatorTDDTest {

    KataStringCalculatorTDD kataStringCalculatorTDD;

    @BeforeEach
    public void init() {

        kataStringCalculatorTDD = new KataStringCalculatorTDD();
    }

    @AfterEach
    public void destroy() {
        kataStringCalculatorTDD=null;
    }


}
