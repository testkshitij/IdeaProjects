import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestClass
{

    @Test
    public void setup()
    {
        Reporter.log("Hiii",true);
    }

    @Test
    public void teardown()
    {
        Reporter.log("Byyyeeee",false);
    }
}
