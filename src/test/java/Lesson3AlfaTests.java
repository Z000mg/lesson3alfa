import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class Lesson3AlfaTests {

    @BeforeAll
    static void setup(){
        Configuration.startMaximized = true;
    }

    @Test
    void depositsTest() {
        open("https://alfabank.ru/make-money/");
        $("#filter").$("div").$("div").$(byText("Депозиты")).parent().click();
        $("#more-buttons").$("div").$("a").$(byText("Архивные счета и депозиты")).parent().click();
        $("[data-test-id=tabs-list-tabTitle-1]").$$(byText("Депозиты")).find(visible).click();
        $("#filter").$$("[data-widget-name=CatalogCard]").shouldHaveSize(5);
    }

    @Test
    void insuranceDeposits () {
        open("https://alfabank.ru/make-money/");
        $(byText("Описание")).parent().sibling(1).shouldHave(text("Что такое вклад?"));
        $(byText("Что такое вклад?")).parent().preceding(0).shouldHave(text("Страхование вкладов"));
        $(byText("Что такое вклад?")).closest("button").preceding(0).shouldHave(text("Страхование вкладов"));
    }
}
