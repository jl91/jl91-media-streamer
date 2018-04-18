package application.music;

import application.entity.MusicsEntity;
import application.repository.MusicsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MusicController {

    @Autowired
    private MusicsRepository musicsRepository;

    @RequestMapping("/")
    @ResponseBody
    public Iterable<MusicsEntity> index() {
        MusicsEntity musicEntity = new MusicsEntity();
        musicEntity
                .setTitle("Title 1")
                .setAlbum("Album 1")
                .setDuration(1L)
                .setArtist("Artist 1")
        ;

        this.musicsRepository
                .save(musicEntity);

        return this.musicsRepository
                .findAll();
    }

}
