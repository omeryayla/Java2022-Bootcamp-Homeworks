package kodlama.io.Devs.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/languages")
public class ProgrammingLanguagesController {

	ProgrammingLanguageService programmingLanguageService;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		super();
		this.programmingLanguageService = programmingLanguageService;
	}

	@PostMapping("/add")
	public void add(@RequestBody ProgrammingLanguage programmingLanguage) throws Exception {

		programmingLanguageService.add(programmingLanguage);
	}

	@DeleteMapping("/delete")
	public void delete(@RequestBody ProgrammingLanguage programmingLanguage) throws Exception {

		programmingLanguageService.delete(programmingLanguage);
	}

	@PutMapping("/update")
	public void update(@RequestBody int index, ProgrammingLanguage programmingLanguage) throws Exception {

		programmingLanguageService.update(index, programmingLanguage);
	}

	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguageService.getAll();
	}

	@GetMapping("/getbyid")
	public ProgrammingLanguage getById(@RequestParam int id) throws Exception {

		return programmingLanguageService.getById(id);
	}

}
