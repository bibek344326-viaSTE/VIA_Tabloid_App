package via.doc1.spring_boot_docker_app1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import via.doc1.spring_boot_docker_app1.model.Department;
import via.doc1.spring_boot_docker_app1.services.DepartmentService;

@RestController
public class DepartmentController {
private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/departments")
    public String addDepartment(@RequestBody Department department) {
        return "departmentService.addDepartment(department);";
    }

    @RequestMapping("")
    public String printSomething() {
        return "<body><h1>Hello World!</h1></body>";
    }


    @GetMapping("/departments")
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @GetMapping("/department/{id}")
    public Department getDepartmentById(@PathVariable("id") Long id) {
        return departmentService.getDepartmentById(id);    }
}
