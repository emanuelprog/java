package Calculadora;

import java.io.IOException;

public class LeitorException extends Exception{

    public LeitorException(String mensagem, IOException e) {
        super(mensagem);
    }
}
