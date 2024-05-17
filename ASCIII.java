package Exercicio2;

public class ASCIII {
    private int largura;
    private int altura;
    private String texto;
    
    public ASCIII(int largura, int altura, String texto) {
        this.largura = largura;
        this.altura = altura;
        this.texto = texto;
    }
    
    public void desenhar() {
        System.out.println("/" + "-".repeat(largura) + "\\");
        for (int i = 0; i < altura; i++) {
            System.out.println("| " + texto + " |");
        }
        System.out.println("\\" + "-".repeat(largura) + "/");
    }
}