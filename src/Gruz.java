public class Gruz {
    // private String name;      // наименование товара
    private double gabarit;   // габариты М.куб.
    private double massa;     // масса кг.
    private String adres;     // адрес доставки
    private boolean rotat;   // Если Т - можно переворачивать, F - нельзя переворачивать
    private String regnum;    // регистрационный номер
    private boolean steklo;   // Если Т - хрупкий груз, F - не хрупкий груз

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

    public void setGabarit(double gabarit) {
        this.gabarit = gabarit;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public void setRotat(boolean rotat) {
        this.rotat = rotat;
    }

    public void setRegnum(String regnum) {
        this.regnum = regnum;
    }

    public void setSteklo(boolean steklo) {
        this.steklo = steklo;
    }



}
