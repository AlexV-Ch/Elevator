public class Gruz {
    // private String name;      // наименование товара
    private final double gabarit;   // габариты М.куб.
    private final double massa;     // масса кг.
    private final String adres;     // адрес доставки
    private final boolean rotat;   // Если Т - можно переворачивать, F - нельзя переворачивать
    private final String regnum;    // регистрационный номер
    private final boolean steklo;   // Если Т - хрупкий груз, F - не хрупкий груз

    public Gruz(double gabarit, double massa, String adres, boolean rotat, String regnum, boolean steklo) {
        this.gabarit = gabarit;
        this.massa = massa;
        this.adres = adres;
        this.rotat = rotat;
        this.regnum = regnum;
        this.steklo = steklo;
    }
//Реализуйте в классе методы, дающие возможность изменять адрес доставки, габариты и массу груза
    // без изменения исходного объекта путём создания его копии.


    public double getGabarit() {
        return gabarit;
    }

    public double getMassa() {
        return massa;
    }

    public String getAdres() {
        return adres;
    }

    public boolean isRotat() {
        return rotat;
    }

    public String getRegnum() {
        return regnum;
    }

    public boolean isSteklo() {
        return steklo;
    }

    public Gruz setGabarit(double gabarit) {
        return new Gruz(gabarit, massa, adres, rotat, regnum, steklo);
    }

    public Gruz setMassa(double massa) {
        return new Gruz(gabarit, massa, adres, rotat, regnum, steklo);
    }

    public Gruz setAdres(String adres) {
        return new Gruz(gabarit, massa, adres, rotat, regnum, steklo);
    }

    public Gruz setRotat(boolean rotat) {
        return new Gruz(gabarit, massa, adres, rotat, regnum, steklo);
    }

    public Gruz setRegnum(String regnum) {
        return new Gruz(gabarit, massa, adres, rotat, regnum, steklo);
    }

    public Gruz setSteklo(boolean steklo) {
        return new Gruz(gabarit, massa, adres, rotat, regnum, steklo);
    }

    public String toString() {
        return "Объём:            " + gabarit + "\n" +
               "Масса:            " + massa + "\n" +
               "Адрес:            " + adres + "\n" +
               "Не переворачивать:" + rotat + "\n" +
               "Рег. номер:       " + regnum + "\n" +
               "Стекло:           " + steklo  + "\n";
    }

}
