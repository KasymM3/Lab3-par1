package kz.example.Lab3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    StudentService service = new StudentService();
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("list",service.studentList());

        return "home";
    }

    @GetMapping("/add")
    public String add(Model model){
        model.addAttribute("student",new Student());
        return "add";
    }
    @PostMapping("/add")
    public String addStudent(@ModelAttribute Student student){
        service.add(student);
        return "redirect:/";
    }
}
