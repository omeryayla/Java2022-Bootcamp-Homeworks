package kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Devs.entities.concretes.SubTechnology;

public interface SubTechnologyService {
	
	void add(SubTechnology subTechnology) throws Exception;

	void delete(int index) throws Exception;

	void update(int index, SubTechnology subTechnology) throws Exception;

	List<SubTechnology> getAll();

}
