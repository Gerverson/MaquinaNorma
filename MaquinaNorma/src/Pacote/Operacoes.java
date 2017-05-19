package Pacote;

public class Operacoes {

    public int adciona(int Reg) {
        return Reg+1;
    }

    public int subtrai(int Reg) {
        return Reg-1;
    }

    public boolean test0(int Reg) {
        if (Reg == 0) {
            return true;
        } else {
            return false;
        }
    }
}
