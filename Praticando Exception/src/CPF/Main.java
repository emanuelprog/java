package CPF;

import CPF.InvalidCpfException;
import CPF.ValidaCpf;

public class Main {
    public static void main(String[] args) {
        try {
            ValidaCpf.validaCpf("123456789000");
        } catch (InvalidCpfException e) {
            System.out.println(e.getMessage());
        }
    }
}