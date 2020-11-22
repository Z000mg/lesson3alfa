import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class Lesson3Alfa {

    @BeforeAll
    static void setup(){
        Configuration.startMaximized = true;
    }

    @Test
    void lesson3Alfa() {

        open("https://alfabank.ru/make-money/");
        $("#filter").$("div").$("div").$(byText("Депозиты")).parent().click();
        $("#more-buttons").$("div").$("a").$(byText("Архивные счета и депозиты")).parent().click();
        $("[data-test-id=tabs-list-tabTitle-1]").$$(byText("Депозиты")).find(Condition.visible).click();
        $("#filter").$$("[data-widget-name=CatalogCard]").shouldHaveSize(5);
        }
}
