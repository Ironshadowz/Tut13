package nus.iss.tut13;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import nus.iss.tut13.utility.utility;

@SpringBootApplication
public class Tut13Application {

	public static void main(String[] args)
	 {
		SpringApplication app = new SpringApplication(Tut13Application.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", 3000));
		DefaultApplicationArguments appArgs = new DefaultApplicationArguments(args);
		List<String> ops = appArgs.getOptionValues("dataDir");
		System.out.println(ops);
		if(ops!=null)
		{ 
			utility.createDir(ops.get(0));
		} else
		{	
			System.out.println("No dir provided");
			System.exit(1);
		}
		app.run(args);	
	}

}
