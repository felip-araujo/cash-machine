import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        int saldo = 150;
        boolean iniciar = true;

        while (iniciar == true) {
            // adiciona um objeto scanner para ler a entrada do usuário
            Scanner menu = new Scanner(System.in);
            System.out.println("[1] - Saldo: | [2] Depositar | [3] Saque | [4] Encerrar ");
            int selecionado = Integer.parseInt(menu.nextLine());

            if (selecionado == 1) {
                System.out.println("O Seu Saldo é R$: " + saldo);
                Scanner encOP = new Scanner(System.in);
                System.out.println("Deseja fazer outra operação? [1 - SIM] | [2 - NÃO]");
                int encOPSl = Integer.parseInt(encOP.nextLine());
                if (encOPSl == 1) {
                    iniciar = true;
                } else {
                    iniciar = false;
                }
            } else if (selecionado == 2) {
                Scanner deposito = new Scanner(System.in);
                System.out.println("Digite o Valor a Depositar: ");
                int valorDepositado = Integer.parseInt(deposito.nextLine());
                int saldoAtualizado = saldo + valorDepositado;
                System.out.println("O novo Saldo é de R$: " + saldoAtualizado); 
                Scanner encOP = new Scanner(System.in);
                System.out.println("Deseja fazer outra operação? [1 - SIM] | [2 - NÃO]");
                int encOPSl = Integer.parseInt(encOP.nextLine());
                if (encOPSl == 1) {
                    iniciar = true;
                } else {
                    iniciar = false;
                }
            } else if (selecionado == 3) {
                Scanner saque = new Scanner(System.in);
                System.out.println("Digite o Valor a Retirar: ");
                int valorARetirar = Integer.parseInt(saque.nextLine());
                if (valorARetirar > saldo) {
                    System.out.println("Saque não permmitido, saldo insuficiente");
                } else {
                    int saldoAtualizado = saldo - valorARetirar;
                    System.out.println("Saque efetuado com sucesso! E o saldo atualizado é de R$:" + saldoAtualizado);
                } 
                Scanner encOP = new Scanner(System.in);
                System.out.println("Deseja fazer outra operação? [1 - SIM] | [2 - NÃO]");
                int encOPSl = Integer.parseInt(encOP.nextLine());
                if (encOPSl == 1) {
                    iniciar = true;
                } else {
                    iniciar = false;
                }
            } else if (selecionado == 4) {
                iniciar = false;
            }

        }

    }
}
