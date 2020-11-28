package guru.springframework.msbeerservice.web.mappers;

import guru.springframework.msbeerservice.domain.Beer;
import guru.springframework.msbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}
