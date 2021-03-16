public class GalToLit {
    public static void main(String[] args) {
        double gallons; //в этой перменной хранится значение,
                        //выражающее объем жидкости в галлонах
        double liters; //в этой переменной хранится значение,
                        //выражающее объем жидкости в литрах.

        gallons = 10; //начальной значение соответствует 10 галлонам
        liters = gallons * 3.7854; //Перевод в литры

        System.out.println(gallons + " галлонам соответствует " + liters + " литра");
    }
}
