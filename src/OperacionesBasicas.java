/**
 * @author JayBGB
 * @version 1.0
 */
public class OperacionesBasicas {
    /**
     * private static FLOAT Resultado
     */

    private static Float resultado = null;
    /**
     * Elección de operación suma
     *  static final int SUMA = 1;
     */
    static final int SUMA = 1;
    /**
     *Elección de operación resta
     *      *  static final int RESTA = 1;
     */
    static final int RESTA = 2;
    /**
     * Elección de operación multiplicar
     *      *  static final int MULTIPLICACIÓN = 1;
     */
    static final int MULTIPLICACION = 3;
    /**
     * Elección de operación DIVIDIR
     *      *  static final int DIVIDIR = 1;
     */
    static final int DIVISION = 4;
    /**
     * Elección de operación RAIZ
     *      * static final int RAIZ = 1;
     */
    static final int RAIZCUADRADA = 5;
    /**
     * Elección de operación RAIZ CON INDICE
     *      * static final int RAIZINDEX = 1;
     */
    static final int RAIZINDEX = 6;

    /**
     * @param device --> [1,2,3,4] seleccionar Operacion  (SUMA, RESTA, MULTIPLICACIÓN, DIVISIÓN)
     * @param num1 --> primer número de la operación
     * @param num2 --> segundo número de la operación
     * @return resultado de la operacion
     */
    public static Float realizar(int device, float num1, float num2){

        switch (device){
            case SUMA:
                try{
                    resultado = num1 + num2;
                }catch (Exception e){
                    System.out.println("Error en la Suma");
                }
                break;
            case RESTA:
                try{
                    resultado = num1 - num2;
                }catch (Exception e){
                    System.out.println("Error en la resta");
                }
                break;
            case MULTIPLICACION:
                try{
                    resultado = num1*num2;
                }catch (Exception e){
                    System.out.println("Error en la multiplicación");
                }
                break;
            case DIVISION:
                try{
                    resultado = num1/num2;
                }catch (Exception e){
                    System.out.println("Error en la división");
                }
                break;
            case RAIZCUADRADA:
                try{
                    resultado = (float)(Math.sqrt(num1));
                }catch(Exception e){
                    System.out.println("Error en la raíz.");
                }
            case RAIZINDEX:
                try{
                    resultado = (float) (Math.pow(num1, 1/num2));
                }catch(Exception e){
                System.out.println("Error en la raíz.");
            }

        }
        return resultado;
    }
}
