public class TermsOne {
    public static void main(String[] args) {
        int clientOS = 1;
        String os;
        if (clientOS == 0) {
            os = "iOS";
            System.out.println("Установите версию приложения для " + os + " по ссылке.");
        } else if (clientOS==1) {
            os = "Android";
            System.out.println("Установите версию приложения для " + os + " по ссылке.");
        } else{
            System.out.println("ERROR");
        }
    }
}
