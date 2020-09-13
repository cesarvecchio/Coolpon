package br.com.coolpon.coolpon.api.service;

import br.com.coolpon.coolpon.Product;
import br.com.coolpon.coolpon.ShoppingCart;
import br.com.coolpon.coolpon.api.controller.ProductController;
import br.com.coolpon.coolpon.api.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    UserService userService;
    @Autowired
    ProductController productController;
    public void addProduct(Integer idUser, Product product){
        UserDto user = userService.getUserById(idUser);
        boolean foundShoppingCart = false;
        for (ShoppingCart shoppingCart : productController.getShoppingCarts()){
            if(shoppingCart.getUser().getId().equals(user.getId())){
                shoppingCart.getProductList().add(product);
                foundShoppingCart = true;
                break;
            }
        }
        if (!foundShoppingCart){
            ShoppingCart shoppingCart = new ShoppingCart();
            shoppingCart.setUser(user);
            shoppingCart.getProductList().add(product);
            productController.getShoppingCarts().add(shoppingCart);
        }
    }
}
