/**
 * 032で用いる3の倍数判定装置.
 *
 * @author jsfkdt
 */
interface Validator {
    /**
     * 3の倍数かどうかの判定結果を返却.
     *
     * @param number 指定の引数
     * @return boolean型
     */
    public boolean isValid(int a);
}