package Pacote;

import java.util.Scanner;

public class Soma {

    public void Somar() {
        Scanner input = new Scanner(System.in);
        Operacoes op = new Operacoes();

        int RegA, RegB, RegC = 0;

        System.out.println("Insira registrador A:");
        RegA = input.nextInt();
        System.out.println("Insira registrador B:");
        RegB = input.nextInt();

        int auxRegA = RegA, auxRegB = RegB;

        //  while (!(auxRegA == 0)) {
        while (!(op.test0(auxRegA))) {
            System.out.println("Reg C: (" + RegC + ")\tauxReg A: (" + auxRegA + ")\tauxReg B: (" + auxRegB + ")");
            // RegC++;
            RegC = op.adciona(RegC);
            // auxRegA--;
            auxRegA = op.subtrai(auxRegA);
        }
        //  while (!(auxRegB == 0)) {
        while (!(op.test0(auxRegB))) {
            System.out.println("Reg C: (" + RegC + ")\tauxReg A: (" + auxRegA + ")\tauxReg B: (" + auxRegB + ")");
            // RegC++;
            RegC = op.adciona(RegC);
            //  auxRegB--;
            auxRegB = op.subtrai(auxRegB);
        }
        System.out.println("Reg C: (" + RegC + ")\tauxReg A: (" + auxRegA + ")\tauxReg B: (" + auxRegB + ")");
        System.out.println("\nValor Final: Reg C: (" + RegC + ")\tReg A: (" + RegA + ")\tReg B: (" + RegB + ")");

    }
}
