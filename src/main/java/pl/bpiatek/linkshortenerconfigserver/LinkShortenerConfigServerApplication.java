package pl.bpiatek.linkshortenerconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class LinkShortenerConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LinkShortenerConfigServerApplication.class, args);
    }

}
