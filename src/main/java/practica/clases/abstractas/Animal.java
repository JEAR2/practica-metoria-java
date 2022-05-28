package practica.clases.abstractas;


import org.jboss.logging.Logger;
/**
 * Clase Animal
 * Esta clase permite crear atributos y métodos  de la clase Abstacrta Animal
 * Author: John Edward Acevedo Rojas
 * Version:v127/05/2022
 */
public abstract class Animal {
    /**
     * -param nombre que me permite almacenar el nombre del Animal creado
     */
    private String nombre;

    /**
     * -param logger, permite pedir y mostrar información por consola
     */
    static final Logger logger = Logger.getLogger(Animal.class);

    /**
     * Método getNombre
     * Este método permite mostrar el nombre del animal
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setNombre
     * Este método permite asignar un nombre al animal
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    /**
     * Método caminar
     * Este método permite mostrar la acción de caminar
     */
    public void caminar(){
        logger.info("El animal está caminando");
    }
}
