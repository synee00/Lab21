/*Jasmine Allen
August 15, 2018
*/
package co.grandcircus.coffeeShop;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CoffeeShopController {
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private ItemsDao itemsDao;
	
	@RequestMapping("/")
	public ModelAndView showHomePage()
	{
		/*Items items = new Items();
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("items", items);

		return mav;*/
		
		List<Items> items = itemsDao.findAll();
		return new ModelAndView("index", "items", items);
		
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
		
		userDao.create(user);
		
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
