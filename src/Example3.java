/*
    Демонстрация отличий между int и double
     */
public class Example3 {
    public static void main(String[] args) {
        int var;
        double x;

        var = 10;
        x = 10.0;

        System.out.println("Начальное значение перменной var: " + var);
        System.out.println("Начальное значение переменной x: " + x);
        System.out.println(); //печать пустой строки

        //Деление знаения обеих переменных на 4
        var  = var / 4;
        x = x /4;

        System.out.println("Значение переменной var после деления: " + var);
        System.out.println("Значение переменной x после деления: " + x);
    }

}
