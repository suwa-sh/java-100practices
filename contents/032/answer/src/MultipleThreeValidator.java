/**
 * 032で用いる3の倍数判定装置.
 *
 * @author jsfkdt
 */
public class MultipleThreeValidator implements Validator {

    /**
     * {@inheritDoc}
     */
    public boolean isValid(int number) {
         return number % 3 == 0;
    }
}