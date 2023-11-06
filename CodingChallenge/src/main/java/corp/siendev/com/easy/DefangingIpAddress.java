package corp.siendev.com.easy;

/**
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 * A defanged IP address replaces every period "." with "[.]".
 * <pre>
 *  Example 1:
 *      Input: address = "1.1.1.1"
 *      Output: "1[.]1[.]1[.]1"
 *
 *  Example 2:
 *      Input: address = "255.100.50.0"
 *      Output: "255[.]100[.]50[.]0"
 * </pre>
 */
public class DefangingIpAddress {
    public static void main(String[] args) {
        String ipAddress = "255.100.50.0";
        System.out.println(defangIPaddr(ipAddress));
    }

    private static String defangIPaddr(String ipAddress) {
        String replacement = "[.]";
        return ipAddress.replaceAll("\\.", replacement);
    }
}
