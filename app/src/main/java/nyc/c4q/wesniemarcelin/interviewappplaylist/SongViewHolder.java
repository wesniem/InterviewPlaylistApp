package nyc.c4q.wesniemarcelin.interviewappplaylist;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.wesniemarcelin.interviewappplaylist.model.Song;

/**
 * Created by wesniemarcelin on 12/8/16.
 */
public class SongViewHolder extends RecyclerView.ViewHolder{
    //Must instantiate the views that are required for each viewholder
    TextView artistView;
    TextView songTitleView;
    TextView testerView;
    private Song song;



    //Same views from above belong in the constructor
    public SongViewHolder(View itemView) {
        super(itemView);
        artistView = (TextView) itemView.findViewById(R.id.song_artist);
        songTitleView = (TextView) itemView.findViewById(R.id.song_title);
        testerView = (TextView)itemView.findViewById(R.id.new_text_view);

        //For intent
        final Context context = itemView.getContext();

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, OnClickActivity.class);
                intent.putExtra("Song", song);
                context.startActivity(intent);
            }
        });
    }

    //This method allows you to bind each song into the viewholder
    public void bind(Song song){
        this.song = song;
        artistView.setText(song.getArtist());
        songTitleView.setText(song.getTitle());
//        testerView.setText(song);
    }
}
