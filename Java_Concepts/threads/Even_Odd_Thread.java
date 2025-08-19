package threads;

import java.util.ArrayList;
import java.util.List;

public class Even_Odd_Thread {
int currentRes=0;
List<Integer> oddEvenlist;
Even_Odd_Thread(List<Integer> oddEvenlist){
    this.oddEvenlist=oddEvenlist;
}
void printOdd(){
    synchronized (this){
        while (oddEvenlist.size()>currentRes){
            int element=oddEvenlist.get(currentRes);
            if(element%2!=0){
                System.out.println(element+"is odd");
                notify();
            }
            else {
                try{
                    wait();
                }
                catch (InterruptedException e){
                    throw  new RuntimeException(e);
                }
            }
        }
    }

}










        void printEven(){
            synchronized (this){
                while(oddEvenlist.size()>currentRes){
                    int element= oddEvenlist.get(currentRes);
                    if(element%2==0){
                        System.out.println(element+"is even");
                        currentRes++;
                        notify();
                    }
                    else {
                        try{
                            wait();

                        }
                        catch (InterruptedException e){
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }

    public static void main(String[] args) {
        List<Integer> oddEven = List.of(1,2,4,5,6,3,7,11,46);
        Even_Odd_Thread printOddEvenUsingThreads = new Even_Odd_Thread(oddEven);
        Thread oddThread = new Thread(()->{
            printOddEvenUsingThreads.printOdd();
        } , "oddThread");

        Thread evenThread = new Thread(()->{
            printOddEvenUsingThreads.printEven();
        } , "evenThread");

        oddThread.start();
        evenThread.start();
    }

}
