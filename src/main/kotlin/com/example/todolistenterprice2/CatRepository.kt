package com.example.todolistenterprice2

import org.springframework.data.jpa.repository.JpaRepository

interface CatRepository:JpaRepository<Cat,Long> {

}