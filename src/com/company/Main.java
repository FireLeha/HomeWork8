package com.company;

public class Main {
    public static void main(String[] args) {
        JumpableRunnable[] members = {
                new Human(2, 2, "Жорик"),
                new Human(1, 2, "Вартанов"),
                new Cat(3, 4, "Бубоник"),
                new Cat(1, 1, "Нанорик"),
                new Robot(0, 10, "R2D2"),
                new Robot(4,7,"E2E4")
        };

        Obstaclable[] obstacles = {
                new RunningTrack(1),
                new RunningTrack(4),
                new Wall(1),
                new Wall(3)
        };

        for (JumpableRunnable member : members) {
            System.out.println("К прохождению препятствий приступает " + member);
            boolean winner = true;
            for (Obstaclable obstacle : obstacles) {
                System.out.println(member + " пробует пройти " + obstacle);
                if (obstacle.toJump(member.getMaxHeight()) ||
                        obstacle.toRun(member.getMaxLength())) {
                    System.out.println("И у него получается!");
                } else {
                    winner = false;
                    System.out.println("И у него не получается.");
                    break;
                }
            }

            if(winner) {
                System.out.println(member + " прошёл дистанцию!");
            } else {
                System.out.println(member + " проиграл.");
            }
            System.out.println();
        }
    }
}
