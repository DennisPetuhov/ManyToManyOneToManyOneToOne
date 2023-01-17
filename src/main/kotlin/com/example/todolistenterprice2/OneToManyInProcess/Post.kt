//package com.example.todolistenterprice2.OneToManyInProcess
//
//import jakarta.persistence.*
//import jakarta.validation.constraints.NotNull
//import jakarta.validation.constraints.Size
//
//@Entity
//@Table(name = "posts")
//class Post() : AuditModel() {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private val id: Long? = null
//
//    @NotNull
//    @Size(max = 100)
//    @Column(unique = true)
//    var title: String? = null
//
//    @NotNull
//    @Size(max = 250)
//     val description: String? = null
//
//    @NotNull
//    @Lob
//     val content: String? = null
//
//    fun setTittle(title:String) {
//        this.title=title
//    }
//}