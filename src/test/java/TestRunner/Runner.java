package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources", // Ruta donde se encuentran los archivos .feature
        glue = "stepdefinitions" // Paquete donde se encuentran las definiciones de pasos
)

public class Runner {

}
