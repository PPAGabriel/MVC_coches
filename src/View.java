public class View {
    /**
     * Ventana adicional que muestra mensaje de alerta si supera los 120km/h
     * @param matricula -> matricula del coche
     * @param v -> velocidad del coche
     */
    void muestraVelocidad(String matricula, Integer v){
        if(v>120){
            Dialog.mostrarMensaje("ALERTA: VELOCIDAD EXCEDIDA!");
            String mensaje = "Coche " + matricula + " velocidad: " + v + "km/h";
            Dialog.mostrarMensaje(mensaje);}
        else{
        String mensaje = "Coche " + matricula + " velocidad: " + v + "km/h";
        Dialog.mostrarMensaje(mensaje);}
    }

}
