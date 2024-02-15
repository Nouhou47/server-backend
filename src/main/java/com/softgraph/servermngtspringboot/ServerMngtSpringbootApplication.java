package com.softgraph.servermngtspringboot;

import com.softgraph.servermngtspringboot.enumeration.ServerStatus;
import com.softgraph.servermngtspringboot.model.Server;
import com.softgraph.servermngtspringboot.repository.ServerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.softgraph.servermngtspringboot.enumeration.ServerStatus.SERVER_UP;

@SpringBootApplication
public class  ServerMngtSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerMngtSpringbootApplication.class, args);
    }

    @Bean
    CommandLineRunner run(ServerRepository serverRepo) {
        return args -> {
            serverRepo.save(new Server(null, "192.168.1.160", "Ubuntu Linux", "16 GB", "Personal PC", "http://localhost:8080/server/image/server1.png", SERVER_UP));
            serverRepo.save(new Server(null, "192.168.1.58", "Fedora Linux", "16 GB", "Dell Tower", "http://localhost:8080/server/image/server2.png", SERVER_UP));
            serverRepo.save(new Server(null, "192.168.1.21", "MS 2012", "32 GB", "Web Server", "http://localhost:8080/server/image/server3.png", SERVER_UP));
            serverRepo.save(new Server(null, "192.168.1.14", "Red Hat Enterprise Linux", "64 GB", "Mail Server", "http://localhost:8080/server/image/server4.png", SERVER_UP));
        };
    }
}
