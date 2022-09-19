package com;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The type Spring boot camel application.
 */
@SpringBootApplication
public class SpringBootCamelApplication extends RouteBuilder {

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCamelApplication.class, args);
	}
	@Override
	public void configure() throws Exception {
		from("file:data/input?noop=true").filter(body().startsWith("T")).to("file:data/output");
	}
}

