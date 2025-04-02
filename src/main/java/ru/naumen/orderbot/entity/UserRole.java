package ru.naumen.orderbot.entity;

import org.springframework.security.core.GrantedAuthority;

/**
 * Роли пользователя в системе
 */
public enum UserRole implements GrantedAuthority {

    /**
     * Пользователь, заказчик
     */
    ROLE_USER,

    /**
     * Администратор системы, сотрудник ресторана
     */
    ROLE_ADMIN,

    /**
     * Доставщик
     */
    ROLE_DELIVERYMAN;

    @Override
    public String getAuthority() {
        return this.toString();
    }

}
