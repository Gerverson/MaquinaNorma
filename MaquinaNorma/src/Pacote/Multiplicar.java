/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacote;

import java.util.Scanner;

/**
 *
 * @author 04557105114
 */
public class Multiplicar {
     public void Multiplica(){
         Scanner input = new Scanner(System.in);
        
        int RegA = 0, RegB = 0, RegC = 0;
        System.out.println("Insira registrador A:");
                RegA = input.nextInt();
                System.out.println("Insira registrador B:");
                RegB = input.nextInt();

                int auxRegA = RegA,
                 auxRegB = RegB;
                
                while(!(auxRegB == 0)){
                
                    while(!(auxRegA == 0)){
                    System.out.println("Reg C: (" + RegC + ")\tauxReg A: (" + auxRegA + ")\tauxReg B: (" + auxRegB + ")");
                    RegC++; auxRegA--;
                    }
                    System.out.println("Reg C: (" + RegC + ")\tauxReg A: (" + auxRegA + ")\tauxReg B: (" + auxRegB + ")");
                    auxRegB--; auxRegA = RegA;
                } auxRegA = 0;
                System.out.println("Reg C: (" + RegC + ")\tauxReg A: (" + auxRegA + ")\tauxReg B: (" + auxRegB + ")");
                System.out.println("\nValor Final: Reg C: (" + RegC + ")\tReg A: (" + RegA + ")\tReg B: (" + RegB + ")");
}
}