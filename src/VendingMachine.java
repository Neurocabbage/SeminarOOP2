import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private int maxCapacity;
    private List<Product> list = new ArrayList<>();

    public VendingMachine(int maxCapacity, List<Product> list) {
        this.maxCapacity = maxCapacity;
        this.list = list;
    }

    public VendingMachine(int maxCapasity) {
        this.maxCapacity = maxCapasity;

    }

    public void add(Product product) {
        if (list.size() < maxCapacity) {
            list.add(product);
        } else {
            System.out.println("The vending machine is full, you cannot add products");
        }
    }

    public Product getProductName(String name) throws Exception {
        for (Product product : list) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        throw new Exception("Ничего не найденно");
    }

    public Product getProductByCost(double cost) throws Exception {
        for (Product product : list) {
            if (product.getCost() == cost) {
                return product;
            }
        }
        throw new Exception("Not found");
    }
}
