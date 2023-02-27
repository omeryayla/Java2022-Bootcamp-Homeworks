package kodlama.io.Devs.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import kodlama.io.Devs.business.abstracts.SubTechnologyService;
import kodlama.io.Devs.entities.concretes.SubTechnology;

@RestController
@RequestMapping("/api/subTechnologies")
public class SubTechnologiesController {
	
	private SubTechnologyService subTechnologyService;

	@Autowired
	public SubTechnologiesController(SubTechnologyService subTechnologyService) {
		super();
		this.subTechnologyService = subTechnologyService;
	}
	
	@GetMapping("/getAll")
	public List<SubTechnology> getAll(){
		return subTechnologyService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody SubTechnology subTechnology) throws Exception {
		subTechnologyService.add(subTechnology);
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestBody int index) throws Exception {
		subTechnologyService.delete(index);
	}
	
	@PutMapping("/update")
	public void update (@RequestBody int index, SubTechnology subTechnology) throws Exception {
		subTechnologyService.update(index, subTechnology);
	}
	
	

}
