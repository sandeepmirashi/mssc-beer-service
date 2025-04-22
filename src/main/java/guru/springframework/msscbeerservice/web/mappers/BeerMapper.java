package guru.springframework.msscbeerservice.web.mappers;

import guru.springframework.msscbeerservice.domain.Beer;
import guru.springframework.msscbeerservice.web.model.BeerDto;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

@Mapper(uses = {DataMapper.class})
@DecoratedWith(BeerMapperDecorator.class)
public interface BeerMapper {
    BeerDto BeerToBeerDto(Beer beer);
    BeerDto BeerToBeerDtoWithInventory(Beer beer);
    Beer BeerDtoToBeer(BeerDto dto);
}
