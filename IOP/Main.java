import javax.swing.*;
public class Main extends JFrame {
    public static void main(String[] args) {
        JFrame fr = new JFrame();
        GUI gui = new GUI();
        fr.setSize(800,600);
        fr.setJMenuBar(gui.Menu());
        fr.add(gui);
        fr.show();
    }
}
