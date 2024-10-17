package PersonalProjects.DJO.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = { "/" })
public class HomeController {

	ModelAndView model = new ModelAndView();

	
	@GetMapping
	public ModelAndView homeView() throws Exception
	{
		// ModelAndView model = new ModelAndView();
		model.clear();
		model.setViewName("Landing");
		return model;
	}




	
}
