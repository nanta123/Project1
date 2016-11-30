package id.sch.smktelkom_mlg.project.xirpl604132231.project1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mahendra on 09/11/2016.
 */
public class HotelAdapter_list extends RecyclerView.Adapter<HotelAdapter_list.ViewHolder> {
    ArrayList<Hotel_list> hotelListList;

    public HotelAdapter_list(ArrayList<Hotel_list> hotelListList) {
        this.hotelListList = hotelListList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_list_tf, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Hotel_list hotelList = hotelListList.get(position);
        holder.tvJudul.setText(hotelList.judul);
        holder.tvDeskripsi.setText(hotelList.deskripsi);
        holder.ivFoto.setImageDrawable(hotelList.foto);
    }

    @Override
    public int getItemCount() {
        if (hotelListList != null)
            return hotelListList.size();
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFoto;
        TextView tvJudul;
        TextView tvDeskripsi;

        public ViewHolder(View itemView) {
            super(itemView);
            ivFoto = (ImageView) itemView.findViewById(R.id.imageView);
            tvJudul = (TextView) itemView.findViewById(R.id.textViewJudul);
            tvDeskripsi = (TextView) itemView.findViewById(R.id.textViewDeskripsi);

        }
    }
}
