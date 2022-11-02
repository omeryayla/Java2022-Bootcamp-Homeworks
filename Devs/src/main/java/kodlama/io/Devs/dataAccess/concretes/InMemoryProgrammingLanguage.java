package kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguage implements ProgrammingLanguageRepository {

	private List<ProgrammingLanguage> languages;

	public InMemoryProgrammingLanguage() {

		languages = new ArrayList<ProgrammingLanguage>();
		languages.add(new ProgrammingLanguage(1, "Java"));
		languages.add(new ProgrammingLanguage(2, "C#"));

	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {

		languages.add(programmingLanguage);

	}

	@Override
	public void delete(ProgrammingLanguage programmingLanguage) {

		languages.remove(programmingLanguage);

	}

	@Override
	public void update(int index, ProgrammingLanguage programmingLanguage) {

		languages.set(index, programmingLanguage);

	}

	@Override
	public List<ProgrammingLanguage> getAll() {

		return languages;
	}

	@Override
	public ProgrammingLanguage getById(int id) {

		return languages.get(id);
	}

	@Override
	public List<ProgrammingLanguage> getLanguages() {
		return languages;
	}
	
	

}
