/*
Демонстрация использования перменных.
 */

public class Example2 {
    public static void main(String[] args) {
        int var1; //объявляется переменная
        int var2; //объявляется второая переменная

        var1 = 1024; //переменной var присваивается значение 1024
        System.out.println("Переменная var1 содержит " + var1);

        var2 = var1 / 2;

        System.out.print("Переменная var2 содержит var1 /2: ");
        System.out.println(var2);
    }
}
