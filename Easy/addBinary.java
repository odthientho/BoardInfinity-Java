package Easy;

public class addBinary {

    public static String addBinary(String a, String b) {
        int n = a.length();
        int m = b.length();
        if (n < m) return addBinary(b, a);

        int i = n-1, j = m-1;
        int carry = 0;
        StringBuilder res = new StringBuilder();
        while (i >= 0) {
            if (a.charAt(i--) == '1') carry++;
            if (j > -1 && b.charAt(j--) == '1') carry++;
            if (carry % 2 == 1) res.append('1');
            else res.append('0');
            carry /= 2;
        }
        if (carry % 2 == 1) res.append('1');
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11", "11"));
    }
}
