package infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by Damian on 02.08.2017
 */

@Configuration
public class JdbcTemplateConfig {

    @Bean
    public JdbcOperations jdbcOperations(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }
}
