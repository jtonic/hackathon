package ro.jtonic.handson.hackathon.server

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class Application @Autowired constructor(var appProps: ApplicationProps) {

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(Application::class.java, *args)
        }
    }

    @Bean
    fun commandLineRunner() = {
        CommandLineRunner {
//            println("name = ${appProps.firstName}")
            println("name = Antonel")
        }
    }

}

