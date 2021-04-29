package z18.Problem2;

public class Shelf {
    private Album[] albums;

    public Shelf(Album[] albums) {
        this.albums = albums;
    }

    public Album[] getAlbums() {
        return albums;
    }

    public String findAlbumBySong(String title){
        String albumTitle = "";
        for(Album a : albums){
            for(Song s : a.getSongs()){
                if(s.getTitle().equals(title)){
                    albumTitle =  a.getTitle();
                }
            }
        }
        return albumTitle;
    }
}
