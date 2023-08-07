package com.github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class EnterprisePage {
    @Test
    void openEnterprisePage() {
        open("https://github.com/");
        $(".header-menu-wrapper").$(byText("Solutions")).hover();
        $("#solutions-for-heading").parent().$(byText("Enterprise")).click();
        $(".application-main h1").shouldHave(text("Build like the best"));
    }
}
