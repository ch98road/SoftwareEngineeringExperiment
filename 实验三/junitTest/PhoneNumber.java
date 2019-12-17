package junitTest;

/**
 * Created by CHEN on 2019/12/10.
 */
public class PhoneNumber {

    public static boolean isPhoneNumber(String phoneNumber) {

        if (phoneNumber.length( ) == 3) {
            return (phoneNumber.charAt(0) == '1') ? true : false;
        } else if (phoneNumber.length( ) == 8) {
            return (phoneNumber.charAt(0) == '0') ? true : false;
        } else if (phoneNumber.length( ) == 11) {
            return (phoneNumber.charAt(0) == '0' || phoneNumber.charAt(0) == '1') ? true : false;
        } else if (phoneNumber.length( ) == 12) {
            return phoneNumber.charAt(0) == '0' ? true : false;
        }
        return false;

    }


}
