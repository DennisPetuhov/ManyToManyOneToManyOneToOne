package com.example.todolistenterprice2

import org.springframework.data.jpa.repository.JpaRepository


interface TigerRepository:JpaRepository<TigerEntity,Long> {
}