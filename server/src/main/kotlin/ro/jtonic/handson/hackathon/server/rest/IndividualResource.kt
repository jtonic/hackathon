package ro.jtonic.handson.hackathon.server.rest

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import ro.jtonic.handson.hackathon.commons.Individual

/**
 * Created by Antonel Ernest Pazargic on 23/02/2017.
 * @author Antonel Ernest Pazargic
 */

@RestController
open class IndividualResource {

    @Value("\${app.developer.first-name}") lateinit var firstName: String
    @Value("\${app.developer.last-name}") lateinit var lastName: String

    @GetMapping("/")
    fun getIndividual() = Individual(firstName, lastName, 47, true)

}