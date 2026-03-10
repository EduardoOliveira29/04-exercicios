package exercicio03;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner entrada=new Scanner(System.in);
    static BilheteUnico BilheteUnico;

    static {
        System.out.println("Digite seu nome:");
        String usuario=entrada.nextLine();
        System.out.println("Digite o seu tipo de tarifa:(Professor, normal ou estudante)");
        String tipoTarifa=entrada.next();
        BilheteUnico=new BilheteUnico(usuario,tipoTarifa);
    }

    public static void main(String[] args) {
        int opcao;


        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1-Carregar bilhete | 2-Consultar saldo | 3-Passar na catraca | 4-Finalizar");
            opcao = entrada.nextInt();

                switch (opcao) {
                    case 1->carregarBilhete();
                    case 2->consultarSaldo();
                    case 3->passarCatraca();
                    case 4-> System.out.println("Obrigado por usar o nosso app!");
                    default -> System.out.println("Opção inválida!");
                }

            }while (opcao!=4);

    }
    private static void carregarBilhete(){
        System.out.println("Digite o valor que deseja carregar:");
        double valor= entrada.nextDouble();
        BilheteUnico.carregarBilhete(valor);

    }
    private static void consultarSaldo(){
        System.out.println("Saldo atual: R$"+BilheteUnico.saldo);
    }
    private static void passarCatraca(){
        System.out.println("----------------------");
        if (!BilheteUnico.passarCatraca()){
            System.out.println("Saldo insuficiente!");
        }
        consultarSaldo();
        System.out.println("----------------------");
    }
}
