package ro.jtonic.handson.hackathon.server

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import ro.jtonic.handson.hackathon.persistence.PersistenceConfig

/**
 * Created by Antonel Ernest Pazargic on 23/02/2017.
 * @author Antonel Ernest Pazargic
 */
@Configuration
@Import(PersistenceConfig::class)
open class ApplicationConfig