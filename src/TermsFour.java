public class TermsFour {
    public static void main(String[] args) {
        int deliveryDistance = 95;
        int deliveryDays = 1;
        int interval = 40;
        int firstDayDistance = 20;
        if ((deliveryDistance % interval) < firstDayDistance && interval >= firstDayDistance) {
            deliveryDays += deliveryDistance / interval;
            System.out.println(deliveryDays);
        } else if (interval < firstDayDistance) {
            System.out.println("Ошибка! Интервал доставки не может быть меньше интервала первого дня");
        } else {
            deliveryDays += deliveryDistance / interval + 1;
            System.out.println(deliveryDays);
        }
    }
}
