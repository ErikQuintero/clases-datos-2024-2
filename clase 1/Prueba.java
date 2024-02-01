import java.util.Arrays;

/**
 * La clase Prueba es una clase de prueba que demuestra el uso de las clases Materia y Salon,
 * así como el método genérico getMayor de la clase MetodosGenericos.
 */
public class Prueba {

    public static void main(String[] args) {
        // Crear instancias de Materia
        Materia mat1 = new Materia("Discretas", 1);
        Materia mat2 = new Materia("Datos", 2);
        Materia mat3 = new Materia("IA", 6);

        // Comparar dos materias
        System.out.println(mat1.compareTo(mat2));
        System.out.println("_________________________________");

        // Crear un arreglo de materias y ordenarlo
        Materia[] materias = new Materia[3];
        materias[0] = mat1;
        materias[1] = mat2;
        materias[2] = mat3;
        Arrays.sort(materias);
        for (Materia m : materias) {
            System.out.println(m);
        }
        System.out.println("_________________________________");

        // Encontrar la materia con mayor semestre
        System.out.println(MetodosGenericos.getMayor(materias));

        System.out.println("_________________________________");

        // Crear instancias de Salon
        Salon sal1 = new Salon("O", 220, 40);
        Salon sal2 = new Salon("P", 110, 50);
        Salon sal3 = new Salon("Aula Magna", 1, 142);

        // Comparar dos salones
        System.out.println(sal1.compareTo(sal2));
        System.out.println("_________________________________");

        // Crear un arreglo de salones y ordenarlo
        Salon[] salones = new Salon[3];
        salones[0] = sal1;
        salones[1] = sal2;
        salones[2] = sal3;
        Arrays.sort(salones);
        for (Salon s : salones) {
            System.out.println(s);
        }
        System.out.println("_________________________________");

        // Encontrar el salón con mayor límite de cupo
        System.out.println(MetodosGenericos.getMayor(salones));

        System.out.println("_________________________________");

        // Crear un arreglo de objetos mezclados
        Object[] mezcla = new Object[3];
        mezcla[0] = sal1;
        mezcla[1] = mat2;
        mezcla[2] = mat1;
        //System.out.println(MetodosGenericos.getMayor(mezcla));
    }
}
