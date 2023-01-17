package com.example.todolistenterprice2.ManytoMany

import jakarta.transaction.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class ManyToManyController {

    @Autowired
    lateinit var studentRepository: StudentRepository

    @Autowired
    lateinit var subjectRepository: SubjectRepository

    @GetMapping("/clear")
    @Transactional
    fun clear(): String{
        // delete all data
        subjectRepository.deleteAll()
        studentRepository.deleteAll()

        return "Done!"
    }
    @PostMapping("/save/subject")
    fun saveSybject(@RequestBody subject: Subject): Subject {
        return subjectRepository.save(subject)
    }
    @PostMapping("/save/students")
    fun saveStudent(@RequestBody student: Student):Student{
        return studentRepository.save(student)
    }

    @GetMapping("/save")
    fun save(): String {
        //prepare subjects
        val math = Subject(1, "Mathematics")
        val computer = Subject(2, "Computer")
        val economics = Subject(3, "Economics")

        // attached subjects for each student
        val jack = Student("Jack", mutableListOf(math, computer, economics))
        val peter = Student("Peter", mutableListOf(computer, economics))

        // persist students to database
        studentRepository.save( peter)
        studentRepository.save(jack)

        return "Done!"
    }

    @GetMapping("/students")
    fun retrieveAllStudents(): String{
        // fetch all students from database
        val students = studentRepository.findAll()

        // some processing for better String format on browser showing
        var info : String = ""
        students.forEach{
            info += it.toString() + ""
        }

        return info
    }

    @GetMapping("/subjects")
    fun retrieveAllSubjects(): String{
        // fetch all students from database
        val subjects = subjectRepository.findAll()

        // some processing for better String format on browser showing
        var info : String = ""
        subjects.forEach{
            info += it.toString() + ""
        }

        return info
    }

    @GetMapping("/addsubjecttostudent/{sub}/{std}")
    fun addsubjecttostudent(@PathVariable sub:Long,@PathVariable std:Long): Student {
        var subject = subjectRepository.findById(sub).get()
        var student = studentRepository.findById(std).get()
        student.enrolledInSubjectsList.add(subject)

        return studentRepository.save(student)


    }
}