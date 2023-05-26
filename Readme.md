# Arquitectura MVC - Observer (Examen)

Aplicación que trabaja con objetos coches, modifica la velocidad y la muestra.
Adicionalmente, si la velocidad excede de 120km/h muestra un ALERTA.

---
## Explicación:

En la presente rama, añadimos un nuevo **Observer**, el cual tiene la función de advertir al usuario si su velocidad supera los 120km/h.

Para esto añadimos el observer ObsExceso, el cual se diferencia al OVelocidad ya que tiene la condición de actuar sólo si la velocidad del Objeto Coche es mayor a 120 (Esto modifica así el observer OVelocidad el cual tiene la condición de actuar si es una velocidad menor o igual a 120).

Esta condición es trasladada también al método de la clase View, para diferenciar los mensajes y reciclar codigo, usando este mismo método en ambos Observer.

*Espero te haya agradado esta reseña, dale un 10 para apoyar a este humilde programador (más info en el código)* :smile:

---
## Diagrama de clases:

```mermaid
classDiagram
    class Observable {
        setChanged()
        notifyObserver(valor)
    }
        class Coche {
        String: matricula
        String: modelo
        Integer: velocidad
    }
      class Controller{
          +main()
      }
      class Model {
          ArrayList~Coche~: parking
          +crearCoche(String, String, String)
          +getCoche(String)
          +cambiarVelocidad(String, Integer)
          +getVelocidad(String)
          +subirVelocidad(String,integer)
          +bajarVelocidad(String,integer)
      }
      class ObserverVelocidad {
          +update()
          }
          Controller "1" *-- "1" ObserverVelocidad: association
          Controller "1" *-- "1" Model : association
    Model "1" *-- "1..n" Coche : association
    Observable <|-- Model
    
    class ObserverExceso {
          +update()
          }
          Controller "1" *-- "1" ObserverExceso: association
    
      
```

## Diagrama de secuencia:

```mermaid
sequenceDiagram
    participant View
    participant Controller
    participant ObserverVelocidad
    participant ObserverExceso
    participant Model
    
    Controller->>Model: cambia la velociad, porfa
    activate Model
    Model->>ObserverVelocidad: Notificacion de cambio de velocidad
    deactivate Model
    activate ObserverVelocidad
    ObserverVelocidad->>+View: Muestra la velocidad (siendo menor a 120), porfa
    deactivate ObserverVelocidad
    activate ObserverExceso
    ObserverExceso->>+View: Muestra el ALERTA, y la velocidad (mayor a 120), porfa
    deactivate ObserverExceso
    activate View
    View->>-View: Mostrando velocidad
    deactivate View
```
---
