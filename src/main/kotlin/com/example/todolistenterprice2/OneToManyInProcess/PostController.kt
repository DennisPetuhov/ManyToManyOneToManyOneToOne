//package com.example.todolistenterprice2.OneToManyInProcess
//
//import jakarta.validation.Valid
//import org.springframework.data.domain.Page
//import org.springframework.data.domain.Pageable
//import org.springframework.http.ResponseEntity
//import org.springframework.validation.annotation.Validated
//import org.springframework.web.bind.annotation.*
//
//
//@RestController
//@RequestMapping("/api")
//class PostController(val postRepository: PostRepository) {
//    @GetMapping("/posts")
//    fun getAllPosts(pageable: Pageable?): Page<Post?>? {
//        return postRepository.findAll(pageable!!)
//    }
//
//    @PostMapping("/post")
//    fun cratePost(@Valid @RequestBody post: Post): Post {
//        return postRepository.save(post)
//    }
//
//    @PutMapping("/posts/{postId}")
//    fun updatePost(@PathVariable postId: Long, @Validated @RequestBody requestPost: Post): Post {
//        val post = postRepository.findById(postId).get()
//        requestPost.title?.let {
//            post.setTittle(it)
//        }
//        return postRepository.save(post)
//
//    }
//
//
////    @PutMapping("/posts/{postId}")
////    fun updatePostFromExanple(@PathVariable postId: Long, @RequestBody postRequest: @Valid Post?): Post? {
////        return postRepository.findById(postId).map<Post>(Function { post: Post ->
////            post.title = postRequest!!.title
//////            post.setDescription(postRequest.description)
//////            post.setContent(postRequest.content)
////            postRepository.save(post)
////        }).orElseThrow {
////            ResourceNotFoundException(
////                "PostId $postId not found"
////            )
////        }
////    }
////    @DeleteMapping("/posts/{postId}")
////    fun deletePost(@PathVariable postId: Long):ResponseEntity<Post>{
////        postRepository.findById(postId).map {
////            postRepository.delete(it!!)
////        }
////        return ResponseEntity.ok().build()
////    }
////    @DeleteMapping("/posts/{postId}")
////    fun deletePostSimple (@PathVariable postId: Long):Post{
////        postRepository.deleteById(postId)
////
////    }
//
//
//    @DeleteMapping("/posts/{postId}")
//    fun deletePost(@PathVariable postId: Long): ResponseEntity<*>? {
//        return postRepository.findById(postId).map<ResponseEntity<Any?>> {
//            postRepository.delete(it!!)
//            ResponseEntity.ok().build()
//        }.orElseThrow {
//            ResourceNotFoundException(
//                "PostId $postId not found"
//            )
//        }
//    }
//
//}
//
//
//
//
//
