//package com.example.todolistenterprice2.OmeToManyBiDirectional
//
//import com.example.todolistenterprice2.OneToManyInProcess.AuditModel
//import com.example.todolistenterprice2.OneToManyInProcess.Post
//import jakarta.persistence.*
//import jakarta.validation.constraints.NotNull
//
//@Entity
//@Table(name = "comments")
//class CommentBiDirectional : AuditModel() {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private val id: Long? = null
//
//    @NotNull
//    @Lob
//    private val text: String? = null
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "post_id", nullable = false)
//     val post: Post? = null // Getters and Setters (Omitted for brevity)
//}