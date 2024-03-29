package com.example.activitylifecycle.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.activitylifecycle.R
import com.example.activitylifecycle.data.Location
import com.example.activitylifecycle.viewholders.LocationViewHolder


class LocationAdapter (private val locations: List<Location>) : RecyclerView.Adapter<LocationViewHolder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : LocationViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_location,parent,false)
        return LocationViewHolder(view)
    }

    override fun onBindViewHolder(holder: LocationViewHolder, position: Int) {
        holder.bind(locations[position])
    }

    override fun getItemCount() = locations.size
}