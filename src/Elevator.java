public class Elevator {
    private int currentFloor = 1; //(текущий этаж)
    private int minFloor;     //минимальный этаж
    private int maxFloor;     //максимальный этаж

    // конструктор
    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    // Метод getCurrentFloor, возвращающий текущий этаж, на котором находится лифт
    public int getCurrentFloor() {
        return currentFloor;
    }
    //Метод moveDown -  перемещающий лифт на один этаж вниз (уменьшающий значение переменной currentFloor на единицу)
    public void moveDown() {
        //if (currentFloor > minFloor) {
            currentFloor = currentFloor - 1;
        //}
    }
    // Метод moveUp, перемещающий лифт на один этаж вверх
    public void moveUp() {
        //if (currentFloor < maxFloor) {
            currentFloor = currentFloor + 1;
        //}
    }
    //Метод move(int floor), перемещающий лифт на заданный в параметре этаж, если он задан верно.
    // Если параметр у метода задан неверно, ничего не делать и выводить в консоль сообщение об ошибке.
    // Этот метод может перемещать лифт только последовательно, по одному этажу,
    // с помощью циклов и методов moveUp и moveDown, и он должен выводить в консоль текущий этаж
    // после каждого перемещения между этажами.
    public void move(int floor) {
        if (floor >= minFloor && floor <= maxFloor) {
            System.out.println("Вы на " + currentFloor +" этаже");
            while (currentFloor != floor) {
                if (currentFloor > floor) {
                    moveDown();
                    System.out.println("Вы на " + currentFloor +" этаже");
                } else  {
                    moveUp();
                    System.out.println("Вы на " + currentFloor +" этаже");
                }

            }
            System.out.println("Вы приехали на " + currentFloor + " этаж");


        } else {
            System.out.println("Вы ошиблись при вводе. Нет такого этажа");
        }

    }
}
