package Exercicio2;


public class Main {
    public static void main(String[] args) {

        BordasArredondadas retanguloBordasArredondadas = new BordasArredondadas(10, 5, "          ");
        System.out.println("Retângulo com bordas arredondadas:");
        retanguloBordasArredondadas.desenhar();
        System.out.println();

        LinhasDuplas retanguloLinhasDuplas = new LinhasDuplas(12, 4, "          ");
        System.out.println("Retângulo com linhas duplas:");
        retanguloLinhasDuplas.desenhar();
        System.out.println();

        ASCIII retanguloASCII = new ASCIII(8, 6, "      ");
        System.out.println("Retângulo ASCII:");
        retanguloASCII.desenhar();
        System.out.println();

        Simples retanguloSimples = new Simples(8, 5, "      ");
        System.out.println("Retângulo simples:");
        retanguloSimples.desenhar();
    }
}
