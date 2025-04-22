package via.doc1.spring_boot_docker_app1.services;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import via.doc1.spring_boot_docker_app1.repository.DepartmentRepository;

import via.doc1.spring_boot_docker_app1.model.Department;

@Service
public class DepartmentService {
 
 @Autowired   
    DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department addDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public Department getDepartmentById(Long id) {
        return departmentRepository.findById(id).get();
    }
}
