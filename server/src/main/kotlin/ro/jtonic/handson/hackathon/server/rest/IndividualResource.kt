package ro.jtonic.handson.hackathon.server.rest

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import ro.jtonic.handson.hackathon.persistence.model.Individual
import ro.jtonic.handson.hackathon.persistence.repositories.IndividualRepository

/**
 * Created by Antonel Ernest Pazargic on 23/02/2017.
 * @author Antonel Ernest Pazargic
 */

@RestController
open class IndividualResource {

    @Autowired lateinit var individualRepo: IndividualRepository

    @GetMapping("/")
    fun getIndividual(): List<Individual> {
        return individualRepo.findAll()
    }

}