package guru.springframework.msscbeerservice.bootstrap;

import guru.springframework.msscbeerservice.domain.Beer;
import guru.springframework.msscbeerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {
    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository){
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects(){
        if(beerRepository.count() == 0) {
            beerRepository.save(Beer.builder()
                            .beerName("Heineken")
                            .beerStyle("IPA")
                            .quantityToBrew(200)
                            .minOnHand(12)
                            .upc(242342134233L)
                            .price(new BigDecimal("12.95"))
                            .build());

            beerRepository.save(Beer.builder()
                    .beerName("Budweiser")
                    .beerStyle("Draught")
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .upc(99423421322L)
                    .price(new BigDecimal("10.95"))
                    .build());
        }
//        System.out.println("Loaded Beers: " + beerRepository.count());
    }
}
