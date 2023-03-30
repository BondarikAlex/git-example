package Formula_HD;

public enum Toppings {
    SWEET_ONIONS(12,1),HALAPENU(13,1),CHILE(14,1),
    PICKLED_CUCUMBER(9,1);


    final int price;
    final int dosa;

    Toppings(int price, int dosa) {
        this.price = price;
        this.dosa = dosa;
    }
}
