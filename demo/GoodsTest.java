public class GoodsTest {
    public static void main(String[] args) {
        Goods[] arr = new Goods[3];

        Goods g1 = new Goods("001", "小米11", 4999.0, 500);
        Goods g2 = new Goods("002", "小米su7", 299999.0, 1000);
        Goods g3 = new Goods("003", "小米驱蚊器", 69.9, 30);

        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            System.out.println(goods.getId() + ", " + goods.getName() + ", " + goods.getPrice() + ", " + goods.getCount());
        }
    }
}
