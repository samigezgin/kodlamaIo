package kodlama.io.business;


import java.util.List;

import kodlama.io.core.logging.Logger;
import kodlama.io.dataAccess.CourseDao;
import kodlama.io.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private List<Logger> loggers;
	
	public CourseManager(CourseDao courseDao,List<Logger> loggers) {
			this.courseDao = courseDao;
			
			this.loggers=loggers;
		
	}

	public void add(Course[] courses) throws Exception {
		
		String courseName="";
		for (Course course:courses) {
			
			if (course.getUnitPrice()<0) {
				throw new Exception("Kurs fiyatı 0 dan küçük olamaz");
			}
			if(course.getName()==courseName) {
				throw new Exception("Kurs isimleri aynı olamaz");
			}
			
			courseDao.add(courses);
			
			for(Logger logger :loggers) {
				logger.log(course.getName());
				
			}
			courseName=course.getName();
		}
		

		
	
		

	}

}
