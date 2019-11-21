package dev.evsoncustodio.personalspringboot;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.boot.SpringApplication;

@RunWith(PowerMockRunner.class)
@PrepareForTest(SpringApplication.class)
public class PersonalSpringBootApplicationTests {

	@Test
	public void deveCriarPersonalSpringApplication() {
		PersonalSpringBootApplication personalSpringBootApplication = new PersonalSpringBootApplication();
		
		assertNotNull(personalSpringBootApplication);
	}
	
	@Test
	public void deveExecutarSpringApplication() {
		String[] args = { "0", "1", "2" };
		
		PowerMockito.mockStatic(SpringApplication.class);
		
		Mockito
			.when(SpringApplication.run(
					PersonalSpringBootApplication.class, args))
			.thenReturn(null);
		
		PersonalSpringBootApplication.main(args);
		
		PowerMockito.verifyStatic(SpringApplication.class);
		SpringApplication.run(PersonalSpringBootApplication.class, args);
	}
}
