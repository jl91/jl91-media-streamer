package application.controller;

import application.entity.MusicEntity;
import application.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/")
public class MusicController {

    @Autowired
    private MusicRepository musicRepository;

    @GetMapping()
    @ResponseBody
    public Iterable<MusicEntity> retrieve() {
        return this.musicRepository
                .findAll();
    }

    @GetMapping("{id}")
    @ResponseBody
    public ResponseEntity<Optional<MusicEntity>> retrieveById(@PathVariable("id") Long id) {
        return new ResponseEntity<Optional<MusicEntity>>(this.musicRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping()
    @ResponseBody
    public ResponseEntity create(
            @RequestBody MusicEntity musicEntity
    ) {
        this.musicRepository
                .save(musicEntity);

        return new ResponseEntity(HttpStatus.CREATED);
    }

    @RequestMapping(
            value = "{id}",
            method = RequestMethod.PUT,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
            consumes = {
                    MediaType.APPLICATION_JSON_UTF8_VALUE,
                    MediaType.MULTIPART_FORM_DATA_VALUE,
                    MediaType.APPLICATION_FORM_URLENCODED_VALUE
            }
    )
    @ResponseBody
    public ResponseEntity update(
            @PathVariable Long id,
            @RequestBody MusicEntity musicEntity
    ) {

        MusicEntity update = this.musicRepository.findOneById(id);

        update.setTitle(musicEntity.getTitle())
                .setAlbum(musicEntity.getAlbum())
                .setArtist(musicEntity.getArtist())
                .setDuration(musicEntity.getDuration())
                .setPath(musicEntity.getPath())
        ;

        this.musicRepository
                .save(musicEntity);

        return new ResponseEntity(HttpStatus.OK);
    }

}
