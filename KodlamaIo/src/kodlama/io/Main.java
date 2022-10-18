package kodlama.io;


import java.util.Arrays;
import java.util.List;

import kodlama.io.business.CourseManager;
import kodlama.io.core.logging.DatabaseLogger;
import kodlama.io.core.logging.Logger;
import kodlama.io.core.logging.MailLogger;
import kodlama.io.dataAccess.JdbcCourseDao;
import kodlama.io.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		Course[] courses = new Course[]{new Course(1,"Java",100,"Yazılım"),new Course(2,"Java",-1,"Yazılım")};
		Logger[] loggers= {new DatabaseLogger(),new MailLogger(),};
		List<Logger> logger = Arrays.asList(loggers);
		CourseManager courseManager=new CourseManager(new JdbcCourseDao(),logger);
		courseManager.add(courses);

	}

}
