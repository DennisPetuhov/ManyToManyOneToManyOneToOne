package com.example.todolistenterprice2.OmeToManyBiDirectional

import com.example.todolistenterprice2.OneToManyInProcess.AuditModel
import com.example.todolistenterprice2.OneToManyInProcess.Comment
import jakarta.persistence.*
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import net.minidev.json.annotate.JsonIgnore

@Entity
@Table(name = "posts")
class PostBiDirectional : AuditModel() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long? = null

    @NotNull
    @Size(max = 100)
    @Column(unique = true)
    private val title: String? = null

    @NotNull
    @Size(max = 250)
    private val description: String? = null

    @NotNull
    @Lob
    private val content: String? = null
    @JsonIgnore
    @OneToMany(cascade = [CascadeType.ALL], fetch = FetchType.LAZY, mappedBy = "post")
    private val comments: Set<Comment> = HashSet()
}