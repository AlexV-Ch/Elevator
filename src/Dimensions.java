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

    public double getGabaritX() {
        return gabaritX;
    }

    public double getGabaritY() {
        return gabaritY;
    }

    public double getGabaritZ() {
        return gabaritZ;
    }

    public Dimensions setGabaritX(double gabaritX) {
        return new Dimensions(gabaritX, gabaritY, gabaritZ);
    }

    public Dimensions setGabaritY(double gabaritY) {
        return new Dimensions(gabaritX, gabaritY, gabaritZ);
    }

    public Dimensions setGabaritZ(double gabaritZ) {
        return new Dimensions(gabaritX, gabaritY, gabaritZ);
    }

    public double getDimensions () {
        return gabaritX * gabaritY * gabaritZ;
    }
}
