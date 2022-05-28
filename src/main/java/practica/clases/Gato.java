package practica.clases;


import org.jboss.logging.Logger;
import practica.clases.abstractas.Animal;
import practica.clases.interfaces.InterfaceGato;

/**
 * Clase Gato
 * Esta clase permite crear atributos y métodos propios de la clase Gato extendiendo de la Clase Animal
 * e implementando de la interface InterfaceGato
 * Author: John Edward Acevedo Rojas
 * Version:v127/05/2022
 */
public class Gato extends Animal implements InterfaceGato {
    /**
     * Método getInstance que perimite crear una instancia de esta clase
     *
     * @return retorna la instancia de la clase instanciada
     */
    public static Gato getInstance() {
        return new Gato();
    }

    /**
     * -param logger, permite pedir y mostrar información por consola
     */
    static final Logger logger = Logger.getLogger(Gato.class);

    @Override
    public void maullar() {
        logger.info("miau");
    }


    @Override
    public void caminar() {
        logger.log(Logger.Level.INFO, getNombre() + " Está caminando ");

    }

    @Override
    public void correr() {
        logger.log(Logger.Level.INFO, getNombre() + " Está corriendo ");
    }
}
