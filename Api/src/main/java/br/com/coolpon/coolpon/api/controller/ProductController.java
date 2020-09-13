package br.com.coolpon.coolpon.api.controller;

import br.com.coolpon.coolpon.Product;
import br.com.coolpon.coolpon.ShoppingCart;
import br.com.coolpon.coolpon.api.dto.UserDto;
import br.com.coolpon.coolpon.api.service.ProductService;
import br.com.coolpon.coolpon.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    List<ShoppingCart> shoppingCarts = new ArrayList<>();
    @Autowired
    UserService userService;
    @Autowired
    ProductService productService;
    @PostMapping("/{idUser}")
    public ResponseEntity addProduct(@PathVariable Integer idUser, @RequestBody Product product){
        productService.addProduct(idUser,product);
        return ResponseEntity.status(201).build();
    }

    @GetMapping("/{idUser}")
    public ResponseEntity getAllProduct(@PathVariable Integer idUser){
        UserDto user = userService.getUserById(idUser);
        List<Product> products = new ArrayList<>();
        for (ShoppingCart shoppingCart : shoppingCarts){
            if(shoppingCart.getUser().getId().equals(user.getId())){
                products = shoppingCart.getProductList();
                break;
            }
        }
        if (products.isEmpty()){
            return ResponseEntity.status(204).build();
        }else {
            return ResponseEntity.ok(products);
        }
    }

    public List<ShoppingCart> getShoppingCarts() {
        return shoppingCarts;
    }

    public void setShoppingCarts(List<ShoppingCart> shoppingCarts) {
        this.shoppingCarts = shoppingCarts;
    }
}
