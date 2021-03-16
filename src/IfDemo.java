/*
Демонстрация применения инструкции if
 */
public class IfDemo {
    public static void main(String[] args) {
        int a,b,c;

        a = 2;
        b =3;

        if (a < b) System.out.println("a меньше b");

        //Следующая строка никогда не должна быть выведена
        if (a == b) System.out.println("Вы не должны увидеть этот текст");

        System.out.println();

        c = a-b;//Переменная "c" содержит значение -1

        System.out.println("c сожержит -1");
        if (c >= 0) System.out.println("c - не отрицательное число");
        if (c < 0) System.out.println("c - отрицательное число");

        System.out.println();

        c = b - a;//Переменная "c" теперь содержит значение 1

        System.out.println("c сожержит 1");
        if (c >= 0) System.out.println("c - не отрицательное число");
        if (c < 0) System.out.println("c - отрицательное число");

    }
}
