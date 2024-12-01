import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Elevator elevator = new Elevator(-3, 26);
        //while (true) {
        //    System.out.print("Введите номер этажа: ");
        //    int floor = new Scanner(System.in).nextInt();
        //    elevator.move(floor);
        //}

        //Напишите в методе main класса Main дополнительный код, который будет создавать
        // экземпляр класса (объект) груза и его копии при изменении тех или иный полей.
        // Напишите также код, который позволит проверить, что копирование действительно происходит.

        //    private double gabarit;   // габариты М.куб.
        //    private double massa;     // масса кг.
        //    private String adres;     // адрес доставки
        //    private boolean rotat;   // Если Т - можно переворачивать, F - нельзя переворачивать
        //    private String regnum;    // регистрационный номер
        //    private boolean steklo;   // Если Т - хрупкий груз, F - не хрупкий груз

        Dimensions gruz1v = new Dimensions(2,3,5);
        Gruz gruz1 = new Gruz(gruz1v.getDimensions(), 5,"Советская 51",true,"001A",false);

            System.out.println(gruz1.getAdres());
            System.out.println(gruz1v.getDimensions());

            gruz1.setAdres("Кирова 10");
            System.out.println(gruz1.getAdres());


    }
}