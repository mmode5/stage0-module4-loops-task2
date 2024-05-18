package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public  void printPrimeNumbers(int printToInclusive) {
        int counter = 2;
        int condition = 0;
        while(printToInclusive >= counter){
          for(int i = 2; i< counter; i++ ){
              if(counter % i == 0){
                 condition = 1;
                 break;
              }
          }
          if(condition !=1) System.out.println(counter);
          condition = 0;
          counter++;
        }

    }
}
