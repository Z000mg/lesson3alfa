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
1
        open("https://alfabank.ru/make-money/");
    }
}
