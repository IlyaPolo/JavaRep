package level_2;

import java.util.Random;

public class Robot implements Team {
    Random random = new Random();
    private String name;
    private int robotRun = random.nextInt(3000);
    private double robotJump = Math.random() * (10 - 1) +1;

    protected Robot(String name){
        this.name = name;
    }

    public void run(Treadmill t){
        System.out.println(name + " бежит!!");
        t.smbRun(robotRun);
    }

    public void jump(Wall w) {
        System.out.println(name + " прыгает");
        w.smbClimb(robotJump);
    }
}
