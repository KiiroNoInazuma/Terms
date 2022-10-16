public class TermsFive {
    public static void main(String[] args) {
       int monthNumber = 12;

        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber+"-й месяц принадлежит к сезону зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber+"-й месяц принадлежит к сезону весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber+"-й месяц принадлежит к сезону лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber+"-й месяц принадлежит к сезону осень.");
                break;
            default:
                if(monthNumber>13) {
                    System.out.println("Номер месяца не может быть больше 13!");
                }
        }


    }
}
