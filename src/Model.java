import java.util.ArrayList;
import java.util.Observable;

public class Model extends Observable{
    static ArrayList<Coche> parking = new ArrayList<>();

    /**
     * Crea un coche y lo mete en el parking
     * @param modelo del coche
     * @param matricula identificador unico
     * @return el coche creado
     */
    public Coche crearCoche(String modelo, String matricula){
        Coche aux = new Coche(modelo, matricula);
        parking.add(aux);
        return aux;
    }

    /**
     * Busca coche segun matricula
     * @param matricula a buscar
     * @return chche o null si no existe
     */
    public Coche getCoche(String matricula){
        Coche aux = null;
        // recorre el array buscando por matricula
        for (Coche e: parking) {
            if (e.matricula.equals(matricula)) {
                aux = e;
            }
        }
        return aux;
    }

    /**
     *
     * @param matricula
     * @param v nueva velocidad
     * @return velocidad modificada
     */
    public void cambiarVelocidad(String matricula, Integer v) {
        // busca el coche
        getCoche(matricula).velocidad = v;
        //cambia
        setChanged();
        // notifica del cambio
        notifyObservers(getCoche(matricula));
    }

    public void subirVelocidad(String matricula, Integer v){
        // busca el coche
        getCoche(matricula).velocidad +=v;
        // cambia
        setChanged();
        //notifica al observer
        notifyObservers(getCoche(matricula));
    }

    public void bajarVelocidad(String matricula, Integer v){
        // busca el coche
        getCoche(matricula).velocidad -=v;
        // cambia
        setChanged();
        //notifica al observer
        notifyObservers(getCoche(matricula));
    }

    /**
     * Ddevuelve la velocidad segun la matricula
     * @param matricula
     * @return
     */
    public Integer getVelocidad(String matricula) {
        return getCoche(matricula).velocidad;
    }
}
