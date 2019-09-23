package stepDefs;

import baseFunc.BaseFunc;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.HomePage;

public class TestStepDefs {
    private BaseFunc baseFunc = new BaseFunc();
    private HomePage homePage;

    private String url = "http://automationpractice.com";

    @Given("AutomationPractice Homepage")
    public void open_page() {
        baseFunc.getPage(url);
        homePage = new HomePage(baseFunc);
    }

    @When("I click on {string} tab")
    public void click_on_tab(String tabName) {
        homePage.pushOnTabBtn(tabName);
    }

    @When("I choose {string} color")
    public void choose_color(String color) {

    }
}
