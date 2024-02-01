/**
 * La clase Salon representa un salón dentro de un edificio, con un número específico y un límite de cupo.
 * Implementa la interfaz Comparable para permitir la comparación basada en el límite de cupo.
 */
public class Salon implements Comparable<Salon> {

    /**
     * El edificio al que pertenece el salón.
     */
    private String edificio;

    /**
     * El número identificador del salón.
     */
    private int numero;

    /**
     * El límite de cupo del salón.
     */
    private int cupo;

    /**
     * Constructor para crear una nueva instancia de la clase Salon.
     *
     * @param edificio El edificio al que pertenece el salón.
     * @param numero   El número identificador del salón.
     * @param cupo     El límite de cupo del salón.
     */
    public Salon(String edificio, int numero, int cupo) {
        this.edificio = edificio;
        this.numero = numero;
        this.cupo = cupo;
    }

    /**
     * Compara el salón actual con otro salón basándose en el límite de cupo.
     *
     * @param sal El salón con el que se compara.
     * @return Un valor negativo si el límite de cupo del salón actual es menor que el de sal,
     *         un valor positivo si es mayor, y cero si son iguales.
     */
    @Override
    public int compareTo(Salon sal) {
        if (this.cupo != sal.cupo) {
            return this.cupo - sal.cupo;
        }
        return 0;
    }

    /**
     * Devuelve una representación en cadena del salón, que incluye el edificio y el número.
     *
     * @return Una cadena que representa el salón en el formato "edificio + numero".
     */
    @Override
    public String toString() {
        return edificio + numero;
    }
}
