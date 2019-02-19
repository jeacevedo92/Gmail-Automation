package co.com.proyectobase.screenplay.questions;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import co.com.proyectobase.screenplay.userinterface.GmailPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class TheAnswer implements Question<String>{

	public static TheAnswer is() {		
		return new TheAnswer();
	}

	@Override
	public String answeredBy(Actor actor) {
		
		WaitUntil.the(GmailPage.TXT_MESSAGE_SEND,isPresent()).forNoMoreThan(15).seconds();
		
		return Text.of(GmailPage.TXT_MESSAGE_SEND).viewedBy(actor).asString();
	}

}
