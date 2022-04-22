import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class panel extends JPanel implements ActionListener{
    
    int wid = 500;
    int hei = 500;


    Image saucer;
    Image background;
    Image ball;

    Timer time;
    
    double xVel=2.2;
    double yVel=2.3;

    int x = 0;
    int y = 0;

    //Ball
    double bxVel = 2.5;
    double byVel=2.2;

    int bx = 0;
    int by = 0;

    panel(){

        this.setPreferredSize(new Dimension(wid, hei));
        this.setBackground(Color.BLACK);
        saucer = new ImageIcon("spaceship.png").getImage();
        background = new ImageIcon("Space.jpg").getImage();
        ball = new ImageIcon("ball.png").getImage();
        time = new Timer(1, this);
        time.start();

    }

    public void paint(Graphics g){

        super.paint(g);

        Graphics2D g2D = (Graphics2D)g;
        g2D.drawImage(background, 0, 0, null);
        g2D.drawImage(saucer, x, y, null);
        g2D.drawImage(ball, bx, by, null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(x>=wid-saucer.getWidth(null) || x<0){
            xVel = (1.02*xVel)*-1;
            
        }

        if(bx>=wid-ball.getWidth(null) || bx<0){
            bxVel = (1.05*bxVel)*-1;

        }

        if(y>=hei-saucer.getHeight(null) || y<0){
            yVel = (1.02*yVel)*-1;
            
        }

        if(by>=hei-ball.getHeight(null) || by<0){
            byVel = (1.05*byVel)*-1;

        }


        x = (int) (x + xVel);
        y = (int) (y + yVel);

        bx = (int) (bx + bxVel);
        by = (int) (by + byVel);

        repaint();
        
    }



}
