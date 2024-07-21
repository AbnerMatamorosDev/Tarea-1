package tarea1;

import java.util.Random;

public class NotasEstudiantes {
    public static void main(String[] args) {
        String[] estudiantes = {
            "ABNER JOSUE RIVERA MATAMOROS",
            "GISSEL ANAHI AGUILERA GOMEZ",
            "CINDY NINOSKA BACA RAMOS",
            "DAVID JAFET HERNANDEZ BELTRAND",
            "ELBIN MENDEZ MATUTE",
            "ENZO EDUARDO LEIVA ENAMORADO",
            "AMINTA ESTELA ERAZO ENAMORADO",
            "CARLOS RADAN ESTRADA MUNGUIA",
            "JORGE LUIS VARELA GUERRA",
            "JOSE EDGARDO LOPEZ RODRIGUEZ"
        };

        Random random = new Random();

        for (String estudiante : estudiantes) {
            int nota = random.nextInt(101);  // Genera una nota al azar entre 0 y 100
            String estado = nota >= 70 ? "Aprobado" : "Reprobado";
            System.out.println("Nombre: " + estudiante);
            System.out.println("Nota: " + nota);
            System.out.println("Estado: " + estado);
            System.out.println();
        }
    }
}
