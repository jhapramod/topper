package io.spring.topper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Locale;
import java.util.function.Function;

@SpringBootApplication
public class TopperApplication {

	public static void main(String[] args) {
		SpringApplication.run(TopperApplication.class, args);
	}

	@Bean
	public Function<String, String> toUpper() {
		return str -> {
			System.out.println(str);
			return str.toUpperCase(Locale.ROOT);
		};
	}

}
