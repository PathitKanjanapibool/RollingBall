package Lib;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RollingBall extends JFrame {
    public RollingBall(){
        Container cp = this.getContentPane();
        cp.setLayout(new BorderLayout());
        Draw d = new Draw();
        cp.add(d, BorderLayout.CENTER);
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
class Draw extends JPanel implements ActionListener{
    int xy = 5;
    int size = 100;
    int n=0;
    public Draw(){
        Timer timer = new Timer(50, this);
        timer.start();
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int x = (getWidth() - size) / 2;
        int y = (getHeight() - size) / 2;

        int cx = x + size / 2;
        int cy = y + size / 2;


        g.setColor(Color.BLACK);
        g.drawOval(x, y, size, size);
        g.fillArc(x, y, size, size, 0, 180);

       
    }

    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    
}



