package level_2;

import java.util.Random;

public class Human implements Team {
    Random random = new Random();
    private String name;
    private int humanRun = random.nextInt(1000);
    private double humanJump = Math.random();

    protected Human(String name){
        this.name = name;
    }

    public void run(Treadmill t){
        System.out.println(name + " бежит!!");
        t.smbRun(humanRun);
    }

    public void jump(Wall w) {
        System.out.println(name + " прыгает");
        w.smbClimb(humanJump);
    }
}
