package in.satish.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MessageController {
  
	    @GetMapping("/welcome")
		public ModelAndView getWelcomeMsg() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","Hi Welcome to Monocept..");
		mav.setViewName("message");
	    return mav;	
	   }
	   
	    @GetMapping("/greet")
	    public ModelAndView getGreetMsg() {
	    	ModelAndView mav = new ModelAndView();
	    	mav.addObject("msg","Good Evening...");
	    	mav.setViewName("message");
	    	
	    	return mav;
	    }
	
}
