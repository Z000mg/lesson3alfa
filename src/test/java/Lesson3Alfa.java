import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

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
        $("#filter");
        $(By.linkText("Депозиты");

        open("https://alfabank.ru/make-money/");
    }
}
