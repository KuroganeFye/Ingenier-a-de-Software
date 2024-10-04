package mx.ipn.alumno.jsanchezm1704.IngenieraDeSoftware.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import mx.ipn.alumno.jsanchezm1704.IngenieraDeSoftware.model.Response;


@RestController
public class Controller 
{
    @GetMapping("/api/cerradura/estrella")
    public ResponseEntity<Response> cerraduraEstrella(@RequestParam  int n)
    {
        String respuesta ="La cerradura de la estrella se ha cerrado " + String.valueOf(n);
        Response response = new Response(respuesta);
        return  ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @GetMapping("/api/cerradura/positiva/{n}")
    public ResponseEntity<Response> cerraduraPositiva(@PathVariable int n)
    {
        //
        Response response = new Response("La cerradura positiva se ha cerrado "+ String.valueOf(n) + " Σ^*={λ,0,1}");
        return  ResponseEntity.status(HttpStatus.OK).body(response);
    }
}

/*
fetch('http://localhost:8080/api/cerradura/estrella',
{method:'POST',headers:{'Content-Type':'application/json'},
body:JSON.stringify({n:'3'})}).then(response =>response.json())
.then(data => console.log(data)).catch(error => console
.error('error:',error));
*/