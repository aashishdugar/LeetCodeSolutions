import java.util.concurrent.Semaphore;
class ZeroEvenOdd {
    private int n;
    private final Semaphore zero;
    private final Semaphore even;
    private final Semaphore odd;
    int val = 1;
    
    
    public ZeroEvenOdd(int n) {
        this.n = n;
        zero = new Semaphore(1);
        even = new Semaphore(0);
        odd = new Semaphore(0);
    }
    
    
        // printNumber.accept(x) outputs "x", where x is an integer.
        public void zero(IntConsumer printNumber) throws InterruptedException {
            for (int i = 0; i<n; i++){
            zero.acquire();
            printNumber.accept(0);
            if(val%2 == 0) even.release();     
            else odd.release();
            }
            
        }
        public void even(IntConsumer printNumber) throws InterruptedException {
            for(int i = 0; i<n/2; i++) {
                even.acquire();
                printNumber.accept(val++);
                zero.release();
            }
        }

        public void odd(IntConsumer printNumber) throws InterruptedException {
            for(int i = 0; i<n/2+n%2; i++){
                odd.acquire();
                printNumber.accept(val++);
                zero.release();
            }
        } 
}