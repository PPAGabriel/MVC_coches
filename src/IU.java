import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IU {
    private JButton bCrear;
    private JTextField modelo;
    private JTextField matricula;
    private JPanel panel;

    private JButton subirVelocidadButton;

    private JButton bajarVelocidadButton;
    private JButton UsarCocheButton;


    public IU() {
        bCrear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller.crearCoche(modelo.getText(),matricula.getText());
            }
            });
        bajarVelocidadButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Controller.bajarVelocidad(matricula.getText());
                }
        });
        subirVelocidadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller.aumentarVelocidad(matricula.getText());
            }
        });
        bajarVelocidadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller.bajarVelocidad(matricula.getText());
            }
        });
        UsarCocheButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Controller.usarCoche(matricula.getText(),modelo.getText());
            }
        });
    }

    public static void crearVentana(){
        JFrame jframe = new JFrame("App MVC");
        jframe.setContentPane(new IU().panel);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.pack();
        jframe.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
