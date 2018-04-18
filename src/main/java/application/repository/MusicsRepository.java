package application.repository;

import application.entity.MusicsEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MusicsRepository extends CrudRepository<MusicsEntity, Long> {

    List<MusicsEntity> findByTitle(String title);
}
