package ro.jtonic.handson.hackathon.persistence

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement

/**
 * Created by Antonel Ernest Pazargic on 23/02/2017.
 * @author Antonel Ernest Pazargic
 */

@EnableJpaRepositories
@EnableTransactionManagement
@EntityScan("ro.jtonic.handson.hackathon.persistence.model")
@Configuration
open class PersistenceConfig