package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.GoogleHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task{
	
	private String user;
	private String password;
	
	public Login(String user,String pass) {
		super();
		this.user = user;
		this.password = pass;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(user).into(GoogleHomePage.TXT_USER));
		actor.attemptsTo(Click.on(GoogleHomePage.BTN_NEXT));
	
		actor.attemptsTo(Enter.theValue(password).into(GoogleHomePage.TXT_PASS));
		actor.attemptsTo(Click.on(GoogleHomePage.BTN_NEXT2));
		
	}
	
	public static Login InGmail(String user, String password) {
		return Tasks.instrumented(Login.class,user,password);
	}

}
