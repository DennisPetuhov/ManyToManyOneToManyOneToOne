package com.example.todolistenterprice2

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Contact
import io.swagger.v3.oas.annotations.info.Info
import io.swagger.v3.oas.annotations.info.License
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api")


class CatRestController(private  var catRepository: CatRepository) {
    @GetMapping("/cats")
    fun getAllCats():List<Cat>{
        return catRepository.findAll()

    }
//    POST http://localhost:8080/api/cats
//    Accept: application/json
//    Content-type: application/json
//
//    {
//        "id":1,
//        "name":"john",
//        "age":10
//    }

    @PostMapping("/cats")
    fun createCat(@RequestBody cat: Cat): Cat {
        return catRepository.save(cat)
    }
    @GetMapping("/cats/{id}")

    fun getCatById(@PathVariable id:Long): Cat {
        print(id)
        return  catRepository.findById(id).get()
    }

}