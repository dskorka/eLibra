package infrastructure.config.system;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Damian on 02.08.2017
 */

//@Profile("mssql")
//@Configuration
class MySqlConfig {

    private static final Logger LOG = LoggerFactory.getLogger(MySqlConfig.class);

    /*
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/eLibrary?useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;
    }
     */
}
