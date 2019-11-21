package dev.evsoncustodio.personalspringboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import dev.evsoncustodio.personalspringboot.domain.user.User;

@Configuration
public class PersonalRepositoryRestConfiguration implements RepositoryRestConfigurer {
	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.setBasePath("/api");
		config.exposeIdsFor(User.class);
	}
}
