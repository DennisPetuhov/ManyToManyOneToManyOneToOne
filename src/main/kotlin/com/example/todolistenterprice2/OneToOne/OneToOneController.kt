package com.example.todolistenterprice2.OneToOne

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class OneToOneController(val postRepo: PostRepo,val commentRepo: CommentRepo) {

    @PostMapping("/onetoontcoments")
    fun makeComment(@RequestBody comment: Comment):Comment{
      return  commentRepo.save(comment)
    }
    @PostMapping("/onetooneposts")
    fun makePost(post: Post):Post{
        return postRepo.save(post)
    }
    



}