package exercicio03;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        String usuario;
        String tipoTarifa;


        System.out.println("Digite seu nome");
        usuario=entrada.next();
        System.out.println("Digite o seu tipo de tarifa:");
        tipoTarifa=entrada.next();

        BilheteUnico BilheteUnico=new BilheteUnico(usuario,tipoTarifa);
    }
}
