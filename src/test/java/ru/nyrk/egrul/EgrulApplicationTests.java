package ru.nyrk.egrul;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.neo4j.ogm.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import ru.nyrk.egrul.EgrulApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EgrulApplication.class)
@ContextConfiguration(classes = MockConfig.class)
@Rollback(value = false)

public class EgrulApplicationTests {

	@Autowired
	Session session;


	@Test
	@Transactional
	public void contextLoads() {
		session.purgeDatabase();

	}

}
