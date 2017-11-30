package ee.veebiteenused.ttu.api

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class HwApiApplication {

    @Bean
    fun init() = CommandLineRunner {

    }
}

fun main(args: Array<String>) {
    SpringApplication.run(HwApiApplication::class.java, *args)
}
