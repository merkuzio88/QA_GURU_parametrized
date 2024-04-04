package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void setUpConfig() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://siberianhealth.com";
        Configuration.pageLoadStrategy = "eager";
    }
}