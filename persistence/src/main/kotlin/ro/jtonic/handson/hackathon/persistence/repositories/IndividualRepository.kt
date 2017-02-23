package ro.jtonic.handson.hackathon.persistence.repositories

import org.springframework.data.jpa.repository.JpaRepository
import ro.jtonic.handson.hackathon.persistence.model.Individual

/**
 * Created by Antonel Ernest Pazargic on 23/02/2017.
 * @author Antonel Ernest Pazargic
 */
interface IndividualRepository: JpaRepository<Individual, Long>