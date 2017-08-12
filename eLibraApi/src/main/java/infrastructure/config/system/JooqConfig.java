package infrastructure.config.system;

import org.jooq.impl.DataSourceConnectionProvider;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultDSLContext;
import org.jooq.impl.DefaultExecuteListenerProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;

import javax.sql.DataSource;

/**
 * Created by Damian on 11.08.2017
 */

@Configuration
class JooqConfig {

    private final DataSource dataSource;

    @Autowired
    public JooqConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    DataSourceTransactionManager transactionManager(){
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean
    DataSourceConnectionProvider connectionProvider(){
        return new DataSourceConnectionProvider(new TransactionAwareDataSourceProxy(dataSource));
    }

    @Bean
    DefaultDSLContext dsl() {
        return new DefaultDSLContext(configuration());
    }

    private DefaultConfiguration configuration() {
        DefaultConfiguration jooqConfiguration = new DefaultConfiguration();

        jooqConfiguration.set(connectionProvider());
        jooqConfiguration.set(new DefaultExecuteListenerProvider(new ExceptionTranslator()));

        return jooqConfiguration;
    }
}
