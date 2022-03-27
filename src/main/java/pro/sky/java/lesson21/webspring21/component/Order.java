package pro.sky.java.lesson21.webspring21.component;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Order {

    private final List<Integer> ids;

    public Order() {
        this.ids = new ArrayList<>();
    }

    public List<Integer> addIds(List<Integer> idsList) {
        ids.addAll(idsList);
        return idsList;
    }

    public List<Integer> getIds() {
        return Collections.unmodifiableList(ids);
    }
}
