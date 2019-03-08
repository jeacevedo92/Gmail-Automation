package co.com.Gmail.screenplay.tasks;

import co.com.Gmail.screenplay.userinterface.GoogleHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task{
	
	private GoogleHomePage googleHomePage;

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(googleHomePage));
		
	}
	
	public static Abrir GooglePage() {
		return Tasks.instrumented(Abrir.class);
	}
	

}
