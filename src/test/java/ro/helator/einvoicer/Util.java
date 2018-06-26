package ro.helator.einvoicer;

import java.security.SecureRandom;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Util {

	public static void main(String[] args) {
		String encoded = new BCryptPasswordEncoder(11, new SecureRandom("einvoicer".getBytes())).encode("password");
		System.out.println(encoded);
	}
}
