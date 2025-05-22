package net.journal.journalApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//Annotation @SpringBootApplication its manages 3 annonation 1)Configuration 2)EnableAutoConfiguration, 3)ComponentScan
@SpringBootApplication
public class JournalAppApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(JournalAppApplication.class, args);
	}

}
