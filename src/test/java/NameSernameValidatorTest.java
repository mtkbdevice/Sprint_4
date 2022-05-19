import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class NameSernameValidatorTest {

    private final String nameSurname;
    private final boolean expectedResult;

    public NameSernameValidatorTest(String nameSurname, boolean expectedResult){
        this.nameSurname = nameSurname;
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
        Account account = new Account(nameSurname);
        boolean actualResult = account.checkNameToEmboss();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
