package fus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableConfigurationProperties // 使用ConfigurationProperties 必须开启
//@EntityScan("entity")
// @EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@EnableJpaRepositories(basePackages = "dao")
//public class FusApplication {
//    public static void main(String[] args) {
//        SpringApplication.run(FusApplication.class, args);
//    }
//}

public class FusApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return createSpringApplicationBuilder().sources(FusApplication.class);
    }
	public static void main(String[] args) {
		SpringApplication.run(FusApplication.class, args);
	}
}
