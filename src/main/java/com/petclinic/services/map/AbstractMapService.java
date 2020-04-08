package com.petclinic.services.map;

import com.petclinic.model.BaseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById (ID id){
        return map.get(id);
    }

    T save(T object) {
        if (object != null) {
            if(object.getId() == null){
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
            return object;
        } else {
            throw new RuntimeException("Object can not be null");
        }
    }

    void deleteById(ID id){
        this.map.remove(id);
    }

    void delete(T object) {
        this.map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNextId(){
        Long nextID;
        try{
            nextID = Collections.max(map.keySet()) + 1L;
        } catch (NoSuchElementException e) {
            nextID = 1L;
        }
        return nextID;
    }
}
