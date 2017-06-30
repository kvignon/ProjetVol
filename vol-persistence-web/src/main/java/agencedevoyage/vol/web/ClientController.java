package aubay.formation.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import aubay.formation.dao.MatiereDao;
import aubay.formation.model.Matiere;

@Controller
@RequestMapping("/matiere")
public class MatiereController {

	@Autowired
	private MatiereDao matiereDao;
	
	@RequestMapping("/list")
	public String list(Model model) {
		List<Matiere> matieres = matiereDao.findAll();
		
		model.addAttribute("matieres", matieres);
		
		return "matiere/matieres";
	}
	
}
