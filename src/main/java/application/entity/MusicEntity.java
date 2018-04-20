package application.entity;

import javax.persistence.*;

@Entity
@Table(name = "musics")
public class MusicEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_music")
    private Long id;

    private String title;

    private String artist;

    private Long duration;

    private String album;

    private String path;

    public MusicEntity() {
    }

    public MusicEntity(Long id) {
        this.setId(id);
    }

    public MusicEntity(Long id, String title) {
        this(id);
        this.setTitle(title);
    }

    public MusicEntity(Long id, String title, String artist) {
        this(id, title);
        this.setArtist(artist);
    }

    public MusicEntity(Long id, String title, String artist, Long duration) {
        this(id, title, artist);
        this.setDuration(duration);
    }

    public MusicEntity(Long id, String title, String artist, Long duration, String album) {
        this(id, title, artist, duration);
        this.setAlbum(album);
    }

    public MusicEntity(Long id, String title, String artist, Long duration, String album, String path) {
        this(id, title, artist, duration, album);
        this.setPath(path);
    }

    public String getPath() {
        return path;
    }

    public MusicEntity setPath(String path) {
        this.path = path;
        return this;
    }

    public Long getId() {
        return id;
    }

    public MusicEntity setId(Long id) {
        this.id = id;
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
                        "id: %d, " +
                        "title: %s, " +
                        "artist: %s, " +
                        "duration: %d, " +
                        "album: %s " +
                        "path: %s " +
                        "]",
                MusicEntity.class,
                this.getId(),
                this.getTitle(),
                this.getArtist(),
                this.getDuration(),
                this.getAlbum(),
                this.getPath()
        );
    }

}
