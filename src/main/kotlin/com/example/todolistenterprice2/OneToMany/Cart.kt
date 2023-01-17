package com.example.todolistenterprice2.OneToMany

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.persistence.*
import net.minidev.json.annotate.JsonIgnore

@Entity
@Table(name = "cart")
 class Cart(){
    @Id
    @JsonProperty
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id")
    private val id: Long = 0
    @JsonProperty
    @Column(name = "total")
    private val total: Float = 0F
    @JsonProperty
    @Column(name = "name")
    private val name: String? = null



    @JsonIgnore
    @OneToMany(mappedBy = "cart")
    private val items: Set<Items>? = null
}