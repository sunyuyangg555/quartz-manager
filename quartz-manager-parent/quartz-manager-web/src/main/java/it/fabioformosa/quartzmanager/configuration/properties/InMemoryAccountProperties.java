package it.fabioformosa.quartzmanager.configuration.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "quartz-manager.accounts.in-memory")
@Getter @Setter
public class InMemoryAccountProperties {
  private boolean enabled;
  private List<User> users;

  @Getter @Setter
  public static class User {
    private String name;
    private String password;
    private List<String> roles = new ArrayList<>();
  }
}
