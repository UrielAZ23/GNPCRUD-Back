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

    public FolioEntity save(FolioEntity user) {
        return this.folioEntityInt.save(user);
    }

    public void delete(String username){
        this.folioEntityInt.deleteById(username);
    }

    public Boolean exist(String username) {
        return this.folioEntityInt.existsById(username);
    }
}
