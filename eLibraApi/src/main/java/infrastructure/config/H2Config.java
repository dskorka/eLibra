package infrastructure.config;

import org.h2.tools.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import java.sql.SQLException;

/**
 * Created by Damian on 02.08.2017
 */

@Profile("h2")
@Configuration
public class H2Config {

    private static final Logger LOG = LoggerFactory.getLogger(H2Config.class);

    @Primary
    @Bean
    public EmbeddedDatabase database(){

        LOG.info("H2 Bean is active");

        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();

        return builder
                .setType(EmbeddedDatabaseType.H2)
                .setName("inm")
                .addScript("db/createstructure/create_objects.sql")
                .addScript("db/createstructure/insert_data.sql")
                .build();
    }
}
