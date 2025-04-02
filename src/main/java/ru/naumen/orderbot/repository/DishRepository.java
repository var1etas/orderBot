package ru.naumen.orderbot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.naumen.orderbot.entity.DishEntity;

import java.util.UUID;

@Repository
public interface DishRepository extends CrudRepository<DishEntity, UUID> {
}
