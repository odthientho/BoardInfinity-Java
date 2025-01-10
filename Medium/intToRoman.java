package Medium;

public class intToRoman {

    public String intToRoman(int num) {
        int first = num % 10;
        num /= 10;
        int second = num % 10;
        num /= 10;
        int third = num % 10;
        num /= 10;
        int fourth = num % 10;
        String firstChar = "";
        String secondChar = "";
        String thirdChar = "";
        String fourthChar = "";

        if (first == 1) firstChar = "I";
        else if (first == 2) firstChar = "II";
        else if (first == 3) firstChar = "III";
        else if (first == 4) firstChar = "IV";
        else if (first == 5) firstChar = "V";
        else if (first == 6) firstChar = "VI";
        else if (first == 7) firstChar = "VII";
        else if (first == 8) firstChar = "VIII";
        else if (first == 9) firstChar = "IX";

        if (second == 1) secondChar = "X";
        else if (second == 2) secondChar = "XX";
        else if (second == 3) secondChar = "XXX";
        else if (second == 4) secondChar = "XL";
        else if (second == 5) secondChar = "L";
        else if (second == 6) secondChar = "LX";
        else if (second == 7) secondChar = "LXX";
        else if (second == 8) secondChar = "LXXX";
        else if (second == 9) secondChar = "XC";

        if (third == 1) thirdChar = "C";
        else if (third == 2) thirdChar = "CC";
        else if (third == 3) thirdChar = "CCC";
        else if (third == 4) thirdChar = "CD";
        else if (third == 5) thirdChar = "D";
        else if (third == 6) thirdChar = "DC";
        else if (third == 7) thirdChar = "DCC";
        else if (third == 8) thirdChar = "DCCC";
        else if (third == 9) thirdChar = "CM";

        if (fourth == 1) fourthChar = "M";
        else if (fourth == 2) fourthChar = "MM";
        else if (fourth == 3) fourthChar = "MMM";

        return fourthChar + thirdChar + secondChar + firstChar;
    }

    public static void main(String[] args) {
        int num = 3749;
        System.out.println(new intToRoman().intToRoman(num));
    }
}
