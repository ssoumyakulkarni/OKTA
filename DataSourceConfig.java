package config;

import domain.DataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@ComponentScan
@Configuration
public class DataSourceConfig {
    @Value("${datasource.baseurl}")
    private String baseurl;
    @Value("${datasource.apikey}")
    private String apikey;
    @Bean
    DataSource datasource(){
        return new DataSource(baseurl,apikey);
    }
}
