package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
       int counter = 0;
       if(power < 0) System.out.println("too much power");
       while(power >= counter){
           System.out.println((int) Math.pow(2,counter));
           counter++;
       }
    }
}
