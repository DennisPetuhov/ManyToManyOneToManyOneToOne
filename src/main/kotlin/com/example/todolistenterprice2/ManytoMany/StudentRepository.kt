package com.example.todolistenterprice2.ManytoMany

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentRepository:JpaRepository<Student,Long> {
}