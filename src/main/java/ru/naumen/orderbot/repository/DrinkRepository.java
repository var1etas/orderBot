package ru.naumen.orderbot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.naumen.orderbot.entity.DrinkEntity;

import java.util.UUID;

@Repository
public interface DrinkRepository extends CrudRepository<DrinkEntity, UUID> {
}
