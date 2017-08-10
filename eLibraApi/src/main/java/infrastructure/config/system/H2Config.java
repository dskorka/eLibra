package infrastructure.config.system;

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

    /**
     * TCP connection to connect with SQL clients to the embedded h2 database.
     *
     * Connect to "jdbc:h2:tcp://localhost:9092/mem:testdb", username "sa", password empty.
     */
    @Bean(initMethod = "start", destroyMethod = "stop")
    public Server h2Server() throws SQLException {
        return Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", "9092");
    }


    /**
     * Web console for the embedded h2 database.
     *
     * Go to http://localhost:8082 and connect to the database "jdbc:h2:mem:testdb", username "sa", password empty.
     */
    @Bean(destroyMethod = "stop")
    public Server h2WebServer() throws SQLException {
        return Server.createWebServer("-webAllowOthers","-webPort","8082").start();
    }
}