public class View {

    boolean muestraVelocidad(String matricula, Integer v){
        String mensaje = "Coche: " + matricula + " Velocidad: " + v + "km/h";
        Dialog.mostrarMensaje(mensaje);

        return true;
    }

    /** Permite visualizar el coche dado en alta
     *
     * @param matricula -> matricula del coche a buscar
     * @param modelo -> modelo del coche dado en alta
     * @param v -> velocidad del coche dado en alta
     * @return
     */
    boolean muestraCoche(String matricula, String modelo,Integer v){
        String mensaje = "COCHE EN ALTA! Modelo: "+modelo+", Matricula: " + matricula + ", Velocidad: " + v + "km/h";
        Dialog.mostrarMensaje(mensaje);

        return true;
    }

    /**
     * Permite visualizar un mensaje de no estar dado en alta el coche
     * @return
     */
    boolean muestraError(){
        Dialog.mostrarMensaje("COCHE SIN DAR DE ALTA :(");
        return true;
    }
}
