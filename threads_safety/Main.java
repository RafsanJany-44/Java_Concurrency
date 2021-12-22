public class Main{
    private static int count;

    public static void main(String[] args) throws InterruptedException{
        long startTime1 = System.nanoTime();

        Task_1 t1=new Task_1();
        mockTest mt= new mockTest();
        for(int i=0;i<=2000;i++){
        mt.Increament();;
        
        }
        long endTime1 = System.nanoTime();

        long startTime2 = System.nanoTime();
     Thread th1 =new Thread(new Runnable() {
            public void run(){
                for(int i=1;i<=1000;i++){
                    t1.Increament();
                    //mt.Increament();
                }
            }
        });
        
        Thread th2 =new Thread(new Runnable() {
            public void run(){
                for(int i=1;i<=1000;i++){
                t1.Increament();
                //mt.Increament();
                }
            }
        });

        th1.start();
        th2.start();
        
        th1.join();
        th2.join();
        long endTime2 = System.nanoTime();
       // System.out.println("Hello : "+mt.count);

        //long endTime = System.nanoTime();

        long duration1 = (endTime1 - startTime1);
        long duration2 = (endTime2 - startTime2);
        System.out.println("The Execution time 1: "+duration1);
        System.out.println("The Execution time 2: "+duration2);

    }
}