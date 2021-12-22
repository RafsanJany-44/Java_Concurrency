import java.util.concurrent.atomic.AtomicInteger;


public class Task_2 {

    
    AtomicInteger count = new AtomicInteger();
    public synchronized void Increament(){
        count.incrementAndGet();
    }
    
}
