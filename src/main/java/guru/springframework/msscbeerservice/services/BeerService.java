package guru.springframework.msscbeerservice.services;

import guru.springframework.msscbeerservice.brewery.model.BeerDto;
import guru.springframework.msscbeerservice.brewery.model.BeerPagedList;
import guru.springframework.msscbeerservice.brewery.model.BeerStyleEnum;
import org.springframework.data.domain.PageRequest;

import java.util.UUID;

public interface BeerService {
    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest, Boolean showInventoryOnHand);

    BeerDto getById(UUID beerId, Boolean showInventoryOnHand);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);

    BeerDto getByUpc(String upc);
}
