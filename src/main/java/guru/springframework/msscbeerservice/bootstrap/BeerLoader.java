package guru.springframework.msscbeerservice.bootstrap;

import guru.springframework.msscbeerservice.domain.Beer;
import guru.springframework.msscbeerservice.repositories.BeerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@RequiredArgsConstructor
@Component
public class BeerLoader implements CommandLineRunner {
    public static final String BEER_1_UPC = "0631234200036";
    public static final String BEER_2_UPC = "0631234300019";
    public static final String BEER_3_UPC = "0083783375213";

    private final BeerRepository beerRepository;

    @Override
    public void run(String... args) throws Exception {
        if(beerRepository.count() == 0)
            loadBeerObjects();
    }

    private void loadBeerObjects() {
        Beer b1 = Beer.builder()
                            .beerName("Heineken")
                            .beerStyle("IPA")
                            .quantityToBrew(200)
                            .minOnHand(12)
                            .upc(BEER_1_UPC)
                            .price(new BigDecimal("12.95"))
                            .build();

        Beer b2 = Beer.builder()
                    .beerName("Budweiser")
                    .beerStyle("Draught")
                    .quantityToBrew(200)
                    .minOnHand(12)
                    .upc(BEER_2_UPC)
                    .price(new BigDecimal("10.95"))
                    .build();

        Beer b3 = Beer.builder()
                    .beerName("KingFisher")
                    .beerStyle("ALE")
                    .quantityToBrew(500)
                    .minOnHand(12)
                    .upc(BEER_3_UPC)
                    .price(new BigDecimal("9.95"))
                    .build();
        beerRepository.save(b1);
        beerRepository.save(b2);
        beerRepository.save(b3);
    }

//    private void loadBeerObjects(){
//        if(beerRepository.count() == 0) {
//            beerRepository.save(Beer.builder()
//                            .beerName("Heineken")
//                            .beerStyle("IPA")
//                            .quantityToBrew(200)
//                            .minOnHand(12)
//                            .upc(BEER_1_UPC)
//                            .price(new BigDecimal("12.95"))
//                            .build());
//
//            beerRepository.save(Beer.builder()
//                    .beerName("Budweiser")
//                    .beerStyle("Draught")
//                    .quantityToBrew(200)
//                    .minOnHand(12)
//                    .upc(BEER_2_UPC)
//                    .price(new BigDecimal("10.95"))
//                    .build());
//            beerRepository.save(Beer.builder()
//                    .beerName("KingFisher")
//                    .beerStyle("ALE")
//                    .quantityToBrew(500)
//                    .minOnHand(12)
//                    .upc(BEER_3_UPC)
//                    .price(new BigDecimal("9.95"))
//                    .build());
//        }
//        System.out.println("Loaded Beers: " + beerRepository.count());
//    }
}
