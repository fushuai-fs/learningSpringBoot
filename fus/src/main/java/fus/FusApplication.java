package fus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties // 使用ConfigurationProperties 必须开启
@EntityScan("entity")
// @EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class FusApplication {

	public static void main(String[] args) {
		SpringApplication.run(FusApplication.class, args);
	}
}
