package pages;

import baseFunc.BaseFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DressesPage {
    private BaseFunc baseFunc;
    private final By COLOR_FILTER = By.xpath(".//label[@class = 'layered_color']/a");

    public DressesPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void selectColor(String color) {
        List<WebElement> colors = baseFunc.getAllElements(COLOR_FILTER);
        for (int i = 0; i < colors.size(); i++) {
            if (colors.get(i).getText().contains(color)) {
                colors.get(i).click();
            }
        }
    }
}
