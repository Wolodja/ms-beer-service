package guru.springframework.msbeerservice.events;

import guru.springframework.msbeerservice.web.model.BeerDto;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@RequiredArgsConstructor
@Builder
public class BeerEvent implements Serializable {

    static final long serialVersionUID = -7135935457438909541L;

    private final BeerDto beerDto;
}
