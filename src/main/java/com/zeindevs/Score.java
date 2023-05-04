package com.zeindevs;

import java.awt.*;

public class Score {

    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    int player1;
    int player2;

    public Score(int gameWidth, int gameHeight) {
        Score.GAME_WIDTH = gameWidth;
        Score.GAME_HEIGHT = gameHeight;
    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.setFont(new Font("Consolas", Font.PLAIN, 60));
        g.drawLine(GAME_WIDTH / 2, 0, GAME_WIDTH / 2, GAME_HEIGHT);
        g.drawString(player1 / 10 + String.valueOf(player1 % 10), (GAME_WIDTH / 2) - 85, 50);
        g.drawString(player2 / 10 + String.valueOf(player2 % 10), (GAME_WIDTH / 2) + 20, 50);
    }
}
