package threads;

public class Threads{
    static class Thread1  extends Thread{
       @Override
        public void run() {
           for (int i = 0; i < 5; i++) {
               System.out.println("Thread1 bhag raha hai");
           }
       }
    }
    static class Thread2 extends Thread{
        @Override
        public void run(){
            for(int i=0;i<5;i++){
                System.out.println("Thread 2 bhi bhaag raha");
            }
        }
       /* There are two ways of creating a thread
    1. To create a thread class and override the run method
                then we will call thread.start();
    2. Another one is to Implement the runnable interface then provide this implementation to a thread
        then call start() method.

        Now if you simply create a runnable interface and give impl using lambda and then try to run
        that particular runnable impl using run  method it will run sequentially and call the run method of
        current thread.

        Also, if you want to sleep a thread then you should call thread.sleep() inside the run method of
        that particular thread sleep method works on the current thread not on the which it is called. */

    }

    public static void main(String[] args) {
    Thread t1= new Thread1();


    //using lambda
        Runnable t2=()->{
            for(int i=0;i<5;i++){
                System.out.println("Thread using lambda bhag rha "+ i);
            }
        };


        Thread testingThread = new Thread(t2);
        t1.start();
        t2.run();
//        testingThread.start();

        // Another way of implementing thread
        Thread myThread = new Thread(()->{
            System.out.println("I am thread with lambda experission for providing the implementation of runnable interface");
        });
        myThread.setName("Your thread");
        myThread.setPriority(8);
        myThread.start();
    }
}
