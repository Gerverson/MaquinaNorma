package Pacote;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int RegA = 0, RegB = 0, RegC = 0;

        System.out.println("Qual Operação deseja fazer\n"
                + "1\tsomar\n"
                + "2\tmultiplicar\n"
                + "3\televar ao quadrado\n"
                + "4\televar ao expoente");

        Scanner input = new Scanner(System.in);
        int opt = 0;
        boolean res = true;
        while (res) {
            try {
                opt = input.nextInt();
                if (opt == 1 || opt == 2 || opt == 3 || opt == 4) {
                    res = false;
                } else {
                    System.out.println("Opção Inavalida!\nTete novamente");
                }
            } catch (Exception e) {
                System.out.println("Valor Invalido!\nTente novamente:");
            }
        }
        switch (opt) {
            case 1:
                Soma soma = new Soma();
                soma.Somar();
                break;
            case 2:
                Multiplicar multiplicar = new Multiplicar();
                multiplicar.Multiplica();
                break;
            case 3:
                Quadrado quadrado = new Quadrado();
                quadrado.Quadrad();
                break;
            case 4:
                Elevado elevado = new Elevado();
                elevado.Elevad();
                break;
        }

    }

}
