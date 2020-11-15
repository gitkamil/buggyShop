package edu.kamil.buggyShop.persistance.config;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@NoArgsConstructor
@ConfigurationProperties("buggy")
public class BuggyShopConfigProperties {
}
