package org.example;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
Desenvolva um script para uma pousada que cobra R$ 200,00 de diária mais uma taxa de serviço que varia
de acordo com o período de hospedagem, sendo:
   -> R$ 10,00 por diária em períodos maiores que 10 dias.
   -> R$ 15,00 por diária se o período for de 10 dias.
   -> R$ 20,00 por diária em períodos menores que 10 dias.
   Apresente o valor total da hospedagem a ser pago por um período informado pelo usuário.
*/
        Scanner sc = new Scanner(System.in);

        double valor;
        String nome;

        while (true){
            try {

                System.out.print("Digite seu nome: ");
                nome = sc.nextLine();

                System.out.print("Digite quantos dias você ficará na pousada: ");
                int qtd_dias = Integer.parseInt(sc.nextLine());

                if (qtd_dias > 10){
                    valor = 200 + (10 * qtd_dias);
                } else if (qtd_dias == 10){
                    valor = 200 + (15 * qtd_dias);
                }else {
                    valor = 200 + (20 * qtd_dias);
                }

                System.out.printf("%s, O valor total da hospedagem é %.2f\n", nome, valor);
            }catch (InputMismatchException e){
                System.out.println("Valor Inválido");
                break;
            }

        }


    }
}