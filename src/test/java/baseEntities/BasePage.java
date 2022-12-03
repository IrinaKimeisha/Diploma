package baseEntities;


import com.codeborne.selenide.SelenideElement;
import configuration.ReadProperties;

import static com.codeborne.selenide.Selenide.open;

public abstract class BasePage {
    protected abstract SelenideElement getPageIdentifier();

    public void openPageByUrl(String pagePath) {
        open(ReadProperties.getUrl() + pagePath);
    }
}
