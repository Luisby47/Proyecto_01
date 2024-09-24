package cr.una.ac.proyecto_01;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Proyecto01Application {

    public static void main(String[] args) {
        SpringApplication.run(Proyecto01Application.class, args);
    }

    //http://localhost:8080/swagger-ui/index.html#/
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Proyecto 01 API")
                        .description("API para el proyecto 01 de Paradigmas")
                        .version("1.0").license(new License().name("Apache").url("http://springdoc.org")));
    }

}
