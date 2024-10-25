/* Dados 3 valores lado1, lado2, lado3, que representam os comprimentos dos lados de um triângulo, 
descreva um algoritmo que verifique se os mesmos podem ser os comprimentos dos lados de um triângulo. 
Em caso afirmativo, verifique e informe se é "triângulo equilátero", "triângulo isósceles" ou "triângulo escaleno".
 Em caso negativo, informe que os mesmos não formam um triângulo. Considere que:

o comprimento de cada lado de um triângulo é menor que a soma dos comprimentos dos outros lados
um triângulo equilátero tem três lados iguais
um triângulo isóscele tem dois lados iguais e um diferente
um triângulo escaleno tem três lados diferentes */

import java.util.Scanner;

public class Exe12Uni04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Entre com o comprimento do lado1: ");
        double lado1 = input.nextDouble();
        System.out.print("Entre com o comprimento do lado2: ");
        double lado2 = input.nextDouble();
        System.out.print("Entre com o comprimento do lado3: ");
        double lado3 = input.nextDouble();

        input.close();

        if ((lado1<(lado2+lado3)) && (lado2<(lado1+lado3)) && (lado3<(lado1+lado2))){
            if (lado1==lado2 && lado1==lado3){
                System.out.println("é equilátero.");
            }
            else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
                    System.out.println("É isósceles");
            }
            else{
                System.out.println("É escaleno");
            }
        }
        else {
            System.out.println("Não formam um triângulo");
        }    
    }
}

