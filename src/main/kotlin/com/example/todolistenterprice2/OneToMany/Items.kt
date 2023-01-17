package com.example.todolistenterprice2.OneToMany

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import jakarta.persistence.*
import net.minidev.json.annotate.JsonIgnore

@Entity
@Table(name = "ITEMS")
class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private val id: Long = 0

    @JsonProperty("item_id")
    @Column(name = "item_id")
    private var itemId: String? = null

    @JsonProperty("item_total")
    @Column(name = "item_total")
    private var itemTotal = 0.0
    @JsonProperty
    @Column(name = "quantity")
    private var quantity = 0

//    @JsonProperty

    @ManyToOne(fetch = FetchType.LAZY)

    @JoinColumn(name = "cart_id", nullable = true)
    var cart: Cart? = null

    //Hibernate requires no-args constructor
    constructor()
    constructor(itemId: String?, total: Double, qty: Int, c: Cart?) {
        this.itemId = itemId
        itemTotal = total
        quantity = qty
        cart = c
    } //Getter Setter methods
}