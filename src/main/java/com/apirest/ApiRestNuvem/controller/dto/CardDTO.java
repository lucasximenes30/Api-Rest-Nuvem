package com.apirest.ApiRestNuvem.controller.dto;

import com.apirest.ApiRestNuvem.domain.model.Card;

import java.math.BigDecimal;

public record CardDTO(Long id, String number, BigDecimal limit) {

    public CardDTO(Card model) {
        this(model.getId(), model.getNumber(), model.getLimit());
    }

    public Card toModel() {
        Card model = new Card();
        model.setId(this.id);
        model.setNumber(this.number);
        model.setLimit(this.limit);
        return model;
    }
}
