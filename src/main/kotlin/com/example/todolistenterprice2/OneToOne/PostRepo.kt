package com.example.todolistenterprice2.OneToOne

import org.springframework.data.jpa.repository.JpaRepository

interface PostRepo:JpaRepository<Post,Long> {
}