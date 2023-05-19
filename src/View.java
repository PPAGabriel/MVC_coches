public class View {

    void muestraVelocidad(String matricula, Integer v){
        String mensaje = "Coche " + matricula + " velocidad: " + v + "km/h";
        Dialog.mostrarMensaje(mensaje);
    }

}
