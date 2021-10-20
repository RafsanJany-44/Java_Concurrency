public class Sort {
    public static void main(String[] args){
        Thread t1=new Thread(()->
        {
            for(int i=1;i<=10;i++){
                System.out.println("Task 1 continue: "+i);
                try{
                    Thread.sleep(1000);
                }catch(Exception e){}
            }
            System.out.println("Task 1 Completed");
        });

        Thread t2=new Thread(()->
        {
            for(int i=1;i<=10;i++){
                System.out.println("Task 2 continue: "+i);
                try{
                    Thread.sleep(1000);
                }catch(Exception e){}
            }
            System.out.println("Task 2 Completed");
        });
         t1.start();
         t2.start();

    }
}
