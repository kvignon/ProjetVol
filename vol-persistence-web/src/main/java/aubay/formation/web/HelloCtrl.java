package aubay.formation.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloCtrl {
	
	@RequestMapping("/")
	public String home() {
		return "redirect:/hi";
	}
	
	@RequestMapping("/hi")
	public String bonjour(@RequestParam(name="name", defaultValue="Sercan") String lastname, Model model) {
		
		model.addAttribute("nom", lastname);
		
		return "accueil";
	}

}
