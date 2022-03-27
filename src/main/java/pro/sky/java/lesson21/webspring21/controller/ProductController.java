package pro.sky.java.lesson21.webspring21.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.lesson21.webspring21.service.ProductService;

import java.util.List;


@RestController
@RequestMapping("/order")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public String greeting() {
        return "New order";
    }

    @GetMapping("/add")
    public List<Integer> add(@RequestParam ("ids") List<Integer> ids) {
         return productService.add(ids);
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return productService.printAllProducts();
    }
}
