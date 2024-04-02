package com.generation;
import java.util.Scanner; // Importé la clase scanner para leer la entrada del usuario

public class Codigo4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Para usar la clase Scanner, necesitamos crear un objeto de tipo Scanner
        //queremos leer desde la consola, por lo que usamos System.in como argumento para el constructor.
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        // Turno del jugador 2
        String j2 = s.nextLine(); // Usar el mismo scanner s, no new

        if (j1.equals(j2)) { // Usar equals() para comparar cadenas en lugar de ==
            System.out.println("Empate");
        } else {
            int g = 2;
            switch(j1) {
                case "piedra":
                    if (j2.equals("tijeras")) { // equals() en lugar de ==
                        g = 1;
                    }
                    break; // Break para salir del switch después de encontrar una coincidencia

                case "papel":
                    if (j2.equals("piedra")) { // Usar equals() en lugar de ==
                        g = 1;
                    }
                    break; // break para salir del switch

                case "tijeras":
                    if (j2.equals("papel")) { // Usar equals() en lugar de ==
                        g = 1;
                    }
                    break; // break para salir del switch

                default:
                    break; // break para salir del switch
            }
            System.out.println("Gana el jugador " + g);
        }
    }
}