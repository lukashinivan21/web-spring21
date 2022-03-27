package pro.sky.java.lesson21.webspring21.service;

import org.springframework.stereotype.Service;
import pro.sky.java.lesson21.webspring21.component.Order;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    private final Order order;

    public ProductServiceImpl(Order order) {
        this.order = order;
    }

    @Override
    public List<Integer> add(List<Integer> idsList) {
        return order.addIds(idsList);
    }

    @Override
    public List<Integer> printAllProducts() {
        return order.getIds();
    }
}
