import java.util.concurrent.Semaphore;

class FooBar {
    private int n;
    private final Semaphore foo;
    private final Semaphore bar;
    

    public FooBar(int n) {
        foo = new Semaphore(1);
        bar = new Semaphore(0);
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            foo.acquire();
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            bar.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            
            bar.acquire();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            foo.release();
        }
    }
}