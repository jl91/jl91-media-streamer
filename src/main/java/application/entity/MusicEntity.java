package application.entity;

import javax.persistence.*;

@Entity
public class MusicEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_music")
    private Long idMusic;

    private String title;

    private String artist;

    private Long duration;

    private String album;

    private String path;

    public MusicEntity() {
    }

    public MusicEntity(Long idMusic) {
        this.setIdMusic(idMusic);
    }

    public MusicEntity(Long idMusic, String title) {
        this(idMusic);
        this.setTitle(title);
    }

    public MusicEntity(Long idMusic, String title, String artist) {
        this(idMusic, title);
        this.setArtist(artist);
    }

    public MusicEntity(Long idMusic, String title, String artist, Long duration) {
        this(idMusic, title, artist);
        this.setDuration(duration);
    }

    public MusicEntity(Long idMusic, String title, String artist, Long duration, String album) {
        this(idMusic, title, artist, duration);
        this.setAlbum(album);
    }

    public MusicEntity(Long idMusic, String title, String artist, Long duration, String album, String path) {
        this(idMusic, title, artist, duration, album);
        this.setPath(path);
    }

    public String getPath() {
        return path;
    }

    public MusicEntity setPath(String path) {
        this.path = path;
        return this;
    }

    public Long getIdMusic() {
        return idMusic;
    }

    public MusicEntity setIdMusic(Long idMusic) {
        this.idMusic = idMusic;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public MusicEntity setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getArtist() {
        return artist;
    }

    public MusicEntity setArtist(String artist) {
        this.artist = artist;
        return this;
    }

    public Long getDuration() {
        return duration;
    }

    public MusicEntity setDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    public String getAlbum() {
        return album;
    }

    public MusicEntity setAlbum(String album) {
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
                        "path: %s " +
                        "]",
                MusicEntity.class,
                this.getIdMusic(),
                this.getTitle(),
                this.getArtist(),
                this.getDuration(),
                this.getAlbum(),
                this.getPath()
        );
    }

}
