package level_2;

import java.util.Random;

public class Wall implements obstacleCourse {

    Random random = new Random();
    private double highWall = Math.random()*2;
    public boolean win = true;

    public void smbRun(int runLimit) {

    }

    public void smbClimb(double climbLimit) {
        if (climbLimit >= highWall){
            System.out.println("Стена преодалена!");
            win = true;
        }
        else {
            System.out.println("Неудача. Тренеруйся.");
            win = false;
        }

    }
}
