package dn.com.discover.server;

import io.github.nghiandd84.core.Operation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.math.BigDecimal;

@SpringBootApplication
@EnableEurekaServer
public class DiscoverServerApplication {

	public static void main(String[] args) {
		BigDecimal result =  Operation.add(new BigDecimal(1), new BigDecimal(2));
		System.out.println(result);
		SpringApplication.run(DiscoverServerApplication.class, args);
	}

}
