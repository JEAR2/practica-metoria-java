package practica.clases;


import org.jboss.logging.Logger;
import practica.clases.abstractas.Animal;
import practica.clases.interfaces.InterfacePerro;
/**
 * Clase Perro
 * Esta clase permite crear atributos y métodos propios de la clase Perro extendiendo de la Clase Animal
 * e implementando de la interface InterfacePerro
 * Author: John Edward Acevedo Rojas
 * Version:v127/05/2022
 */
public class Perro extends Animal implements InterfacePerro {
    /**
     * Método getInstance que perimite crear una instancia de esta clase
     * @return retorna la instancia de la clase instanciada
     */
    public static Perro getInstance() {
        return new Perro();
    }
    /**
     * -param logger, permite pedir y mostrar información por consola
     */
    static final Logger logger = Logger.getLogger(Perro.class);


    @Override
    public void caminar() {
        logger.log(Logger.Level.INFO,getNombre()+" Está caminando ");

    }

    @Override
    public void ladrar() {
        logger.info("guau");
    }

    @Override
    public void saltar() {
        logger.log(Logger.Level.INFO,getNombre()+" está saltando");

    }

}
