package com.farhad.example.doubleit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
}
  
  // public static void main(String[] args) {
  //   SpringApplication.run(
  //       Application.class,
  //       "--spring.main.lazy-initialization=false",
  //       "--spring.cloud.function.definition=process",
  //       "--spring.cloud.stream.function.definition=doubleIt|produceIt|logIt",
  //       "--spring.cloud.stream.bindings.doubleIt|produceIt|logIt-in-0.destination=idestination",
  //       "--spring.cloud.stream.bindings.doubleIt|produceIt|logIt-in-0.group=igroup",
  //       "--spring.cloud.stream.rabbit.bindings.doubleIt|produceIt|logIt-in-0.consumer.durable-subscription=true"
  //   );
  // }
}
