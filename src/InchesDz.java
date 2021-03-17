public class InchesDz {
    public static void main(String[] args) {
        double inches, meters;
        int counter;
        counter = 0;
        for (inches = 1; inches <= 144; inches++) {
            meters = inches / 39.37; //преобразовать в метры
            System.out.println(inches + " дюймов соответствует " + meters + " метрам");

            counter++;
            //Каждая 12-я строка должна быть пустой
            if (counter == 12) {
                System.out.println();
                counter = 0; //сбросить счетчик строк
            }
        }
    }
}
