package com.example.todolistenterprice2

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class TigerController(private var repository: TigerRepository) {
    @GetMapping("/tigers")
    fun findTigers(): List<TigerEntity> {
        return repository.findAll()
    }

    @PostMapping("/tigers")
    fun createTiger(@RequestBody tiger: TigerEntity) {
        repository.save(tiger)

    }

    @GetMapping("/tigers/{id}")
    fun findTigerById(@PathVariable id: Long): TigerEntity {
        return repository.findById(id).get()
    }


}





