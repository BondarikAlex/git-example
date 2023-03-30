package Formula_HD;

public enum Ingridiendts {
    MAYONNAISE(1,13),KETCHUP(1,10),MUSTARD(1,11);

    final int dosa;
    final int price;

    Ingridiendts(int dosa, int price) {
        this.dosa = dosa;
        this.price = price;
    }
}
