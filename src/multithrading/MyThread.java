package multithrading;

public class MyThread extends Thread{
    public void run(){
        for (int i =1; i <= 5; i++){
            System.out.println(Thread.currentThread().getName()+ " - value: "+ i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
