package com.example.lenovog40.tampilanawal.Adapter2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.example.lenovog40.tampilanawal.Api2.ServerImageParseAdapter;
import com.example.lenovog40.tampilanawal.R;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    Context context;
    List<GetDataAdapter> getDataAdapter;
    ImageLoader imageLoader1;

    public RecyclerViewAdapter(List<GetDataAdapter> getDataAdapter, Context context){
        super();
        this.getDataAdapter = getDataAdapter;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_items2, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder Viewholder, int position) {
        GetDataAdapter getDataAdapter1 =  getDataAdapter.get(position);
        imageLoader1 = ServerImageParseAdapter.getInstance(context).getImageLoader();

        imageLoader1.get(getDataAdapter1.getImageServerUrl(),
            ImageLoader.getImageListener(
                Viewholder.networkImageView,//Server Image
                R.mipmap.ic_launcher,//Before loading server image the default showing image.
                android.R.drawable.ic_dialog_alert //Error image if requested image dose not found on server.
            )
        );
        Viewholder.networkImageView.setImageUrl(getDataAdapter1.getImageServerUrl(), imageLoader1);
        Viewholder.ImageJudul.setText(getDataAdapter1.getImageJudul());
    }

    @Override
    public int getItemCount() {
        return getDataAdapter.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        public TextView ImageJudul;
        public NetworkImageView networkImageView ;

        public ViewHolder(View itemView) {
            super(itemView);
             ImageJudul = (TextView) itemView.findViewById(R.id.textView_item) ;
            networkImageView = (NetworkImageView) itemView.findViewById(R.id.VollyNetworkImageView1) ;
        }
    }
}