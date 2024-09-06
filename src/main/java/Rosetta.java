
import java.util.ArrayList;
import java.util.List;

// CoPilot = true
public class Rosetta implements Runnable {
    //public abstract class Rosetta implements Runnable {

    private int instanceVariable;
    private static final int CONSTANT = 10;

    public Rosetta() {
        this.instanceVariable = 0;
    }

    //public abstract void abstractMethod();

    public void synchronizedMethod() {
        synchronized (this) {
            this.instanceVariable++;
        }
    }

    public static void main(String[] args) {
        Rosetta example = new Rosetta();
        //example.abstractMethod();
        example.synchronizedMethod();

        int[] array = {1, 2, 3, 4, 5};
        for (int i : array) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

        try {
            example.throwException();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally block executed");
        }

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (int i = 0; i < list.size(); i++) {
            switch (list.get(i)) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                default:
                    System.out.println("Other");
            }
        }

        boolean condition = true;
        while (condition) {
            condition = false;
        }

        do {
            System.out.println("Do-while loop");
        } while (false);

        assert example != null : "Example is null";

        example.nativeMethod();
    }

    public void throwException() throws Exception {
        throw new Exception("Exception thrown");
    }

    public native void nativeMethod();

    @Override
    public void run() {
        System.out.println("Running in a thread");
    }
}
/* 
class RosettaImpl extends Rosetta {

    @Override
    public void abstractMethod() {
        System.out.println("Abstract method implemented");
    }
}*/
