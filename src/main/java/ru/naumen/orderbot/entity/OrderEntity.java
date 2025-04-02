package ru.naumen.orderbot.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

/**
 * Сущность заказа
 */
@Entity
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private LocalDateTime orderDate;

    private LocalDateTime deliveryDate;

    @OneToOne(cascade = CascadeType.ALL)
    private UserEntity deliveryMan;

    @OneToOne(cascade = CascadeType.ALL)
    private UserEntity recipient;

    @OneToMany(cascade = CascadeType.ALL)
    private List<DishEntity> dishes;

    @OneToMany(cascade = CascadeType.ALL)
    private List<DrinkEntity> drinks;

    private OrderStatus status;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDateTime deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public UserEntity getDeliveryMan() {
        return deliveryMan;
    }

    public void setDeliveryMan(UserEntity deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

    public UserEntity getRecipient() {
        return recipient;
    }

    public void setRecipient(UserEntity recipient) {
        this.recipient = recipient;
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

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
