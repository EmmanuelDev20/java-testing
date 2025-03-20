import java.util.*;

public class IslaAventura {
    private static final int FILAS = 10;
    private static final int COLUMNAS = 10;
    private static final int NUM_MAPAS = 4;
    private static char[][][] mapas = new char[NUM_MAPAS][FILAS][COLUMNAS];
    private static int mapaActual = 0; // Empezamos en el mapa 0
    private static int jugadorX = 1, jugadorY = 1;
    private static int tesoroX = 8, tesoroY = 8;
    private static Map<String, int[]> objetos = new HashMap<>();
    private static List<String> inventario = new ArrayList<>();

    public static void main(String[] args) {
        inicializarMapas();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            mostrarMapa();
            System.out.println("Comandos: WASD (mover), 'recoger' (tomar objeto), 'inventario' (ver inventario), 'salir' (salir).");
            String entrada = scanner.nextLine().toLowerCase();

            if (entrada.equals("salir")) {
                System.out.println("¡Gracias por jugar!");
                break;
            } else if (entrada.equals("recoger")) {
                recogerObjeto();
            } else if (entrada.equals("inventario")) {
                mostrarInventario();
            } else {
                moverJugador(entrada);
            }

            if (jugadorX == tesoroX && jugadorY == tesoroY && mapaActual == 3) { // El tesoro está en el mapa 3
                mostrarMapa();
                System.out.println("¡Felicidades! Has encontrado el tesoro. 🏆");
                break;
            }
        }
        scanner.close();
    }

    private static void inicializarMapas() {
        for (int m = 0; m < NUM_MAPAS; m++) {
            for (int i = 0; i < FILAS; i++) {
                for (int j = 0; j < COLUMNAS; j++) {
                    mapas[m][i][j] = '.';
                }
            }
        }

        // Colocar obstáculos y objetos en diferentes mapas
        mapas[0][3][4] = '#'; mapas[0][5][2] = '#';
        mapas[1][2][2] = '#'; mapas[1][6][5] = '#';
        mapas[2][1][8] = '#'; mapas[2][7][7] = '#';
        mapas[3][4][4] = '#'; mapas[3][8][8] = '#';

        // Agregar objetos en diferentes mapas
        agregarObjeto("Brújula", 2, 3, 0);
        agregarObjeto("Mapa viejo", 4, 5, 1);
        agregarObjeto("Llave oxidada", 7, 2, 2);

        // Colocar al jugador en el mapa inicial
        mapas[mapaActual][jugadorX][jugadorY] = '@';
        mapas[3][tesoroX][tesoroY] = 'X'; // Tesoro en el mapa 3
    }

    private static void agregarObjeto(String nombre, int x, int y, int mapa) {
        objetos.put(nombre, new int[]{x, y, mapa});
        mapas[mapa][x][y] = 'O';
    }

    private static void mostrarMapa() {
        System.out.println("Mapa actual: " + mapaActual);
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(mapas[mapaActual][i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void moverJugador(String movimiento) {
        int nuevaX = jugadorX, nuevaY = jugadorY;
    
        switch (movimiento) {
            case "w": nuevaX--; break;
            case "s": nuevaX++; break;
            case "a": nuevaY--; break;
            case "d": nuevaY++; break;
            default:
                System.out.println("Movimiento no válido.");
                return;
        }
    
        if (nuevaX >= 0 && nuevaX < FILAS && nuevaY >= 0 && nuevaY < COLUMNAS) {
            if (mapas[mapaActual][nuevaX][nuevaY] != '#') {
                mapas[mapaActual][jugadorX][jugadorY] = '.';
                jugadorX = nuevaX;
                jugadorY = nuevaY;
                mapas[mapaActual][jugadorX][jugadorY] = '@';
            } else {
                System.out.println("Hay un obstáculo en esa dirección.");
            }
        } else {
            System.out.println("No puedes salir del mapa por ahí.");
        }
    }

    private static void verificarCambioDeMapa() {
        int nuevoMapa = mapaActual;
        int nuevaX = jugadorX, nuevaY = jugadorY;
    
        if (jugadorX == 0) { // Salida por arriba
            nuevoMapa = (mapaActual + 1) % NUM_MAPAS; // Pasa al siguiente mapa
            nuevaX = FILAS - 2; // Aparece en la parte baja del nuevo mapa
        } else if (jugadorX == FILAS - 1) { // Salida por abajo
            nuevoMapa = (mapaActual - 1 + NUM_MAPAS) % NUM_MAPAS; // Pasa al mapa anterior
            nuevaX = 1; // Aparece en la parte alta del nuevo mapa
        } else if (jugadorY == 0) { // Salida por la izquierda
            nuevoMapa = (mapaActual + 2) % NUM_MAPAS; // Salta dos mapas
            nuevaY = COLUMNAS - 2; // Aparece en el lado derecho del nuevo mapa
        } else if (jugadorY == COLUMNAS - 1) { // Salida por la derecha
            nuevoMapa = (mapaActual - 2 + NUM_MAPAS) % NUM_MAPAS;
            nuevaY = 1; // Aparece en el lado izquierdo del nuevo mapa
        }
    
        // Si el mapa cambia, actualizamos la posición
        if (nuevoMapa != mapaActual) {
            System.out.println("Cambiando al mapa " + nuevoMapa + "...");
            mapas[mapaActual][jugadorX][jugadorY] = '.'; // Borra la posición anterior
            mapaActual = nuevoMapa;
            jugadorX = nuevaX;
            jugadorY = nuevaY;
            mapas[mapaActual][jugadorX][jugadorY] = '@'; // Nueva posición en el nuevo mapa
        }
    }

    private static void cambiarMapa() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nMapas disponibles:");
        for (int i = 0; i < NUM_MAPAS; i++) {
            System.out.println((i + 1) + ". Mapa " + i + (i == mapaActual ? " (actual)" : ""));
        }
        
        System.out.print("Selecciona el número del mapa al que quieres ir: ");
        try {
            int seleccion = Integer.parseInt(scanner.nextLine()) - 1;
            if (seleccion >= 0 && seleccion < NUM_MAPAS && seleccion != mapaActual) {
                mapas[mapaActual][jugadorX][jugadorY] = '.'; // Limpia la posición actual
                mapaActual = seleccion;
                jugadorX = 1; // Nueva posición de inicio
                jugadorY = 1;
                mapas[mapaActual][jugadorX][jugadorY] = '@';
                System.out.println("Has viajado al Mapa " + mapaActual);
            } else {
                System.out.println("Selección no válida.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Ingresa un número válido.");
        }
    }

    private static void recogerObjeto() {
        String objetoARecoger = null;
        int[] posicionObjeto = null;
    
        // Buscar si hay un objeto en la posición del jugador
        for (Map.Entry<String, int[]> entry : objetos.entrySet()) {
            int[] pos = entry.getValue();
            if (pos[0] == jugadorX && pos[1] == jugadorY && pos[2] == mapaActual) {
                objetoARecoger = entry.getKey();
                posicionObjeto = pos;
                break;
            }
        }
    
        if (objetoARecoger != null) {
            inventario.add(objetoARecoger);
            objetos.remove(objetoARecoger);
            mapas[mapaActual][posicionObjeto[0]][posicionObjeto[1]] = '.'; // Solo borra el objeto si fue recogido
            System.out.println("Has recogido: " + objetoARecoger);
        } else {
            System.out.println("No hay objetos aquí.");
        }
    }

    
    private static void mostrarInventario() {
        System.out.println("Inventario:");
        if (inventario.isEmpty()) {
            System.out.println("Vacío.");
        } else {
            for (String item : inventario) {
                System.out.println("- " + item);
            }
        }
    }
}
