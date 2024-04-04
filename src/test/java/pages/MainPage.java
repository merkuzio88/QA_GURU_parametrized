package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private final ElementsCollection headlinesLinks = $$("div.sw21-header-nav__item");
    private final SelenideElement logo = $(".sw21-header__logo");
    private final SelenideElement banner = $(".with-video-button-banner__title");

    public MainPage openPage(String language) {
        open("https://siberianhealth.com/" + language);

        return this;
    }

    public MainPage checkingHeadlines(List<String> expectedHeadlines) {
        headlinesLinks.filter(visible).shouldHave(texts(expectedHeadlines));

        return this;
    }

    public MainPage checkingLogo() {
        logo.shouldBe(visible);

        return this;
    }

    public MainPage checkingBannerText(String expectedText) {
        banner
                .shouldBe(visible)
                .shouldHave(text(expectedText));

        return this;
    }
}
