package mx.ipn.alumno.jsanchezm1704.CerradurasK.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class HomeController 
{
    @GetMapping("/")
    public String home() 
    {
        return "Bienvenido a la aplicación Spring Boot desde mi PC";
    }
    
}
