package com.example.recycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.databinding.DatchikItemBinding

class DatchikAdapter: RecyclerView.Adapter<DatchikAdapter.DatchikHolder>() {
    val datchikList = ArrayList<Datchik>()

    class DatchikHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = DatchikItemBinding.bind(item)

        fun bind(datchik: Datchik) = with(binding){
            im.setImageResource(datchik.imageId)
            tvTitle.text = datchik.name

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DatchikHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.datchik_item, parent, false)
        return DatchikHolder(view)
    }

    override fun getItemCount(): Int {
        return datchikList.size
    }

    override fun onBindViewHolder(holder: DatchikHolder, position: Int) {
        holder.bind(datchikList[position])
    }

    public fun addDatchik(datchik: Datchik){
        datchikList.add(datchik)
        notifyDataSetChanged()
    }

}