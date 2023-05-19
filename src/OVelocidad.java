import java.util.Observable;
import java.util.Observer;

public class OVelocidad implements Observer {
    View miVista=new View();

    @Override
    public void update(Observable o, Object aux) {
        //Casteamos el objeto a Coche
        Coche obxC=(Coche) aux;
        miVista.muestraVelocidad(obxC.matricula,obxC.velocidad);
    }
}
