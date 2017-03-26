package ro.jtonic.handson.hackathon.server.rest

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import ro.jtonic.handson.hackathon.persistence.model.Individual
import ro.jtonic.handson.hackathon.persistence.repositories.IndividualRepository
import ro.jtonic.handson.hackathon.server.ApplicationProps

/**
 * Created by Antonel Ernest Pazargic on 23/02/2017.
 * @author Antonel Ernest Pazargic
 */

@RestController
class IndividualResource @Autowired constructor(
        var appProps: ApplicationProps,
        var individualRepo: IndividualRepository) {

    @GetMapping("/")
    fun getIndividual(): List<Individual> {
        println("The user ${appProps.firstName} - ${appProps.lastName} is searching for all individuals")
        return individualRepo.findAll()
    }

}
