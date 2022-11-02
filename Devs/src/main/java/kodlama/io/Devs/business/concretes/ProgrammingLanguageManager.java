package kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	ProgrammingLanguageRepository programmingLanguageRepository;

	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		super();
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) throws Exception {

		if (programmingLanguageRepository.getLanguages().isEmpty() == true) {
			programmingLanguageRepository.add(programmingLanguage);
		}

		else if (programmingLanguageRepository.getLanguages().isEmpty() == false) {

			for (ProgrammingLanguage language : programmingLanguageRepository.getLanguages()) {
				if (language.getName().equals(programmingLanguage.getName())) {
					throw new Exception("Language name must be unique");
				}

			}
		}
		
		else
			programmingLanguageRepository.add(programmingLanguage);

	}

	@Override
	public void delete(ProgrammingLanguage programmingLanguage) throws Exception {

		if (programmingLanguageRepository.getLanguages().isEmpty() == true) {
			throw new Exception("List is empty. You can not delete any item in the list!");
		}

		else

			programmingLanguageRepository.delete(programmingLanguage);

	}

	@Override
	public void update(int index, ProgrammingLanguage programmingLanguage) throws Exception {

		if (programmingLanguageRepository.getLanguages().isEmpty() == true) {

			throw new Exception("List is empty. You can not update list while it is empty");

		}

		else

			programmingLanguageRepository.update(index, programmingLanguage);

	}

	@Override
	public List<ProgrammingLanguage> getAll() {

		return programmingLanguageRepository.getAll();
	}

	@Override
	public ProgrammingLanguage getById(int id) throws Exception {

		if (programmingLanguageRepository.getLanguages().isEmpty() == true) {
			throw new Exception("List is empty. There is no element with respect to given id!");
		}

		else

			return programmingLanguageRepository.getById(id - 1);

	}

}
