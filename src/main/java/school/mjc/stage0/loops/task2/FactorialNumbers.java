package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public  void printFactorialRow(int printToInclusive) {
        int counter = 0;
        while(printToInclusive >= counter){
            int tempValue = 1;
            if(counter == 0 || counter ==1) {
                System.out.println(tempValue);
                counter++;
                continue;
            }else{
                for(int i = 2; i <=counter; i++){
                    tempValue*=i;
                }
                System.out.println(tempValue);
            }
            counter++;
        }
    }
}
