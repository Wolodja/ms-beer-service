package guru.sfg.msbeerservice.services;

import guru.sfg.msbeerservice.web.model.BeerDto;
import guru.sfg.msbeerservice.web.model.BeerPagedList;
import guru.sfg.msbeerservice.web.model.BeerStyleEnum;
import org.springframework.data.domain.PageRequest;

import java.util.UUID;

public interface BeerService {
    BeerPagedList listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest, Boolean showInventoryOnHand);

    BeerDto getById(UUID beerId, Boolean showInventoryOnHand);

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);

    BeerDto getBeerByUpc(String upc);
}
