import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class NameSernameValidatorTest {

    private final String nameSername;
    private final boolean expectedResult;

    public NameSernameValidatorTest(String nameSername, boolean expectedResult){
        this.nameSername = nameSername;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] dataForTest() {
        return new Object[][] {
                {"Franzz Kafka", true},
                {"Fr", false},
                {"Frannnnnnz Kaaaaaaaf", false},
                {"FranzzKafka", false},
                {"Franzz  Kafka", false},
                {" FranzzKafka", false},
                {"FranzzKafka ", false},
        };
    }

    @Test
    public void nameSernameFieldFillingTest(){
        Account account = new Account(nameSername);
        boolean actualResult = account.checkNameToEmboss();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
