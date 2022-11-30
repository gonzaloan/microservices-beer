package cl.gonmunoz.microservicesbeer.repositories;

import cl.gonmunoz.microservicesbeer.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
