package dedemo.dididemo.controller;

import dedemo.dididemo.db.DBUtil;
import dedemo.dididemo.db.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String indexPage(Model model){
        ArrayList<Student> students = DBUtil.getAllStudent();
        model.addAttribute("students", students);
        return "index";
    }

    @GetMapping(value = "/addstudent")
    public String addPage() {
        return "addstudent";
    }

    @PostMapping(value = "/addingstudent")
    public String addingPage(@RequestParam(name = "student_name") String name,
                          @RequestParam(name = "student_surname") String surname,
                          @RequestParam(name = "student_exam") int exam) {

        Student student = new Student();
        student.setName(name);
        student.setSurname(surname);
        student.setExam(exam);
        DBUtil.addStudent(student);

        return "redirect:/";

    }

}
