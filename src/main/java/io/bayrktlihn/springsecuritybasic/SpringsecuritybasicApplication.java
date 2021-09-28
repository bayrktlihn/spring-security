package io.bayrktlihn.springsecuritybasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@ComponentScans({
        @ComponentScan("io.bayrktlihn.controller"),
        @ComponentScan("io.bayrktlihn.config")
})
@EnableJpaRepositories("io.bayrktlihn.repository")
@EntityScan("io.bayrktlihn.model")
@EnableWebSecurity(debug = true)
public class SpringsecuritybasicApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringsecuritybasicApplication.class, args);
    }

}
