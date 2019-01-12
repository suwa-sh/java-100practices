import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 021の解答です.
 *
 * @author jsfkdt
 */
public interface RandomRmi extends Remote {
    
    /**
     * 021の解答です.0〜7の任意の整数を返します.
     * @return 0〜7の任意の整数（ランダム）
     */
    int returnRandom() throws RemoteException;
}