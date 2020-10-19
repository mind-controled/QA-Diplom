package ru.netology.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import ru.netology.data.DataHelper;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class CardDataPage {
    private SelenideElement cardNumber = $("input[type=\"text\"][placeholder=\"0000 0000 0000 0000\"]");
    private SelenideElement cardExpirationMonth = $("input[type=\"text\"][placeholder=\"08\"]");
    private SelenideElement cardExpirationYear = $("input[type=\"text\"][placeholder=\"22\"]");
    private SelenideElement holder = $("form > fieldset > div:nth-child(3) > span > span:nth-child(1) > span > span > span.input__box > input");
    private SelenideElement cvcCode = $("input[type=\"text\"][placeholder=\"999\"]");
    private SelenideElement successNotification = $(withText("Успешно"));
    private SelenideElement errorNotification = $(withText("Ошибка"));
    private SelenideElement buttonContinue = $(withText("Продолжить"));
    private SelenideElement wrongFormatNotification = $(".input__sub");

    public void fillCardInformationForSelectedWay(DataHelper.CardInformation cardInformation) {
        cardNumber.setValue(cardInformation.getNumber());
        cardExpirationMonth.setValue(cardInformation.getMonth());
        cardExpirationYear.setValue(cardInformation.getYear());
        holder.setValue(cardInformation.getHolder());
        cvcCode.setValue(cardInformation.getCvc());
        buttonContinue.click();
    }

    public void checkIfPaymentSuccessful() {
        successNotification.waitUntil(Condition.visible, 15000);
    }

    public void checkIfPaymentNotSuccessful() {
        errorNotification.waitUntil(Condition.visible, 15000);
    }

    public void checkIfWrongFormatOfField() {
        wrongFormatNotification.shouldBe(Condition.visible);
    }
}