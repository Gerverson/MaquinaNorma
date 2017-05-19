package Pacote;

import java.util.Scanner;

public class Elevado {

    public void Elevad() {
        Scanner input = new Scanner(System.in);

        int RegA = 0, RegB = 0, RegC = 0;
        System.out.println("Insira registrador base A:");
        RegA = input.nextInt();
        System.out.println("Insira registrador expoente B:");
        RegB = input.nextInt();

        int auxRegA = RegA, auxRegB = RegB, auxReg = RegA;

        if(RegB == 0){
        RegC = 1;
        }
        
        else if(RegB == 1){
        RegC = RegB;
        }
        
        else if(RegB > 1){

            
      auxRegB --;

        do {
            auxRegB --;
            RegC = 0;
            while (!(auxRegA == 0)) {      
                while(!(auxReg == 0)){
                System.out.println("Reg C: (" + RegC + ")\tauxReg A: (" + auxRegA + ")\tauxReg B: (" + auxRegB + ")\tauxReg("+auxReg+")");
                RegC++;
                auxReg--;
                }           
                System.out.println("Reg C: (" + RegC + ")\tauxReg A: (" + auxRegA + ")\tauxReg B: (" + auxRegB + ")");
               // RegC++;
                auxRegA--;
                auxReg = RegA;
            }
            System.out.println("Reg C: (" + RegC + ")\tauxReg A: (" + auxRegA + ")\tauxReg B: (" + auxRegB + ")");
          //  auxRegB--;
            auxRegA = RegC;
            
           // auxReg = RegA;

        } while (!(auxRegB == 0));
//        auxRegA = 0;
//        System.out.println("Reg C: (" + RegC + ")\tauxReg A: (" + auxRegA + ")\tauxReg B: (" + auxRegB + ")");
        System.out.println("\nValor Final: Reg C: (" + RegC + ")\tReg A: (" + RegA + ")\tReg B: (" + RegB + ")");
   



        }
        }
}
