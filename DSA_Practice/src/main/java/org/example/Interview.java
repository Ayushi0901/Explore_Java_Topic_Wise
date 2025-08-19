package org.example;

public class lowesInterview {
    private static lowesInterview instance;
    private lowesInterview(){

    }
    public static lowesInterview getInstance(){
        if(instance==null){
            instance=new lowesInterview();
        }
        return instance;
    }
    public static void main(String[] args) {
        
    }

}
