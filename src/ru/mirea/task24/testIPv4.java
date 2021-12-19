package ru.mirea.task24;
import java.util.Scanner;
import java.util.regex.Pattern;
/*IPv4-адреса, в большинстве случаев,
записываются способом с 4 десятичными числами от 0 до 255 и разделены точкой.
 Например: 172.128.1.2. */
public class testIPv4 {
    private static boolean checkIP(String ip) {
        return ip.matches("(\\d|\\d\\d|[01]\\d\\d|2[01234]\\d|25[0-5]).(\\d|\\d\\d|[01]\\d\\d|2[01234]\\d|25[0-5]).(\\d|\\d\\d|[01]\\d\\d|2[01234]\\d|25[0-5]).(\\d|\\d\\d|[01]\\d\\d|2[01234]\\d|25[0-5])");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputIP = sc.nextLine();
        if (checkIP(inputIP) == true)
            System.out.println("Строка является IPv4-адресом");
        else System.out.println("Строка не является IPv4-адресом");
    }
}
