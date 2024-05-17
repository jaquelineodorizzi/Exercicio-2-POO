package Exercicio2;

public class LinhasDuplas {
    private int largura;
    private int altura;
    private String texto;
    
    public LinhasDuplas(int largura, int altura, String texto) {
        this.largura = largura;
        this.altura = altura;
        this.texto = texto;
    }
    
    public void desenhar() {
        System.out.println("╔" + "═".repeat(largura) + "╗");
        for (int i = 0; i < altura; i++) {
            System.out.println("║ " + texto + " ║");
        }
        System.out.println("╚" + "═".repeat(largura) + "╝");
    }
}