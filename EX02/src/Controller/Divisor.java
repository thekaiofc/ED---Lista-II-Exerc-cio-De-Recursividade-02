package Controller;

public class Divisor {

    // Construtor
    public Divisor() {
        // Utilizado para instanciar a classe
    }

    // Metodo recursivo que calcula o resto da divisão por subtrações sucessivas
    public int dividir(int a, int b) {

        /*
         * Quando o dividendo for menor que o divisor,
         * não é mais possível realizar subtrações.
         */
        if (a < b) {
            return a;
        }

        /*
         * O resto é obtido subtraindo o divisor do dividendo
         * e chamando novamente a função com o novo valor.
         */
        return dividir(a - b, b);
    }
}