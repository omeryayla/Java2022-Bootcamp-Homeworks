package dataAccess.concretes;

import dataAccess.abstracts.CategoryDao;
import entitites.concretes.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {

		System.out.println("Added category via hibernate! " + category.getCategoryName());

	}

	@Override
	public void delete(Category category) {

		System.out.println("Deleted category via hibernate! " + category.getCategoryName());

	}

	@Override
	public void update(Category category) {

		System.out.println("Updated category via hibernate! " + category.getCategoryName());

	}

}
