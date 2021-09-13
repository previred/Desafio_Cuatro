package implementacion;

/**
 *
 * @author mgonzalez
 */
public class OperacionesMatematicas {

    /**
     * Permite dividir 2 numeros
     *
     * @param a Segundo valor para el calculo
     * @param b Segundo valor para el calculo
     * @return retorna el valor de la division de entre 2 numeros
     */
    public double dividir(double a, double b) {
        return (a / b);
    }

    /**
     * Metodo para calcular el mayor de entre 2 numeros
     *
     * @param a Primer valor para el calculo
     * @param b Segundo valor para el calculo
     * @return Retorna el valor mayor entre a y b
     */
    public double calculaMayor(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    /**
     * Metodo para calcular el menor de entre 2 numeros
     *
     * @param a Primer valor para el calculo
     * @param b Segundo valor para el calculo
     * @return Retorna el valor menor entre a y b
     */
    public double calculaMenor(double a, double b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}
