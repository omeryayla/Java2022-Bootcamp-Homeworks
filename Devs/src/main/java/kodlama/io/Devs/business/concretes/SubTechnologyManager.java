package kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.SubTechnologyService;
import kodlama.io.Devs.dataAccess.abstracts.SubTechnologyRepository;
import kodlama.io.Devs.entities.concretes.SubTechnology;

@Service
public class SubTechnologyManager implements SubTechnologyService {

	private SubTechnologyRepository subTechnologyRepository;

	@Autowired
	public SubTechnologyManager(SubTechnologyRepository subTechnologyRepository) {
		super();
		this.subTechnologyRepository = subTechnologyRepository;
	}

	@Override
	public void add(SubTechnology subTechnology) throws Exception {

		if (subTechnologyRepository.getAll().isEmpty() == true) {
			subTechnologyRepository.add(subTechnology);
		}

		else if (subTechnologyRepository.getAll().isEmpty() == false) {

			for (SubTechnology technology : subTechnologyRepository.getAll()) {
				if (technology.getName().equals(subTechnology.getName())) {
					throw new Exception("Language name must be unique");
				}

			}
		}

		else
			subTechnologyRepository.add(subTechnology);

	}

	@Override
	public void delete(int index) throws Exception {

		if (subTechnologyRepository.getAll().isEmpty() == true) {
			throw new Exception("List is empty. You can not delete any item in the list!");
		} else {

			subTechnologyRepository.delete(index);
		}

	}

	@Override
	public void update(int index, SubTechnology subTechnology) throws Exception {
		
		if (subTechnologyRepository.getAll().isEmpty() == true) {

			throw new Exception("List is empty. You can not update list while it is empty");

		}

		else

			subTechnologyRepository.update(index, subTechnology);


	}

	@Override
	public List<SubTechnology> getAll() {
		
		return subTechnologyRepository.getAll();
	}

}
