package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void  commonDataForModel(Model m){
		m.addAttribute("Header","Registration Form");  // value cab be  accessible in contact and success page 
		m.addAttribute("Desc","Home page for user");
		System.out.println("Adding common data to model");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model m) {
		m.addAttribute("Header","Registration Form");  // value access in contact.jsp page 
		m.addAttribute("Desc","Home page for user");
		return  "contact";
	}

	// Way 1 => ( Old way ) to get / map data from FORM 
	
	/* 
	 @RequestMapping( path="/processform",method=RequestMethod.POST)
	 
		public String handleForm(HttpServletRequest request) {
		String email =	request.getParameter("email");
		System.out.println("user email is " + email);
			
		return " ";
		
		
	}*/
	
	
	// way 2 => Using RequestParam to map/ get data from FORM
	
	 /*
	  
	  @RequestMapping( path="/processform",method=RequestMethod.POST)
		public String handleForm(@RequestParam("email") String userEmail,
			@RequestParam("username") String userName,
			@RequestParam("password") String userPassword, Model model) {
		
		   User user = new User();
		   user.setEmail(userEmail);
		   user.setUserName(userName);
		   user.setPassword(userPassword);
		   
		   System.out.println(user);
		   
		   model.addAttribute("user",user);
		   
		// equivalent to these 3 line done by each property
//		     model.addAttribute("name",userName);
//		     model.addAttribute("email","email");
//		     model.addAttribute("password","userPassword");
		    System.out.println("User Email " + userEmail  +" User Name is "+userName+" User Password is "+userPassword);
		return "success"; 
		}
		
		*/
		
		@RequestMapping( path="/processform",method=RequestMethod.POST)
		public String handleForm(@ModelAttribute User  user,Model model ) {
		
		  
		  
		   
		   System.out.println(user);
		   
		   model.addAttribute("user",user);
		   model.addAttribute("Header","Registration Form");  // value access in success.jsp page 
			model.addAttribute("Desc","Home page for user");
		   
		
		return "success"; 
}


}
