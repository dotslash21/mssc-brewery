package xyz.arunangshu.msscbrewery.services;

import xyz.arunangshu.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
