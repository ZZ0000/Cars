package CallBack;

import javax.swing.*;

/**
 * Created by semeykin on 13.10.2016.
 */
public class ClassA {
    interface Callback{
        void callingBack();
    }
    Callback callback;

    public void regidterCallBack(Callback callback){
        this.callback = callback;
    }

    void doSomething(){
        JOptionPane.showMessageDialog(null, "Выполняется работа");

        callback.callingBack();
    }
}
