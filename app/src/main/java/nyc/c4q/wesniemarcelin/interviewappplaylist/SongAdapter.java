package nyc.c4q.wesniemarcelin.interviewappplaylist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.wesniemarcelin.interviewappplaylist.model.Song;

/**
 * Created by wesniemarcelin on 12/8/16.
 */

public class SongAdapter extends RecyclerView.Adapter<SongViewHolder> {
    List<Song> songList;

    //Contructor to take in list of songs
    public SongAdapter(List<Song> songList) {
        this.songList = songList;
    }

    @Override
    public SongViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //onCreateView must be created this way for simplicity
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.playlist_item_view, parent, false);
        return new SongViewHolder(itemView);
    }

    @Override
    //Binds the viewholder to the list
    public void onBindViewHolder(SongViewHolder holder, int position) {
        Song mySong = songList.get(position);
        //holder is referring to the Viewholder and its forcing it to bind
        holder.bind(mySong);
    }

    @Override
    public int getItemCount() {
        return songList.size();
    }
}
