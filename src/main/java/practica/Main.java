package practica;

import practica.clases.Gato;
import practica.clases.Perro;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Clase principal
 * Esta clase ejecuta las acciones necesarias para las instancias de las clases Perro y Gato
 * Author: John Edward Acevedo Rojas
 * Version:v127/05/2022
 */
public class Main {
    private static final Logger logger = Logger.getLogger("logger");
    static Perro perro = Perro.getInstance();
    static Gato gato = Gato.getInstance();

    public static void main(String[] args) {
        init();
    }

    /**
     * Método init()
     * Método que permite instanciar los objetos, y ademas interactuar con el sistema a través del menú
     * @Param op,op2 Variables que permiten moverse dentro del menú
     */
    private static void init() {
        int op;
        int op2;
        Scanner scanner = new Scanner(System.in);
        perro.setNombre("Tony");
        gato.setNombre("Sol");

        do {
            logger.info("\n1. Ir al perro\n2. Ir al gato\n3.Salir");
            op = Integer.parseInt(scanner.nextLine());
            switch (op) {
                case 1:
                    logger.info("\n1. caminar\n2. ladrar\n3.saltar");
                    op2 = Integer.parseInt(scanner.nextLine());
                    switch (op2){
                        case 1:
                            perro.caminar();
                        break;
                        case 2:
                            perro.ladrar();
                            break;
                        case 3:
                            perro.saltar();
                            break;
                        default:
                            logger.info("Eso no lo hace el perrro");
                            break;
                    }
                    break;
                case 2:
                    logger.info("\n1. caminar\n2. maullar\n3.correr");
                    op2 = Integer.parseInt(scanner.nextLine());
                    switch (op2){
                        case 1:
                            gato.caminar();
                            break;
                        case 2:
                            gato.maullar();
                            break;
                        case 3:
                            gato.correr();
                            break;
                        default:
                            logger.info("Eso no lo hace el gato");
                            break;
                    }
                    break;
                default:
                    logger.info("Animal");
                    break;

            }
        } while (op != 3);

    }
}
