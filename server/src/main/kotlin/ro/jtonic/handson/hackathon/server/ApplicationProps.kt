package ro.jtonic.handson.hackathon.server

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

/**
 * Created by Antonel Ernest Pazargic on 23/02/2017.
 * @author Antonel Ernest Pazargic
 */
@Component
data class ApplicationProps(
        @Value("\${app.first-name}") val firstName: String,
        @Value("\${app.last-name}") val lastName: String
)