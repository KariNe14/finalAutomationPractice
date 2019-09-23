package pages;

import baseFunc.BaseFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
    private BaseFunc baseFunc;
    private final By TABS = By.xpath(".//div[@id = 'block_top_menu']/ul/li/a");

    public HomePage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void pushOnTabBtn(String tabName) {
        List<WebElement> tabs = baseFunc.getAllElements(TABS);
        for (int i = 0; i < tabs.size(); i++) {
            if (tabs.get(i).getAttribute("title").equals(tabName)) {
                tabs.get(i).click();
            }
        }
    }
}
