package com.example.todolistenterprice2.OneToManyInProcess

import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*


interface CommentRepository : JpaRepository<Comment?, Long?> {
    fun findByPostId(postId: Long?, pageable: Pageable?): Page<Comment?>?
    fun findByIdAndPostId(id: Long?, postId: Long?): Optional<Comment?>?
}