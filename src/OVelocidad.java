import java.util.Observable;
import java.util.Observer;

public class OVelocidad implements Observer {
    View miVista=new View();

    /**
     * Observer que muestra una ventana dependiendo de la velocidad que este presente (solo si es menor a 120)
     * @param o     the observable object.
     * @param aux   an argument passed to the {@code notifyObservers}
     *                 method.
     */
    @Override
    public void update(Observable o, Object aux) {
        //Casteamos el objeto a Coche

        Coche obxC=(Coche) aux;
        if(obxC.velocidad<=120){
        miVista.muestraVelocidad(obxC.matricula,obxC.velocidad);}
    }
}
