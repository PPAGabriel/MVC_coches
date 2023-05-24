public class Controller {
    static Model miModelo;
    static View miVista;
    public static void main(String[] args) {
        miModelo = new Model();
        miVista = new View();
        IU.crearVentana();
    }


    public static void crearCoche(String modelo,String matricula){
        Coche obx=miModelo.crearCoche(modelo,matricula);
        if (obx!=null){
            miVista.muestraVelocidad(obx.matricula, obx.velocidad);
        }
    }

    public static void bajarVelocidad(String matricula){
        int auxV= miModelo.bajarVelocidad(matricula,10);
        miVista.muestraVelocidad(matricula,auxV);
    }

    public static void aumentarVelocidad(String matricula){
        int auxV=miModelo.subirVelocidad(matricula,10);
        miVista.muestraVelocidad(matricula,auxV);
    }

    /**
     * Método que permite usar un coche que ya exista en el parking
     * @param matricula -> matricula del coche dado en alta
     * @param modelo -> modelo del coche dado en alta
     */
    public static void usarCoche(String matricula,String modelo){
        Coche obx=miModelo.getCoche(matricula);
        if(obx!=null){
            miVista.muestraCoche(matricula,obx.modelo,obx.velocidad);
        }else{
            miVista.muestraError();
        }
    }
}