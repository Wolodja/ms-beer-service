package guru.sfg.common.events;

import guru.sfg.msbeerservice.web.model.BeerDto;
import lombok.*;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class BeerEvent implements Serializable {

    static final long serialVersionUID = -7135935457438909541L;

    private BeerDto beerDto;
}
