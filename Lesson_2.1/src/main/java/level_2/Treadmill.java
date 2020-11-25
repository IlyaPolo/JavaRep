package level_2;

import java.util.Random;

public class Treadmill implements obstacleCourse {

    Random random = new Random();
    private int lenRun = random.nextInt(1000);
    public boolean win = true;

    public void smbRun(int runLimit){
        if (runLimit >= lenRun){
            System.out.println("Дистанция преодалена!");
            win = true;

        }
        else {
            System.out.println("Неудача. Тренеруйся.");
            win = false;
        }

    }


    public void smbClimb(double climbLimit) {

    }

}
