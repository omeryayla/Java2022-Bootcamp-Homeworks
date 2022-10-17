package bussines.concretes;

import bussines.abstracts.InstructorService;
import core.logging.abstracts.BaseLogger;
import dataAccess.abstracts.InstructorDao;
import entitites.concretes.Instructor;

public class InstructorManager implements InstructorService {

	private InstructorDao instructorDao;
	private BaseLogger[] baseLoggers;

	public InstructorManager(InstructorDao instructorDao, BaseLogger[] baseLoggers) {
		super();
		this.instructorDao = instructorDao;
		this.baseLoggers = baseLoggers;
	}

	@Override
	public void add(Instructor instructor) {

		this.instructorDao.add(instructor);

		for (BaseLogger logger : baseLoggers) {
			logger.log();
		}

	}

	@Override
	public void delete(Instructor instructor) {

		this.instructorDao.delete(instructor);
		for (BaseLogger logger : baseLoggers) {
			logger.log();
		}

	}

	@Override
	public void update(Instructor instructor) {

		this.instructorDao.update(instructor);
		for (BaseLogger logger : baseLoggers) {
			logger.log();
		}

	}

}
