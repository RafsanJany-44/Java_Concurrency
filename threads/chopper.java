package threads;

public class chopper extends Thread {
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Task 1 continue: "+i);
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
        }
        System.out.println("Task 1 Completed");
}
