package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import objectReposity.HomepageReposityRia;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(Cucumber.class)
public class HomeRia extends Base {
    WebDriver driver;
    HomepageReposityRia homepageria;


    @Given("^the user enter text$")
    public void the_user_enter_text() throws Throwable {
        homepageria.waitpage();
        homepageria.pageria();
        homepageria.textcenter().click();
        homepageria.textcenter().clear();
        homepageria.buttonpublish().click();
    }

    @Then("^the result is correct empty$")
    public void the_result_is_correct_empty() throws Throwable {
        String resulttext = homepageria.textresult().getText();
        System.out.println(resulttext);
        if (resulttext.equals("There was nothing to post. Go back!")) {
            System.out.println("\n" +
                    "correct select ");
        } else {
            System.out.println("\n" +
                    "select show Missing");

        }
        homepageria.driverclose();
    }

    @Given("^the user enter text valid$")
    public void the_user_enter_text_valid() throws Throwable {
        homepageria.pageria();
        homepageria.textcenter().sendKeys("test");
        homepageria.buttonpublish().click();
    }

    @Then("^the text result is correct$")
    public void the_text_result_is_correct() throws Throwable {
        String resulttext2 = homepageria.textresult2().getText();
        System.out.println(resulttext2);
        if (resulttext2.equals("test")) {
            System.out.println("\n" +
                    "correc select");
        } else {
            System.out.println("\n" +
                    "select show Missing");

        }
        homepageria.driverclose();
    }


    @Given("^user enters text and makes it bold$")
    public void user_enters_text_and_makes_it_bold() throws Throwable {
        homepageria.pageria();
        homepageria.textcenter().sendKeys("This is a **Test** Case");
        homepageria.buttonpublish().click();
        // String resulttext3 = homepageria.textresult2().getText();
        String resulttext3 = homepageria.textresult2().getText();
        String[] splited = resulttext3.split(" ");
        splited = resulttext3.split(" ");
        CharSequence splited1 = splited[0];
        CharSequence splited2 = splited[1];
        CharSequence splited3 = splited[2];
        CharSequence splited4 = splited[3];
        System.out.println("\u001B[30m" + splited4);
    }


    @Given("^enter the home page$")
    public void enter_the_home_page() throws Throwable {
        driver = initializeDriver();
        homepageria = new HomepageReposityRia(driver);
        homepageria.pageria();
    }

    @When("^user enters text and makes it bold test (.+)$")
    public void user_enters_text_and_makes_it_bold_test(String text) throws Throwable {
        homepageria.textcenter().sendKeys(text);
        homepageria.buttonpublish().click();
    }

    @Then("^the result is correct$")
    public void the_result_is_correct() throws Throwable {
        String resulttext4 = homepageria.textresult2().getText();
        System.out.println(resulttext4);
        homepageria.captureScreenShot(driver);
        homepageria.driverclose();
    }
}



