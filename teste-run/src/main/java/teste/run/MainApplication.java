package teste.run;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import teste.run.service.MethodService;

@SpringBootApplication
public class MainApplication implements CommandLineRunner{
	
	@Autowired
	private MethodService methodService;
	
	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

	public void run(String... args) throws Exception {
		this.methodService.imprimirTeste();
	}

}
