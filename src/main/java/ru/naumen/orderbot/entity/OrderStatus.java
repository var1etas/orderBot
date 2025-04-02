package ru.naumen.orderbot.entity;

/**
 * Статусы выполнения заказа
 */
public enum OrderStatus {

    /**
     * Заказ обрабатывается
     */
    PROCESSING,

    /**
     * Заказ приготавливается
     */
    COOKING,

    /**
     * Заказ доставляется
     */
    DELIVERING,

    /**
     * Заказ получен клиентом
     */
    RECEIVED
}
