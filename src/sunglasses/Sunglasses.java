package sunglasses;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Sunglasses {

    public static void main(String[] args) {
        JFrame frame = new JFrame("il mio bersaglio");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String crechi = JOptionPane.showInputDialog("quanti cherchi?");
        int n = Integer.parseInt(crechi);
        JSunglasses panel = new JSunglasses(n);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);

    }

}

class JSunglasses extends JPanel {

    int cerchi;
    int x = 50, y = 130, diametro = 200;

    public JSunglasses(int cerchi) {
        this.cerchi = cerchi;
        setBackground(Color.LIGHT_GRAY);
        setPreferredSize(new Dimension(500, cerchi*diametro));
    }

    @Override
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        page.setColor(Color.BLACK);
        for (int i = 0; i < cerchi; i++) {
            if (i % 2 == 0) {
                page.fillOval(x, y, diametro, diametro);
                x += diametro;
            } else {
                page.fillOval(x, y, diametro, diametro);
                x = 50;
                y += diametro;
            }

        }

    }

}
