import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class ApplicationBoot {
    public static void main(String[] args){
        new SpringApplication(ApplicationBoot.class,args);
    }
}
