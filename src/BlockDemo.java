/*
Демонстрация применения блоков кода.
Блок кода используетсядля того, чтобы предотвратить деление на нуль
 */
public class BlockDemo {
    public static void main(String[] args) {
        double i, j, d;
        i = 5;
        j = 10;

        //Телом этой инструкции if являтся целый блок кода
        if (i != 0) {
            System.out.println("i не равно нулю");
            d = j / i;
            System.out.print("j /i равно " + d);
        }
    }

}
