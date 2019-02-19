package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class GmailPage extends PageObject{
	
	
	
	public static final Target BTN_COMPOSE = Target.the("Create new mail button").located(By.className("aic"));
	public static final Target TXT_TO = Target.the("write the recipient").located(By.name("to"));
	public static final Target TXT_SUBJECT = Target.the("write the subject").located(By.name("subjectbox"));
	public static final Target TXT_MESSAGE = Target.the("area where the message is written").located(By.xpath("//div[@class='Am Al editable LW-avf']"));
	public static final Target BTN_SEND = Target.the("send email").located(By.xpath("//div[@class='T-I J-J5-Ji aoO T-I-atl L3']"));
	
	public static final Target TXT_MESSAGE_UNDO = Target.the("undo wait").located(By.xpath("//span[text()='Undo' and @style='visibility:hidden']"));
	
	public static final Target TXT_MESSAGE_SEND = Target.the("Sent messages").located(By.xpath("//span[text()='Message sent.']"));
}