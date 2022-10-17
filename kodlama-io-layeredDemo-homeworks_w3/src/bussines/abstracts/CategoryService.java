package bussines.abstracts;

import entitites.concretes.Category;

public interface CategoryService {
	
	void add(Category category) throws Exception;
	void delete(Category category);
	void update(Category category);

}
