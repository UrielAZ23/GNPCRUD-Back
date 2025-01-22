package com.GNP.FoliosGNP.Service;

import com.GNP.FoliosGNP.persitence.Entity.FolioEntity;
import com.GNP.FoliosGNP.persitence.Repository.FolioEntityInt;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FolioService {

    private final FolioEntityInt folioEntityInt;

    public FolioService(FolioEntityInt folioEntityInt) {
        this.folioEntityInt = folioEntityInt;
    }
    public List<FolioEntity> getAll(){
        return this.folioEntityInt.findAll();
    }
}
