//package com.example.todolistenterprice2.OneToManyInProcess
//
//import jakarta.validation.Valid
//import org.springframework.web.bind.annotation.*
//
//@RestController
//@RequestMapping("/api")
//class CommentController
//    (
//    private val commentRepository: CommentRepository,
//    private val postRepository: PostRepository
//) {
//    @PostMapping("/posts/{postId}/comments")
//    fun createComment(@PathVariable postId: Long, @Valid @RequestBody comment: Comment): Comment? {
//        postRepository.findById(postId).map {
//            comment.post = it
//            commentRepository.save(comment)
//
//        }.orElseThrow {
//            ResourceNotFoundException(
//                "PostId $postId not found"
//            )
//        }
//        return comment
//    }
//
//
//    fun createCommentFromExample(
//        @PathVariable(value = "postId") postId: Long,
//        @Valid @RequestBody comment: Comment
//    ): Comment? = postRepository.findById(postId).map { post: Post? ->
//        comment.post = post
//        commentRepository.save(comment)
//    }.orElseThrow {
//        ResourceNotFoundException(
//            "PostId $postId not found"
//        )
//    }
//
//
//}