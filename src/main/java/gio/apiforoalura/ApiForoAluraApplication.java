package gio.apiforoalura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ApiForoAluraApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiForoAluraApplication.class, args);
    }

}
