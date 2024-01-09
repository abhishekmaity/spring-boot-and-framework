package in.abhishek.springboot.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> retriveAllCourses(){
		return Arrays.asList(
				new Course(1, "Learn AWS", "Ranga"),
				new Course(2, "Learn DevOps", "Ranga")
				);
	}

}
