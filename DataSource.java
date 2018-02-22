package domain;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class DataSource {
    private String baseurl;
    private String apikey;

    public DataSource(String baseurl,String apikey){
        this.baseurl=baseurl;
        this.apikey=apikey;

    }
}
