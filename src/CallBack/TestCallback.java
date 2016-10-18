package CallBack;

/**
 * Created by semeykin on 13.10.2016.
 */
public class TestCallback {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        ClassB classB = new ClassB();

        classA.regidterCallBack(classB);
        classA.doSomething();

    }
}
