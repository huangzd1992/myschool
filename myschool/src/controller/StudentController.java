package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import entity.Student;

import service.impl.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@RequestMapping("find.do")
	public String findAll(HttpServletRequest request,HttpSession session,ModelMap model){
		List<Student> stuList = studentService.findAll();
		model.put("stuList", stuList);
		return "show.jsp";
	}
	
}
