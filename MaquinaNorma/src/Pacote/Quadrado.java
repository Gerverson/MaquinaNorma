package Pacote;

import java.util.Scanner;

public class Quadrado {

    public void Quadrad() {
        Scanner input = new Scanner(System.in);

        int RegA = 0, RegB = 0, RegC = 0;
        System.out.println("Insira registrador A:");
        RegA = input.nextInt();

        int auxRegA = RegA, auxReg = RegA;

        while (!(auxReg == 0)) {

            while (!(auxRegA == 0)) {
                System.out.println("Reg B: (" + RegC + ")\tauxReg A: (" + auxRegA + ")\tauxReg: (" + auxReg + ")");
                RegC++;
                auxRegA--;
            }
            System.out.println("Reg B: (" + RegC + ")\tauxReg A: (" + auxRegA + ")\tauxReg: (" + auxReg + ")");
            auxReg--;
            auxRegA = RegA;
        }// auxRegA = 0;
        //  System.out.println("Reg B: (" + RegC + ")\tauxReg A: (" + auxRegA + ")\tauxReg: (" + auxReg + ")");
        System.out.println("\nValor Final: Reg C: (" + RegC + ")\tReg A: (" + RegA + ")");
    }
}
