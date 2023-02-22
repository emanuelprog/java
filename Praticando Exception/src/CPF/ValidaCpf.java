package CPF;

import CPF.InvalidCpfException;

public class ValidaCpf {

    public static void validaCpf(String cpf) throws InvalidCpfException {
        if (cpf.length() != 11) {
            throw new InvalidCpfException("Cpf Inválido");
        }
        System.out.println("Cpf Válido");
    }
}
