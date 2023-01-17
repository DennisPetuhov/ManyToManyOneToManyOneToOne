package com.example.todolistenterprice2.OneToMany

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping
@RestController
class CartItemController(
    var itemsRepository: ItemsRepository,
    var cartRepository: CartRepository
) {

    @GetMapping("/carts")
    fun getAllCarts(): List<Cart> {
        return cartRepository.findAll()
    }

    @GetMapping("/items")
    fun getAllItems(): List<Items> {
        return itemsRepository.findAll()
    }

    @PostMapping("/carts")
    fun postCart(@RequestBody cart: Cart): Cart {
        return cartRepository.save(cart)
    }

    @PostMapping("/items")
    fun postItem(@RequestBody items: Items): Items {
        System.out.println("$items")
        return itemsRepository.save(items)
    }

    @PostMapping("/items/{itemsId}/{cartId}")
    fun addditemsToCart(@PathVariable itemsId: Long, @PathVariable cartId: Long): Items {
        var items:Items = itemsRepository.findById(itemsId).get()
        var cart:Cart = cartRepository.findById(cartId).get()
        items.cart=cart
        return itemsRepository.save(items)





    }

}