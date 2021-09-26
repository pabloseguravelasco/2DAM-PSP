package com.salesianostriana.dam._Monumentos;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/monumento")
@RestController
@RequiredArgsConstructor
public class MonumentoController {

    private final MonumentoRepository repository;

    @GetMapping("/")
    public List<Monumento> findAll(){

        return repository.findAll();

    }




    @GetMapping("/{id}")
    public Monumento findOne(@PathVariable("id") Long id){

        return repository.findById(id).orElse(null);
    }



    @PostMapping("/")
    public ResponseEntity<Monumento> create(@RequestBody Monumento monumento){

        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(monumento));

    }



    @PutMapping("/{id}")
    public Monumento edit(@RequestBody Monumento monumento, @PathVariable Long id){

        Monumento m = repository.findById(id).orElse(monumento);

        m.setPaisNombre(monumento.getPaisNombre());
        m.setNombreCiudad(monumento.getNombreCiudad());
        m.setDescripcion(monumento.getDescripcion());
        m.setLocalizacion(monumento.getLocalizacion());
        m.setIsoCode(monumento.getIsoCode());
        m.setNombreMonumento(monumento.getNombreMonumento());
        m.setFoto(monumento.getFoto());

        return repository.save(monumento);


    }





    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id){

        repository.deleteById(id);
        return ResponseEntity.noContent().build();


    }
}
