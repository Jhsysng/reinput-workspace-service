package info.reinput.reinputworkspaceservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableJpaAuditing
public class ReinputWorkspaceServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReinputWorkspaceServiceApplication.class, args);
    }

}
