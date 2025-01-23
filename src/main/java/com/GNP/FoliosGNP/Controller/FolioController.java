package com.GNP.FoliosGNP.Controller;


import com.GNP.FoliosGNP.Service.FolioService;
import com.GNP.FoliosGNP.persitence.Entity.FolioEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.http.HttpStatus;

import java.util.List;

@RestController
@RequestMapping("/api/folio")
public class FolioController {

private final FolioService folioService;

    public FolioController(FolioService folioService) {
        this.folioService = folioService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<FolioEntity>> getAll(){
        return ResponseEntity.ok(folioService.getAll());
    }

    @GetMapping("/{folio}")
    public ResponseEntity<FolioEntity> getUser(@PathVariable String folio) {
        return ResponseEntity.ok(folioService.getUserById(folio));
    }
    @PostMapping("/add")
    public ResponseEntity<FolioEntity> save(@RequestBody FolioEntity folio) {

        if(folio.getFolio()!=null && !this.folioService.exist(folio.getFolio())){
            return ResponseEntity.ok(this.folioService.save(folio));
        }else{
            FolioEntity responseBody = new FolioEntity();
            return new ResponseEntity<>(responseBody, HttpStatus.ACCEPTED);
        }

    }

    @PutMapping("/update")
    public ResponseEntity<FolioEntity> update(@RequestBody FolioEntity folio) {
        if(folio.getFolio()!=null && this.folioService.exist(folio.getFolio())){
            return ResponseEntity.ok(this.folioService.save(folio));
        }else{
            FolioEntity responseBody = new FolioEntity();
            return new ResponseEntity<>(responseBody, HttpStatus.ACCEPTED);
        }
    }
    @DeleteMapping("/delete/{folio}")
    public ResponseEntity<Void> delete(@PathVariable String folio){
        if(folioService.exist(folio)){
            this.folioService.delete(folio);
            return ResponseEntity.ok().build();
        }else{
            return ResponseEntity.badRequest().build();
        }
    }
}
