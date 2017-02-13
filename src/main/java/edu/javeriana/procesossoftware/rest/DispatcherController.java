/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.javeriana.procesossoftware.rest;

import edu.javeriana.patronessoftware.model.Frecuencia;
import edu.javeriana.patronessoftware.model.Invernadero;
import java.util.concurrent.ThreadLocalRandom;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Felipe
 */
@RestController
@RequestMapping("/app")
public class DispatcherController {

    @RequestMapping(value = "/agregar", method = RequestMethod.POST)
    public ResponseEntity<Frecuencia> greeting(@RequestBody Invernadero customer) {
        return new ResponseEntity(new Frecuencia(ThreadLocalRandom.current().nextInt(5, 60)),
                HttpStatus.OK);
    }
}
