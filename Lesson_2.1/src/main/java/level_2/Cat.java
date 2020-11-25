package level_2;

import java.util.Random;

public class Cat implements Team {

    private String name;

    Random random = new Random();
    private int CatRun = random.nextInt(150);
    private double CatJump = Math.random() * (10 - 1) +1;

    protected Cat(String name){
        this.name = name;
    }

    public void run(Treadmill t){
        System.out.println(name + " бежит!!");
        t.smbRun(CatRun);
    }

    public void jump(Wall w) {
        System.out.println(name + " прыгает");
        w.smbClimb(CatJump);
    }
}
