package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home url");
		model.addAttribute("name","Anshu Jaiswal");
		model.addAttribute("id",12234);
		
		List<String> friends = new ArrayList<String>();
		
		friends.add("Dhruv");
		friends.add("ashish");
		friends.add("sourabh");
		friends.add("kiran");
		
		model.addAttribute("f",friends);
		
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about url");
		return "about";	}
	
	@RequestMapping("/help")
	public ModelAndView help(){
		System.out.println("This is help controller");
		
		//Creating model and view object
		ModelAndView modelAndView = new ModelAndView();
		
		//setting the data
		modelAndView.addObject("name","Anshu Jaiswal");
		
		modelAndView.addObject("rollNo",2003);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time",now);
		
		
		//marks
		
		List<Integer> list = new ArrayList<Integer>();	
		list.add(23);
		list.add(40);
		list.add(67);
		list.add(90);
		modelAndView.addObject("marks",list);
		//setting the view name
		modelAndView.setViewName("help");
		return modelAndView;
		
	}
	
	
	
	

}
 