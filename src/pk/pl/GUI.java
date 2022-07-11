package pk.pl;

import pk.pl.sort.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileNotFoundException;

public class GUI extends JFrame implements MouseListener {
    private JButton runAlgorithmButton = new JButton("Start");
    private JButton exitButton = new JButton("Exit");

    public GUI() {
        this.setSize(300,500);

        this.runAlgorithmButton.addMouseListener(this);
        this.exitButton.addMouseListener(this);

        JPanel mainPanel = new JPanel();

        mainPanel.add(this.runAlgorithmButton);
        mainPanel.add(this.exitButton);

        this.add(mainPanel);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.runAlgorithmButton) {

        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
