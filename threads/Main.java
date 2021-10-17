package threads;

public class Main {
    public static void main(String[] args){
    
        Task_1 obj1=new Task_1();
        Task_2 obj2=new Task_2();

        obj1.start();
        try{
            Thread.sleep(1000);
        }catch(Exception x){}
        obj2.start();
    }
}