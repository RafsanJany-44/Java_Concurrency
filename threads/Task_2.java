package threads;

public class Task_2 extends Thread {
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Task 2 continue: "+i);
            try{
                Thread.sleep(5000);
            }
            catch(Exception e){}
        }
        System.out.println("Task 2 Completed");
    }
}