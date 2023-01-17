package com.example.todolistenterprice2

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class DogController(private val repository: DogRepository) {
    @GetMapping("/dogs")
    fun findDogs(): List<DogEntity> {
        return repository.findAll()

    }

    @PostMapping("/dogs")
    fun createDog(@RequestBody dog: DogEntity) {
        repository.save(dog)
    }

    @GetMapping("/dogs/{id}")
    fun findDogById(@PathVariable id: Long): DogEntity {
        return repository.findById(id).get()

    }
}