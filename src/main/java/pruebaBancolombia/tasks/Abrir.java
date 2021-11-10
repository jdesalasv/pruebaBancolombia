package pruebaBancolombia.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import pruebaBancolombia.usersinterface.PaginaBancolombia;


public class Abrir implements Task {

    private PaginaBancolombia paginaBancolombia;

    public static Abrir laPagina(){

        return Tasks.instrumented(Abrir.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor){

        actor.attemptsTo(Open.browserOn(paginaBancolombia));

    }

}
