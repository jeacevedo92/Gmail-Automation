package co.com.proyectobase.screenplay.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import org.openqa.selenium.WebDriver;

import co.com.proyectobase.screenplay.model.Email;
import co.com.proyectobase.screenplay.questions.TheAnswer;
import co.com.proyectobase.screenplay.tasks.Abrir;
import co.com.proyectobase.screenplay.tasks.Login;
import co.com.proyectobase.screenplay.tasks.Send;


public class SendEmailStepDefinitions {
	
	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor jhon = Actor.named("Jhon");
	
	@Before
	public void initialSetup() {
		jhon.can(BrowseTheWeb.with(hisBrowser));
	}	
	
	@Given("^Jhon want to send an email in an automated way$")
	public void jhonWantToSendAnEmailInAnAutomatedWay(){
	    jhon.wasAbleTo(Abrir.GooglePage());
	}

	@When("^he login with user \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void heLoginWithUserAndPassword(String user, String pass){
	   jhon.attemptsTo(Login.InGmail(user,pass));		
	}
	
	@When("^he send the mail$")
	public void heSendTheMail(List<Email> email) {			
		jhon.attemptsTo(Send.mail(email));	   
	}

	@Then("^he verify the correct sending of the email$")
	public void heVerifyTheCorrectSendingOfTheEmail(){
	  jhon.should(seeThat(TheAnswer.is(),equalTo("Message sent.")));
	}

}
