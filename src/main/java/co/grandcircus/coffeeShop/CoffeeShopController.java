/*Jasmine Allen
August 15, 2018
*/
package co.grandcircus.coffeeShop;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CoffeeShopController {
	
	@RequestMapping("/")
	public ModelAndView showHomePage()
	{
		ModelAndView mav = new ModelAndView("index");
		
		return mav;
		
	}
	@RequestMapping("/register")
	public ModelAndView showRegistration()
	{
		ModelAndView mav = new ModelAndView("register");
		
		return mav;
		
	}
	@RequestMapping("/summary")
	public ModelAndView showSummary(@RequestParam("fname") String fname,
			@RequestParam("lname") String lname,
			@RequestParam("email") String email,
			@RequestParam("number") String number, 
			@RequestParam("password") String password)
	{
		User user = new User();
		user.setFname(fname);
		user.setLname(lname);
		user.setEmail(email);
		user.setNumber(number);
		user.setPassword(password);
		
		ModelAndView mav = new ModelAndView("summary");
		mav.addObject("user", user);
		
		/*mav.addObject("fname" , fname);
		mav.addObject("lname", lname);
		mav.addObject("email" , email);
		mav.addObject("number", number);
		mav.addObject("password" , password);*/
		return mav;
		
	}

}
