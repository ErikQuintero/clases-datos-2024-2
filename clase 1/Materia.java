/**
 * La clase Materia representa una asignatura con un nombre y un semestre asociado.
 * Implementa la interfaz Comparable para permitir la comparación basada en el semestre.
 */
public class Materia implements Comparable<Materia> {

    /**
     * Nombre de la materia.
     */
    private String nombre;

    /**
     * Semestre al que pertenece la materia.
     */
    private int semestre;

    /**
     * Constructor para crear una nueva instancia de la clase Materia.
     *
     * @param nombre   Nombre de la materia.
     * @param semestre Semestre al que pertenece la materia.
     */
    public Materia(String nombre, int semestre) {
        this.nombre = nombre;
        this.semestre = semestre;
    }

    /**
     * Compara la materia actual con otra materia basándose en el semestre.
     *
     * @param materia2 La materia con la que se compara.
     * @return Un valor negativo si el semestre de la materia actual es menor que el de la materia2,
     *         un valor positivo si es mayor, y cero si son iguales.
     */
    @Override
    public int compareTo(Materia materia2) {
        if (this.semestre != materia2.semestre) {
            return this.semestre - materia2.semestre;
        }
        return 0;
    }

    /**
     * Devuelve el nombre de la materia.
     *
     * @return El nombre de la materia.
     */
    @Override
    public String toString() {
        return nombre;
    }
}
