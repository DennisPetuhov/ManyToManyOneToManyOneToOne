package com.example.todolistenterprice2.OneToOne

import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.persistence.*
import java.util.*


@Entity
@Table(name = "comment")

class Comment() {
    @Id
    @GeneratedValue
    private val id: Long? = null
    @JsonProperty ( "created_on")
    @Column(name = "created_on")
    private val createdOn: Date? = null
    @JsonProperty ( "created_by")
    @Column(name = "created_by")
    private val createdBy: String? = null

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id")
    private val post: Post? = null

}

