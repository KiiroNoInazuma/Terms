public class TermsSix {
    public static void main(String[] args) {
        boolean bool = false;
        int result = 0;
        int buf;
        double rand = 100 + Math.random() * 900;
        int[] num = new int[3];
        num[0] = (int) rand % 1000 / 100;
        num[1] = (int) rand % 100 / 10;
        num[2] = (int) rand % 10;

        while (!bool) {
            for (int x = 0; x < num.length - 1; x++) {

                if (num[x] > num[x + 1]) {
                    bool = true;
                    result = num[0];
                } else {
                    buf = num[x];
                    num[x] = num[x + 1];
                    num[x + 1] = buf;
                    bool = false;
                }
            }
        }
        System.out.println("Самая большая цифра в числе " + (int) rand + " это " + result);
    }
}

