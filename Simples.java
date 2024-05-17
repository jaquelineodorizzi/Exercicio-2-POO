package Exercicio2;

public class Simples {
    private int largura;
    private int altura;
    private String texto;
    
    public Simples(int largura, int altura, String texto) {
        this.largura = largura;
        this.altura = altura;
        this.texto = texto;
    }
    
    public void desenhar() {
        for (int i = 0; i < altura; i++) {
            if (i == 0 || i == altura - 1) {
                System.out.println("-".repeat(largura + 2));
            } else {
                System.out.println("| " + texto + " |");
            }
        }
    }
}