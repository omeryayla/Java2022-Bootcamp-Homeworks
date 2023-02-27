package kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Devs.entities.concretes.SubTechnology;

public interface SubTechnologyRepository {
	
	void add(SubTechnology subTechnology);

	void delete(int index);

	void update(int index, SubTechnology subTechnology);

	List<SubTechnology> getAll();

}
