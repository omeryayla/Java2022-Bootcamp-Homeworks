package kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Devs.dataAccess.abstracts.SubTechnologyRepository;
import kodlama.io.Devs.entities.concretes.SubTechnology;

@Repository
public class InMemorySubTechnology implements SubTechnologyRepository{
	
	private List<SubTechnology> subTechnologies;
	
	

	public InMemorySubTechnology() {
		subTechnologies = new ArrayList<SubTechnology>();
		subTechnologies.add(new SubTechnology(1,"Spring"));
		subTechnologies.add(new SubTechnology(2,"JSP"));
		subTechnologies.add(new SubTechnology(3,"WPF"));
		subTechnologies.add(new SubTechnology(4,"ASP.NET"));

	}

	@Override
	public void add(SubTechnology subTechnology) {
		
		subTechnologies.add(subTechnology);
	}

	@Override
	public void delete(int index) {
		
		subTechnologies.remove(index);
		
	}

	@Override
	public void update(int index, SubTechnology subTechnology) {
		
		subTechnologies.set(index, subTechnology);
		
	}

	@Override
	public List<SubTechnology> getAll() {
		
		return subTechnologies;
	}

}
