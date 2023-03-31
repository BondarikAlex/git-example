package Formula_HD;

public enum BaseHD {    //булочка с сосиской
    HodDog();


    private final int bread;
    private final int sausage;
    private final int price;

    BaseHD() {
        this.bread = 1;
        this.sausage = 1;
        this.price = 25;
    }

    public int getBread() {
        return bread;
    }

    public int getSausage() {
        return sausage;
    }

    public int getPrice() {
        return price;
    }
}
