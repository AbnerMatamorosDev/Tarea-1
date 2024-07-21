package tarea1;

public class DatosCompañerosYDocente {
    public static void main(String[] args) {
        String[][] datos = {
            {"ABNER JOSUE", "RIVERA MATAMOROS", "Estudiante", "UTH"},
            {"GISSEL ANAHI", "AGUILERA GOMEZ", "Estudiante", "UTH"},
            {"ARNOL RAFAEL", "GUTIERREZ ALFARO", "Catedrático", "UTH"},
            {"CINDY NINOSKA", "BACA RAMOS", "Estudiante", "UTH"},
            {"DAVID JAFET", "HERNANDEZ BELTRAND", "Estudiante", "UTH"}
        };

        for (String[] persona : datos) {
            System.out.println("Nombre: " + persona[0] + " " + persona[1]);
            System.out.println("Ocupación: " + persona[2]);
            System.out.println("Lugar de Trabajo: " + persona[3]);
            System.out.println();
        }
    }
}
