package guru.springframework.msbeerservice.events;

import guru.springframework.msbeerservice.web.model.BeerDto;

public class BrewBeerEvent extends BeerEvent{

    public BrewBeerEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
