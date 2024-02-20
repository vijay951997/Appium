package stepdefs;

import io.cucumber.java.en.And;

public class BaseTest extends DriverUtil {

    @And("^I login as user through login page$")
    public void iLoginAsUserThroughLoginPage() throws Exception {
        DriverUtil.initializeDriver();
    }


//    public void beforeTest() throws Exception {
//       DriverUtil.initializeDriver();
//
//    }




}
