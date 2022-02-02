package com.codeop.android_persisting_data_advanced_concept_ex1_solution

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import java.text.SimpleDateFormat
import java.util.*

class DatetimeAdapter : ListAdapter<Datetime, DatetimeViewHolder>(DatetimeDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DatetimeViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_view, parent, false) as TextView
        return DatetimeViewHolder(view)
    }

    override fun onBindViewHolder(holder: DatetimeViewHolder, position: Int) {
        val item = getItem(position)
        val formatter = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.ENGLISH)
        val date = formatter.format(item.millis)
        holder.textItem.text = date
    }

}

class DatetimeViewHolder(val textItem: TextView): RecyclerView.ViewHolder(textItem)

class DatetimeDiffCallback : DiffUtil.ItemCallback<Datetime>() {
    override fun areItemsTheSame(oldItem: Datetime, newItem: Datetime): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Datetime, newItem: Datetime): Boolean {
        return oldItem == newItem
    }
}