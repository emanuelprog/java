package Calculadora;

public class MainLeitor {
    public static void main(String[] args) {
        try {
            LeitorArquivo.imprimirDadosArquivo("C:\\Users\\Emanuel\\IdeaProjects\\Praticando Exception\\src\\Calculadora\\arquivo.txt");
        } catch (LeitorException e) {
            System.out.println(e.getMessage());
        }
    }
}
