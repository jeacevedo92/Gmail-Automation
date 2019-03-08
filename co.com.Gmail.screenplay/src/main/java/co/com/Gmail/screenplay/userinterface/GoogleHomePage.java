package co.com.Gmail.screenplay.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.By;

import net.serenitybdd.screenplay.targets.Target;

import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.google.com/gmail")
public class GoogleHomePage extends PageObject{
	
	public static final Target TXT_USER = Target.the("Input User").located(By.id("identifierId"));
	public static final Target BTN_NEXT = Target.the("next button in user").located(By.xpath("//div[@id='identifierNext']/content/span"));
	public static final Target TXT_PASS = Target.the("Input Password").located(By.name("password"));
	public static final Target BTN_NEXT2 = Target.the("Next button in password").located(By.xpath("//div[@id='passwordNext']/content/span"));
}
