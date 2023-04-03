package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class CEP {

public static final int TIMEOUT = 300;

/**
 *
 * CEP
 *
 * @author Rafael Juan Cardoso Martins
 * @since 20/03/2023, 17:43:00
 *
 */
public static Var ConsultaCEP() throws Exception {
 return new Callable<Var>() {

   private Var CEP = Var.VAR_NULL;
   private Var RetornoCEp = Var.VAR_NULL;

   public Var call() throws Exception {
    CEP =
    cronapi.screen.Operations.getValueOfField(
    Var.valueOf("vars.CEP"));
    RetornoCEp =
    cronapi.json.Operations.toJson(
    cronapi.util.Operations.getURLFromOthers(
    Var.valueOf("GET"),
    Var.valueOf("application/x-www-form-urlencoded"),
    Var.valueOf(
    Var.valueOf("https://viacep.com.br/ws/").getObjectAsString() +
    CEP.getObjectAsString() +
    Var.valueOf("/json/").getObjectAsString()), Var.VAR_NULL, Var.VAR_NULL, Var.VAR_NULL,
    Var.valueOf(""),
    Var.valueOf("BODY")));
    cronapi.unittest.Operations.fnAssertEquals(
    Var.valueOf("NUMBER"), Var.VAR_NULL, Var.VAR_NULL, Var.VAR_NULL);
    cronapi.util.Operations.callClientFunction(Var.valueOf("cronapi.screen.changeValueOfField"),
    Var.valueOf("Viagem.active.destino"),
    cronapi.json.Operations.getJsonOrMapField(RetornoCEp,
    Var.valueOf("localidade")));
    return Var.VAR_NULL;
   }
 }.call();
}

}

