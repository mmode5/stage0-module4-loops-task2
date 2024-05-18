package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int quantity = 0;
        while(printTillInclusive >= quantity){
            if(quantity % 2  == 0){
                System.out.println(quantity);
            }
            quantity++;
        }
    }
}
