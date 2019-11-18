package com.util;/**
 * <p></p>
 *
 * @author syoung
 * @since 2019-11-18 13:55
 */

/**
 * @ClassName 调用异常
 * @author songy
 * @Date
 * @Version 1.0
 */

public class ApiException extends Exception{
    public ApiException(String msg) {
        super(msg);
    }
}
