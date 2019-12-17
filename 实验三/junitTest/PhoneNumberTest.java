package junitTest;

import org.junit.Test;

/**
 * Created by CHEN on 2019/12/10.
 */
public class PhoneNumberTest {


    @Test
    public void test() {

        System.out.println( PhoneNumber.isPhoneNumber("333"));
        System.out.println( PhoneNumber.isPhoneNumber("119"));

        System.out.println( PhoneNumber.isPhoneNumber("03132332"));
        System.out.println( PhoneNumber.isPhoneNumber("12312312"));

        System.out.println( PhoneNumber.isPhoneNumber("01222222340"));
        System.out.println( PhoneNumber.isPhoneNumber("11222222340"));
        System.out.println( PhoneNumber.isPhoneNumber("21222222340"));

        System.out.println( PhoneNumber.isPhoneNumber("012222223402"));
        System.out.println( PhoneNumber.isPhoneNumber("112222223402"));


    }
}
