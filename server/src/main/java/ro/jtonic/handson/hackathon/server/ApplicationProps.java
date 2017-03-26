package ro.jtonic.handson.hackathon.server;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Antonel Ernest Pazargic on 26/03/2017.
 *
 * @author Antonel Ernest Pazargic
 */
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "app")
@Component
public class ApplicationProps {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
