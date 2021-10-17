package threads;

public class chopper extends Thread {
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("Chopper "+i+" Km");
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }
        System.out.println("Task 1 Completed");

    }
}
