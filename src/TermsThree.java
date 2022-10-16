public class TermsThree {
    public static void main(String[] args) {
        int year = 4;
        String text = " год является високосным.";
        String textOther = " год не является високосным.";
        if (((year % 4 == 0) && (year % 100 != 0)) || ((year % 400 == 0) && (year % 100 == 0))) {
            System.out.println(year + text);
        } else {
            System.out.println(year + textOther);
        }
    }
}
