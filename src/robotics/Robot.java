package robotics;

/**
 * Created by java on 26.01.2018.
 */
public class Robot {//base class


    private String name;
    private int cpu;
    private int serialNumder;


    protected void thinking() {//

        if(checkOnSerialNumber()==true) {
            if (cpu > 2) {
                System.out.println("i am thinking very good");
            } else {
                System.out.println("i am stuped");
            }
        }
        System.out.println("robot must exist with serial number");
    }

    private boolean checkOnSerialNumber(){//метод исп-ся только в классе
        if(serialNumder!=0){
          return true;
        }
        return false;
    }




    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public String getName() {
        System.out.println("is Robot get name");
        return name;
    }

    public void setName(String name) {
        System.out.println("it is robot set name");
        this.name = name;
    }

    public int getSerialNumder() {
        return serialNumder;
    }

    public void setSerialNumder(int serialNumder) {
        this.serialNumder = serialNumder;
    }
}
