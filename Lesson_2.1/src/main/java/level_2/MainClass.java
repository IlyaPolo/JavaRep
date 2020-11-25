package level_2;

public class MainClass {
    public static void main(String[] args) {
        Treadmill tr = new Treadmill();
        Wall wa = new Wall();

        Team[] tm = new Team[6];
        tm[0] = new Human("Илья");
        tm[1] = new Human("Коля");
        tm[2] = new Robot("Т1000");
        tm[3] = new Robot("Т800");
        tm[4] = new Cat("Бася");
        tm[5] = new Cat("Барсик");

        obstacleCourse[] oc = new obstacleCourse[6];
        oc[0] = new Treadmill();
        oc[1] = new Treadmill();
        oc[2] = new Wall();
        oc[3] = new Wall();
        oc[4] = new Treadmill();
        oc[5] = new Wall();

        for (int i = 0; i < tm.length; i++) {

            for (int j = 0; j < oc.length; j++) {
                if (oc[j].getClass() == Treadmill.class) {
                    tm[i].run(tr);
                    //System.out.println(tr.win);
                    if (tr.win == false) break;
                } else {
                    tm[i].jump(wa);
                    if (wa.win == false) break;
                }
            }
        }
    }
}
