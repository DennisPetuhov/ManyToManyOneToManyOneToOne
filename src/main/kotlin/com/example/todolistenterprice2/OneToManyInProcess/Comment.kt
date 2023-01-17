//package com.example.todolistenterprice2.OneToManyInProcess
//
//import com.fasterxml.jackson.annotation.JsonIgnore
//import jakarta.persistence.*
//import jakarta.validation.constraints.NotNull
//import org.hibernate.annotations.OnDelete
//import org.hibernate.annotations.OnDeleteAction
//@Entity
//@Table(name = "comments")
//class Comment : AuditModel() {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private val id: Long? = null
//
//    @NotNull
//    @Lob
//    private val text: String? = null
//
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "post_id", nullable = false)
//    @OnDelete(action = OnDeleteAction.CASCADE)
//    @JsonIgnore
//    var post: Post? = null
//}