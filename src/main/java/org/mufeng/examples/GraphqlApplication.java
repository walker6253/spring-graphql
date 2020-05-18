package org.mufeng.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 *
 * @Author: chenyang
 */
@SpringBootApplication
public class GraphqlApplication {

    public static void main(String [] args ) {
        new SpringApplication(GraphqlApplication.class).run(args);
    }

}
