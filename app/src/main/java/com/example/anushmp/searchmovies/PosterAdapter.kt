package com.example.anushmp.searchmovies

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class PosterAdapter(var urlList:ArrayList<String>):RecyclerView.Adapter<PosterAdapter.PosterVh>() {






    inner class PosterVh(itemView: View): RecyclerView.ViewHolder(itemView){


    var posterview: ImageView = itemView.findViewById(R.id.posterview)

        fun setdata(url:String){



            Glide.with(itemView).load(url).into(posterview)




        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PosterVh {

        var v : View = LayoutInflater.from(parent.context).inflate(R.layout.poster_item_view,parent,false)

        var pvh = PosterVh(v)

        return pvh

    }

    override fun onBindViewHolder(holder: PosterVh, position: Int) {
        holder.setdata(urlList[position])
    }

    override fun getItemCount(): Int {
        return urlList.size
    }

}