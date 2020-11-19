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
        //На страничке "Вклады" (https://alfabank.ru/make-money/) перейти на подстраничку "Депозиты" (https://alfabank.ru/make-money/deposits/)
        open("https://alfabank.ru/make-money/");
        $("#filter").$("div").$("div").$(byText("Депозиты")).parent().click();

        //- Перейти по линку на "Архивные депозиты" (https://alfabank.ru/make-money/archive/)
        $("#more-buttons").$("div").$("a").$(byText("Архивные счета и депозиты")).parent().click();
        $("[data-test-id=tabs-list-tabTitle-1]").$$(byText("Депозиты")).find(Condition.visible).click();
        $("#filter").$$("[data-widget-name=CatalogCard]").shouldHaveSize(5);
        del
    }
}
