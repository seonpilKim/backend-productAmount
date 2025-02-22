package dcode.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

import java.sql.Connection;

@Component
public class H2Runner implements ApplicationRunner {

	@Autowired
	DataSource dataSource;

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		try (Connection connection = dataSource.getConnection()) {
			System.out.println(connection);
			String URL = connection.getMetaData().getURL();
			System.out.println(URL);
			String User = connection.getMetaData().getUserName();
			System.out.println(User);
		}
	}
}