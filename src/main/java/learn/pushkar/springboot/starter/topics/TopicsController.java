package learn.pushkar.springboot.starter.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return Arrays.asList(
				new Topic("Spring", "Spring Framework", "Lightweight javabased multipurpose framework"),
				new Topic("Kafka", "Apache Kafka", "Realtime data pipelines"),
				new Topic("Nodejs","Node.js","Javascript based asynchronous framework")				
				);
	}
}
