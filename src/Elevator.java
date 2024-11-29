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
        if (currentFloor > minFloor) {
            currentFloor = currentFloor - 1;
        }
    }
    // Метод moveUp, перемещающий лифт на один этаж вверх
    public void moveUp() {
        if (currentFloor < maxFloor) {
            currentFloor = currentFloor + 1;
        }
    }
}
