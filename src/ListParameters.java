import Utility.BaseDriver;
import Utility.Parent;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ListParameters extends Parent {

    public ListParameters() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//*[@tabindex='0']")
    public List<WebElement> locations;
}