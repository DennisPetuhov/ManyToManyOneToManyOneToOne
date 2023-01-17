package com.example.todolistenterprice2

import org.springframework.data.jpa.repository.JpaRepository

interface DogRepository:JpaRepository<DogEntity,Long> {
}