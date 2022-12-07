package tests;

import configuration.ReadProperties;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class deleteMeTest {
    @Test
    public void mfgk() {
        System.out.println("удали меня");

    }

    @Test
    public void noNameTest(){
       open(ReadProperties.getUrl());
       $(By.id("name")).setValue(ReadProperties.username());
       $(By.id("password")).setValue(ReadProperties.password());
       $("#button_primary").click();

       $(By.xpath("//div[contains(text(), 'TestRail QA')]"));
    }
}
