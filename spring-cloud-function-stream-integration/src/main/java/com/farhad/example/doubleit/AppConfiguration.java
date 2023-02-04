package com.farhad.example.doubleit;

import java.util.function.Consumer;
import java.util.function.Function;

import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration ;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;


@Configuration
@Slf4j
public class AppConfiguration {
    

  @Bean
  Consumer<Flux<StringPayload>> process(StreamBridge streamBridge) {
    return payloads -> payloads.map(StringPayload::getString)
                               .doOnNext(str -> log.info("process => {}", str))
                               .subscribe(str -> streamBridge.send("idestination", str/*
                                  (Object) str, org.springframework.util.MimeType.valueOf("application/json")*/));
  }

  @Bean
  Function<Flux<String>, Flux<Integer>> doubleIt() {
    return integers -> integers.map(Integer::valueOf)
                               .map(integer -> integer * 2)
                               .doOnNext(o -> log.info("doubleIt => {}", o));
  }

  @Bean
  Function<Flux<Integer>, Flux<IntegerPayload>> produceIt() {
    return integers -> integers.flatMap(integer -> Flux.range(0, integer))
                               .doOnNext(o -> log.info("produceIt => {}", o))
                               .map(IntegerPayload::of)
                               .window(100)
                               .flatMap(flux -> flux);
  }

  @Bean
  Consumer<Flux<IntegerPayload>> logIt() {
    return payloads -> payloads.subscribe(payload -> log.info("logIt => {}", payload));
  }

}
