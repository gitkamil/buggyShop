package edu.kamil.buggyShop.persistance;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("service")
@Getter
@Setter
public class ServiceProperties {

    /**
     * A message for the service.
     */
    private String message;

}
