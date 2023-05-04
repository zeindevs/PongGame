package com.zeindevs;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    GamePanel panel;

    public GameFrame() throws HeadlessException {
        panel = new GamePanel();
        this.add(panel);
        this.setTitle("Pong Game");
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }
}
