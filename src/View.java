public class View {

    boolean muestraVelocidad(String matricula, Integer v){
        String mensaje = "Coche " + matricula + " velocidad: " + v + "km/h";
        Dialog.mostrarMensaje(mensaje);

        return true;
    }
}
