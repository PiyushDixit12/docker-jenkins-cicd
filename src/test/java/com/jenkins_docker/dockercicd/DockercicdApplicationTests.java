package com.jenkins_docker.dockercicd;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.slf4j.*;
@SpringBootTest
class DockercicdApplicationTests {

public static Logger logger = LoggerFactory.getLogger(DockercicdApplicationTests.class);
	@Test
	void contextLoads() {
logger.info("running test cases...");
	}

}
