package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class PolitcaDeCredito {

public static final int TIMEOUT = 300;

/**
 *
 * PolitcaDeCredito
 *
 * @param CPF
 *
 * @author Rafael Juan Cardoso Martins
 * @since 20/03/2023, 17:14:29
 *
 */
public static Var ConsultaCPF(@ParamMetaData(description = "CPF", id = "6bef88d0") Var CPF) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"),
    Var.valueOf("CPF Valido"));
    return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @author Rafael Juan Cardoso Martins
 * @since 20/03/2023, 17:14:29
 *
 */
public static Var fa_C3_A7a_algo() throws Exception {
 return new Callable<Var>() {

   private Var item = Var.VAR_NULL;

   public Var call() throws Exception {
    item =
    Var.valueOf(ConsultaCPF(
    Var.valueOf("")));
    return Var.VAR_NULL;
   }
 }.call();
}

}

