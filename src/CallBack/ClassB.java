package CallBack;

/**
 * Created by semeykin on 13.10.2016.
 */
public class ClassB implements ClassA.Callback {
    @Override
    public void callingBack() {
        System.out.println("Метод обратного вызова");
    }
}
