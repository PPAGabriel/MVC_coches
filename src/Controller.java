public class Controller {
    static Model miModelo=new Model();
    static View miVista=new View();
    public static void main(String[] args) {
        OVelocidad oVelocidad=new OVelocidad();
        miModelo.addObserver(oVelocidad);
        IU.crearVentana();
        System.out.println("fin");
    }


    public static void crearCoche(String modelo,String matricula){
        Coche obx=miModelo.crearCoche(modelo,matricula);
        if (obx!=null){
            miVista.muestraVelocidad(obx.matricula, obx.velocidad);
        }
    }

    public static void bajarVelocidad(String matricula){
        miModelo.bajarVelocidad(matricula,10);
    }

    public static void aumentarVelocidad(String matricula){
        miModelo.subirVelocidad(matricula,10);
    }
}