package com.example.queries;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class QueriesApplication {

    public static void main(String[] args) {
        SpringApplication.run(QueriesApplication.class, args);
    }

    @Bean
    public CommandLineRunner setUp(AddressRepository addressRepository,AddressService addressService) {
        return args -> {
            addressRepository.save(new Address("Norrvägen",123,"Sollentuna"));
            addressRepository.save(new Address("Södervägen",543,"Uppsala"));
            addressRepository.save(new Address("Västervägen",873,"Solna"));
            addressRepository.save(new Address("Ostervägen",823,"Halmstad"));
            addressRepository.save(new Address("Halmstad",823,"Halmstad"));
            addressService.search();
        };
    }

}
