package com.example.todolistenterprice2.ManytoMany

import jakarta.persistence.*

@Entity
@Table(name = "student")


data class Student(
    var name: String = "",

    @ManyToMany(cascade = arrayOf(CascadeType.ALL))
    @JoinTable(
        name = "student_subject_enroled_in",
        joinColumns = arrayOf(JoinColumn(name = "student_id", referencedColumnName = "id")),
        inverseJoinColumns = arrayOf(JoinColumn(name = "subject_id", referencedColumnName = "id"))
    )
    var enrolledInSubjectsList: MutableList<Subject> = mutableListOf(),

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long = 0
) {
    override fun toString(): String {
        return "{student: ${this.name}, subjects: ${enrolledInSubjectsList.map { it -> it.name }}}";
    }
}
