package com.GNP.FoliosGNP.Service;

import com.GNP.FoliosGNP.persitence.Entity.FolioEntity;
import com.GNP.FoliosGNP.persitence.Repository.FolioEntityInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FolioService {

    private final FolioEntityInt folioEntityInt;

    @Autowired
    public FolioService(FolioEntityInt folioEntityInt) {
        this.folioEntityInt = folioEntityInt;
    }
    public List<FolioEntity> getAll(){
        return this.folioEntityInt.findAll();
    }

    public FolioEntity getUserById(String id) {
        return this.folioEntityInt.findById(id).orElse(null);

    }

    public FolioEntity save(FolioEntity folio) {
        if(exist(folio.folio)){
            return this.folioEntityInt.save(folio);
        }
        return this.folioEntityInt.save(folio);
    }


    public void delete(String folio){
        this.folioEntityInt.deleteById(folio);
    }

    public Boolean exist(String folio) {
        return this.folioEntityInt.existsById(folio);
    }
}
