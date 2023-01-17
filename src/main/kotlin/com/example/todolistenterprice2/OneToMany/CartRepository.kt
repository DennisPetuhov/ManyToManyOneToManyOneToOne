package com.example.todolistenterprice2.OneToMany

import org.springframework.data.jpa.repository.JpaRepository

interface CartRepository:JpaRepository<Cart,Long> {
}