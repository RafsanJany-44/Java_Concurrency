public class Main{
    public static void main(String[] args) throws InterruptedException{
        Task_1 t1=new Task_1();
        Thread th1 =new Thread(new Runnable() {
            public void run(){
                for(int i=1;i<=1000;i++){
                    t1.Increament();
                }
            }
        });

        Thread th2 =new Thread(new Runnable() {
            public void run(){
                for(int i=1;i<=1000;i++){
                    t1.Increament();
                }
            }
        });

        th1.start();
        th2.start();
        th1.join();
        th2.join();
        System.out.println("Hello : "+t1.count);

    }
}