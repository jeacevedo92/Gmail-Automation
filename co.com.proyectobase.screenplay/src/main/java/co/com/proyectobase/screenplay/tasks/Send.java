package co.com.proyectobase.screenplay.tasks;

import java.util.List;

import co.com.proyectobase.screenplay.model.Email;
import co.com.proyectobase.screenplay.userinterface.GmailPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Send implements Task{
	
	private List<Email> data;
	
    public Send(List<Email> data) {
    	this.data = data;
    }


	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(GmailPage.BTN_COMPOSE));
		
		actor.attemptsTo(Click.on(GmailPage.TXT_TO));
		
		actor.attemptsTo(Enter.theValue(data.get(0).getReceiver()).into(GmailPage.TXT_TO));
		actor.attemptsTo(Enter.theValue(data.get(0).getSubject()).into(GmailPage.TXT_SUBJECT));
		
		actor.attemptsTo(Click.on(GmailPage.TXT_MESSAGE));
		actor.attemptsTo(Enter.theValue(data.get(0).getMessage()).into(GmailPage.TXT_MESSAGE));
		
		actor.attemptsTo(Click.on(GmailPage.BTN_SEND));
	}
	
	public static Send mail(List<Email> email) {
		return Tasks.instrumented(Send.class,email);
	}
	

}
