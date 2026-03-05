package exercicio03;

import java.util.Random;

public class BilheteUnico {
    int numero;
    String usuario;
    double saldo;
    final static double TARIFABASE=5.40;
    String tipoTarifa;



    public BilheteUnico(String usuario, String tipoTarifa){
        Random r = new Random();
        this.usuario=usuario;
        this.tipoTarifa=tipoTarifa;
        this.numero=r.nextInt(1000,9999);
    }

    public void passarCatraca(){
        double valor = TARIFABASE;
        if (tipoTarifa.equalsIgnoreCase("estudante")||tipoTarifa.equalsIgnoreCase("professor")){
            valor=TARIFABASE/2;
        }

        if (saldo<valor){
            return;
        }

        saldo=saldo-valor;

    }
}
