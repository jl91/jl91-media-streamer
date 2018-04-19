package application.controller;

import application.entity.MusicEntity;
import application.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
public class MusicController {

    @Autowired
    private MusicRepository musicRepository;

    @GetMapping("/")
    @ResponseBody
    public Iterable<MusicEntity> retrieve() {
        return this.musicRepository
                .findAll();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity<Optional<MusicEntity>> retrieveById(@PathVariable("id") Long id) {
        return new ResponseEntity<Optional<MusicEntity>>(this.musicRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/")
    @ResponseBody
    public ResponseEntity create(
            @RequestParam("title") String title,
            @RequestParam("album") String album,
            @RequestParam("duration") Long duration,
            @RequestParam("artist") String artist,
            @RequestParam("path") String path
    ) {
        MusicEntity musicEntity = new MusicEntity();
        musicEntity
                .setTitle(title)
                .setAlbum(album)
                .setDuration(duration)
                .setArtist(artist)
                .setPath(path)
        ;

        this.musicRepository
                .save(musicEntity);

        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public ResponseEntity update(
            @PathVariable("id") Long id,
            @RequestParam("title") String title,
            @RequestParam("album") String album,
            @RequestParam("duration") Long duration,
            @RequestParam("artist") String artist,
            @RequestParam("path") String path
    ) {

        MusicEntity musicEntity = this.musicRepository.findOneById(id);

        musicEntity
                .setTitle(title)
                .setAlbum(album)
                .setDuration(duration)
                .setArtist(artist)
                .setPath(path)
        ;

        this.musicRepository
                .save(musicEntity);

        return new ResponseEntity(HttpStatus.OK);
    }

}
