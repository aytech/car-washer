package com.washer.dao.jpa;

import com.washer.model.Car;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(rollbackFor = Exception.class)
public class WasherRepository {

    private final EntityManager entityManager;

    public WasherRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public List<Car> getCars() {
        return entityManager.createQuery("from Car", Car.class).getResultList();
    }

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public Car getCar(int id) {
        return entityManager.find(Car.class, id);
    }
}
