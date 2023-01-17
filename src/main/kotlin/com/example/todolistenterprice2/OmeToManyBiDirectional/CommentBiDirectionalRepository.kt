//package com.example.todolistenterprice2.OmeToManyBiDirectional
//
//import org.springframework.data.domain.Page
//import org.springframework.data.domain.Pageable
//import org.springframework.data.jpa.repository.JpaRepository
//import java.util.*
//
//
//interface CommentBiDirectionalRepository : JpaRepository<CommentBiDirectional?, Long?> {
//    fun findByPostId(postId: Long?, pageable: Pageable?): Page<CommentBiDirectional?>?
//    fun findByIdAndPostId(id: Long?, postId: Long?): Optional<CommentBiDirectional?>?
//}