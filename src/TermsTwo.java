public class TermsTwo {
    public static void main(String[] args) {
        int clientDeviceYear = 2015;
        int clientOS = 0;
        String osLight = " облегченную ";
        String os;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            os = "iOS";
            System.out.println("Установите версию приложения для " + os + " по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            os = "Android";
            System.out.println("Установите версию приложения для " + os + " по ссылке.");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            os = "iOS";
            System.out.println("Установите" + osLight + "версию приложения для " + os + " по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            os = "Android";
            System.out.println("Установите" + osLight + "версию приложения для " + os + " по ссылке.");
        } else {
            System.out.println("ERROR");
        }
    }
}

