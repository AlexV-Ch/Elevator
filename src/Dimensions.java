public class Dimensions {
    private final double gabaritX;   // ширина
    private final double gabaritY;   // высота
    private final double gabaritZ;   // глубина

    //Габариты — ширина, высота и длина — должны храниться в отдельном иммутабельном классе Dimensions.
    // Создайте класс Dimensions с соответствующими полями и реализуйте в нём метод вычисления объёма груза
    // (название метода придумайте самостоятельно).

    public Dimensions(double gabaritX, double gabaritY, double gabaritZ) {
        this.gabaritX = gabaritX;
        this.gabaritY = gabaritY;
        this.gabaritZ = gabaritZ;
    }
    public double getDimensions () {
        return gabaritX * gabaritY * gabaritZ;
    }
}
