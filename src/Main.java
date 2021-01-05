import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        MyWindow window = new MyWindow("Drawer");
        //window.setTitle("Another one");

        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(500, 500);
        window.setMinimumSize(new Dimension(150, 150));
        window.setLocationRelativeTo(null);
        window.setVisible(true);

//        window.setResizable(false);


        window.getContentPane().setBackground(Color.RED);
    }
}
