/**
 * La clase MetodosGenericos proporciona métodos genéricos para realizar operaciones con tipos que implementan la interfaz Comparable.
 */
public class MetodosGenericos {

    /**
     * Encuentra y devuelve el elemento mayor en un arreglo de elementos comparables.
     *
     * @param arreglo Un arreglo de elementos comparables.
     * @param <T>     El tipo de elementos en el arreglo que implementa Comparable.
     * @return El elemento mayor en el arreglo.
     */
    public static <T extends Comparable<T>> T getMayor(T[] arreglo) {
        T aux = arreglo[0];
        for (T e : arreglo) {
            if (aux.compareTo(e) < 0) {
                aux = e;
            }
        }
        return aux;
    }
}
