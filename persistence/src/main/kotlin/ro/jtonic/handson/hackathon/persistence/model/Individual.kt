package ro.jtonic.handson.hackathon.persistence.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

/**
 * Created by Antonel Ernest Pazargic on 23/02/2017.
 * @author Antonel Ernest Pazargic
 */
@Entity
class Individual (
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        var id: Long? = null,
        var firstName: String = "",
        var lastName: String = ""
) {
        constructor(firstName: String, lastName: String): this(null, firstName, lastName)
}