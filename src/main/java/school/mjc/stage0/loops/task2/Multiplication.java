package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int counter = 0;
        if(multiplyByAndToInclusive == 0) return;
        while(Math.abs(multiplyByAndToInclusive) >= counter){
            System.out.println(counter* multiplyByAndToInclusive);
            counter++;
        }
    }

}
