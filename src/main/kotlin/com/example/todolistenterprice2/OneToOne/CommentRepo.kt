package com.example.todolistenterprice2.OneToOne

import org.springframework.data.jpa.repository.JpaRepository

interface CommentRepo:JpaRepository<Comment,Long> {
}