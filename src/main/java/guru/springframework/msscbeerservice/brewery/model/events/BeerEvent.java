package guru.springframework.msscbeerservice.brewery.model.events;


import guru.springframework.msscbeerservice.brewery.model.BeerDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class BeerEvent implements Serializable {
    static final long serialVersionUID = -5781515597148163111L;
    private BeerDto beerDto;
}
