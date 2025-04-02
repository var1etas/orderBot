package ru.naumen.orderbot.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * Сущность меню
 */
@Entity
public class MenuEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private LocalDateTime formingDateTime;

    @OneToMany(cascade = CascadeType.ALL)
    private List<DishEntity> dishes;

    @OneToMany(cascade = CascadeType.ALL)
    private List<DrinkEntity> drinks;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getFormingDateTime() {
        return formingDateTime;
    }

    public void setFormingDateTime(LocalDateTime formingDateTime) {
        this.formingDateTime = formingDateTime;
    }

    public List<DishEntity> getDishes() {
        return dishes;
    }

    public void setDishes(List<DishEntity> dishes) {
        this.dishes = dishes;
    }

    public List<DrinkEntity> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<DrinkEntity> drinks) {
        this.drinks = drinks;
    }
}
