package pruebaBancolombia.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pruebaBancolombia.tasks.Abrir;

public class pruebaBancolombiaStepdefinition {

    @Before
    public void setStage(){

        OnStage.setTheStage(new OnlineCast());

    }

    @Given("^Jahaziel necesita entrar a Bancolombia$")
    public void jahazielNecesitaEntrarABancolombia() {

        OnStage.theActorCalled("Jahaziel").wasAbleTo(Abrir.laPagina());

    }

    @When("^ingregar a la seccion donde se cambia la tasa de interes$")
    public void ingregarALaSeccionDondeSeCambiaLaTasaDeInteres() {

    }

    @Then("^validar que la informacion es correcta$")
    public void validarQueLaInformacionEsCorrecta() {

    }

}
