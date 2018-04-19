package application.repository;

import application.entity.MusicEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MusicRepository extends CrudRepository<MusicEntity, Long> {

    MusicEntity findOneById(Long id);

    List<MusicEntity> findByTitle(String title);

    List<MusicEntity> findByArtist(String artist);

    List<MusicEntity> findByDuration(Long duration);

    List<MusicEntity> findByAlbum(String album);

    List<MusicEntity> findByPath(String path);
}
