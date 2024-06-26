package Multithreading;


class A extends Thread{
    public void run(){
        for (int i = 0; i <= 100; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int j = 0; j <= 100; j++){
            System.out.println("Hello");
            try{
                Thread.sleep(10);
            } catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}

public class extendThread {

    public static void main(String args[]){

        A obj1 = new A();
        B obj2 = new B();

        obj1.setPriority(Thread.MAX_PRIORITY);

        System.out.println(obj1.getPriority());

        obj1.start();
        try{
            Thread.sleep(10);
        } catch(InterruptedException e){
            throw new RuntimeException(e);
        }
        obj2.start();
        try{
            Thread.sleep(10);
        } catch(InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}

