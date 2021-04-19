package com.gitfocus;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tech Mahindra 
 * Initial class to boot GitFocus Application
 */
@RestController
@SpringBootApplication
public class GitFocusApplication {

	private static final Logger logger = LoggerFactory.getLogger(GitFocusApplication.class);

	public GitFocusApplication() {
		super();
		// TODO Auto-generated constructor stub
		logger.info("Starting GitFocus-Service Application..");
	}

	@GetMapping(value = "/hello")
	public void codeVulnerabiltyCheck() {
		try {

			// Generate a 1024-bit Digital Signature Algorithm (DSA) key pair
			KeyPairGenerator keyGen = KeyPairGenerator.getInstance("DSA");
			keyGen.initialize(1024);
			KeyPair keypair = keyGen.genKeyPair();
			PrivateKey privateKey = keypair.getPrivate();
			PublicKey publicKey = keypair.getPublic();

			System.out.println(privateKey + "n" + publicKey);

			// Generate a 576-bit DH key pair
			keyGen = KeyPairGenerator.getInstance("DH");
			keyGen.initialize(576);
			keypair = keyGen.genKeyPair();
			privateKey = keypair.getPrivate();
			publicKey = keypair.getPublic();

			System.out.println(privateKey + "n" + publicKey);

			// Generate a 1024-bit RSA key pair
			keyGen = KeyPairGenerator.getInstance("RSA");
			keyGen.initialize(1024);
			keypair = keyGen.genKeyPair();
			privateKey = keypair.getPrivate();
			publicKey = keypair.getPublic();

			System.out.println(privateKey + "n" + publicKey);

		} catch (java.security.NoSuchAlgorithmException e) {
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(GitFocusApplication.class, args);
	}
}