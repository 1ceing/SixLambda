import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
class Computer implements Lockable {
    private String os;
    private Lock lock = new ReentrantLock();

    public Computer(String os) {
        this.os = os;
    }

    @Override
    public void lock() {
        lock.lock();
        System.out.println("Компбютер заблокирован");
    }

    public String getOs() {
        return os;
    }
}
