package springmvcm2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import springmvcm2.dao.StudentDao;
import springmvcm2.dto.Student;

@Controller
public class StudentController {
	
	@Autowired
	private StudentDao dao;
	
	
	@RequestMapping("/register")
	public ModelAndView registerStudent() {
		ModelAndView andView=new ModelAndView();
		andView.addObject("student", new Student());
		andView.setViewName("register.jsp");
		return andView;
		
	}

	@RequestMapping("/save")
	public ModelAndView saveStudent(@ModelAttribute Student student) {
		ModelAndView andView=new ModelAndView();
		dao.saveStudent(student);
		List<Student>  students=dao.getAllSTudents();
		andView.addObject("list", students);
		andView.setViewName("display.jsp");
		return andView;
	}
}
