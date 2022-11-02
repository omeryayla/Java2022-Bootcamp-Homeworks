package kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	
	void add(ProgrammingLanguage programmingLanguage) throws Exception;
	
	void delete(ProgrammingLanguage programmingLanguage) throws Exception;
	
	void update(int index, ProgrammingLanguage programmingLanguage) throws Exception;

	List<ProgrammingLanguage> getAll();

	ProgrammingLanguage getById(int id) throws Exception;

}
