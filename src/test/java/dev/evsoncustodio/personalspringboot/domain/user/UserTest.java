package dev.evsoncustodio.personalspringboot.domain.user;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UserTest {
	
	@Test
	public void deveVerificarLombok() {
		Long id = 1L;
		String fullname = "fullname";
		String name = "name";
		String email = "email";
		String password = "password";
		LocalDate birthDate = LocalDate.MAX;
		String toString = String.format(
				"User(id=%d, fullname=%s, name=%s, email=%s, password=%s, birthDate=%s)",
				id, fullname, name, email, password, birthDate);
		
		User user = new User();
		user.setId(id);
		user.setFullname(fullname);
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		user.setBirthDate(birthDate);
		
		User userFull = new User(id, fullname, name, email, password, birthDate);
		
		assertEquals(user.getId(), userFull.getId());
		assertEquals(user.getFullname(), userFull.getFullname());
		assertEquals(user.getName(), userFull.getName());
		assertEquals(user.getEmail(), userFull.getEmail());
		assertEquals(user.getPassword(), userFull.getPassword());
		assertEquals(user.getBirthDate(), userFull.getBirthDate());
		assertEquals(toString, user.toString());
		assertEquals(user.hashCode(), userFull.hashCode());
		
		assertEquals(user, user);
		assertEquals(user, userFull);
		assertNotEquals(user, null);
		
		user.setBirthDate(LocalDate.MIN);
		assertNotEquals(user, userFull);
		
		user.setPassword(password + password);
		assertNotEquals(user, userFull);
		
		user.setEmail(email + email);
		assertNotEquals(user, userFull);
		
		user.setName(name + name);
		assertNotEquals(user, userFull);
		
		user.setFullname(fullname + fullname);
		assertNotEquals(user, userFull);
		
		user.setId(id + id);
		assertNotEquals(user, userFull);
	}
	
}
