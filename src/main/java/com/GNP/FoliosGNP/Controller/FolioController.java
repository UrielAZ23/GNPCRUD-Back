package com.GNP.FoliosGNP.Controller;


import com.GNP.FoliosGNP.Service.FolioService;
import com.GNP.FoliosGNP.persitence.Entity.FolioEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
