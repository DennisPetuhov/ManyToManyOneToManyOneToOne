package com.example.todolistenterprice2.OneToOne

import jakarta.persistence.*
@Entity
@Table(name = "post")
class Post {

    @Id
    @GeneratedValue
    private val id: Long? = null

    private val title: String? = null

    @OneToOne(mappedBy = "post", cascade = arrayOf(CascadeType.ALL), fetch = FetchType.LAZY, optional = false)
    private val details: Comment? = null
}



