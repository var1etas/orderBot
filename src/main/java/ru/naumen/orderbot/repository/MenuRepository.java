package ru.naumen.orderbot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.naumen.orderbot.entity.MenuEntity;

import java.util.UUID;

@Repository
public interface MenuRepository extends CrudRepository<MenuEntity, UUID> {
}
