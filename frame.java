import java.awt.*;
import javax.swing.*;

public class frame extends JFrame{
    
    panel pan = new panel();

    frame(){

        this.setTitle("SpaceForce!");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(pan);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

}
