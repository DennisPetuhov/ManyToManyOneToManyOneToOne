package com.example.todolistenterprice2.ManytoMany

import jakarta.persistence.*
import com.fasterxml.jackson.annotation.JsonIgnore


@Entity
@Table(name = "subject")
data class Subject(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0,

    var name: String = "",
    @JsonIgnore
    @ManyToMany(mappedBy = "enrolledInSubjectsList")
    var studentsEnrolledIn: MutableList<Student> = mutableListOf()
) {
    override fun toString(): String {
        return "{subject: ${this.name}, students: ${studentsEnrolledIn.map { it -> it.name }}}";
    }
}