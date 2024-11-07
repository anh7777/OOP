package oop.hus.lab5.ballplayer;

import java.util.ArrayList;
import java.util.List;

public class SoccerGame {
    public static void main(String[] args) {
        Ball ball = new Ball(0, 0, 0);
        List<Player> teamA = new ArrayList<>();
        List<Player> teamB = new ArrayList<>();

        for (int i = 1; i <= 11; i++) {
            Player player = new Player(i, i, i);
            teamA.add(player);
        }

        for (int i = 12; i <= 22; i++) {
            Player player = new Player(i, i, i);
            teamB.add(player);
        }

        for (int i = 0; i < 90; i++) {
            for (Player player : teamA) {
                if (player.near(ball)) {
                    player.kick(ball);
                }
            }
            for (Player player : teamB) {
                if (player.near(ball)) {
                    player.kick(ball);
                }
            }
        }

        System.out.println("Final position of the ball: " + ball);
    }
}
