package application.entity;

import javax.persistence.*;

@Entity
public class MusicsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_music")
    private Long idMusic;

    private String title;

    private String artist;

    private Long duration;

    private String album;

    public MusicsEntity() {
    }

    public MusicsEntity(Long idMusic) {
        this.setIdMusic(idMusic);
    }

    public MusicsEntity(Long idMusic, String title) {
        this(idMusic);
        this.setTitle(title);
    }

    public MusicsEntity(Long idMusic, String title, String artist) {
        this(idMusic, title);
        this.setArtist(artist);
    }

    public MusicsEntity(Long idMusic, String title, String artist, Long duration) {
        this(idMusic, title, artist);
        this.setDuration(duration);
    }

    public MusicsEntity(Long idMusic, String title, String artist, Long duration, String album) {
        this(idMusic, title, artist, duration);
        this.setAlbum(album);
    }

    public Long getIdMusic() {
        return idMusic;
    }

    public MusicsEntity setIdMusic(Long idMusic) {
        this.idMusic = idMusic;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public MusicsEntity setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getArtist() {
        return artist;
    }

    public MusicsEntity setArtist(String artist) {
        this.artist = artist;
        return this;
    }

    public Long getDuration() {
        return duration;
    }

    public MusicsEntity setDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    public String getAlbum() {
        return album;
    }

    public MusicsEntity setAlbum(String album) {
        this.album = album;
        return this;
    }

    @Override
    public String toString() {
        return String.format("%s, [ " +
                        "idMusic: %d, " +
                        "title: %s, " +
                        "artist: %s, " +
                        "duration: %d, " +
                        "album: %s " +
                        "]",
                MusicsEntity.class,
                this.getIdMusic(),
                this.getTitle(),
                this.getArtist(),
                this.getDuration(),
                this.getAlbum()
        );
    }

}
