package bussines.concretes;

import java.util.ArrayList;
import java.util.List;

import bussines.abstracts.CategoryService;
import core.logging.abstracts.BaseLogger;
import dataAccess.abstracts.CategoryDao;
import entitites.concretes.Category;

public class CategoryManager implements CategoryService {

	private CategoryDao categoryDao;
	private BaseLogger[] baseLoggers;
	List<Category> categories = new ArrayList<Category>();

	public CategoryManager(CategoryDao categoryDao, BaseLogger[] baseLoggers) {
		super();
		this.categoryDao = categoryDao;
		this.baseLoggers = baseLoggers;
	}

	@Override
	public void add(Category category) throws Exception {

		for (Category categoryInList : categories) {
			if (categoryInList.getCategoryName().equals(category.getCategoryName())) {
				throw new Exception("Category name must be unique!");
			}
		}

		categories.add(category);
		this.categoryDao.add(category);

		for (BaseLogger logger : baseLoggers) {
			logger.log();
		}

	}

	@Override
	public void delete(Category category) {

		this.categoryDao.delete(category);

		for (BaseLogger logger : baseLoggers) {
			logger.log();
		}

	}

	@Override
	public void update(Category category) {

		this.categoryDao.update(category);
		for (BaseLogger logger : baseLoggers) {
			logger.log();
		}

	}

}
