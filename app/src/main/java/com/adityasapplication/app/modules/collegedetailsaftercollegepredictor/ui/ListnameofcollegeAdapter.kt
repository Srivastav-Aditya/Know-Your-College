package com.adityasapplication.app.modules.collegedetailsaftercollegepredictor.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.adityasapplication.app.R
import com.adityasapplication.app.databinding.RowListnameofcollegeBinding
import com.adityasapplication.app.modules.collegedetailsaftercollegepredictor.`data`.model.ListnameofcollegeRowModel
import kotlin.Int
import kotlin.collections.List

class ListnameofcollegeAdapter(
  var list: List<ListnameofcollegeRowModel>
) : RecyclerView.Adapter<ListnameofcollegeAdapter.RowListnameofcollegeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListnameofcollegeVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listnameofcollege,parent,false)
    return RowListnameofcollegeVH(view)
  }

  override fun onBindViewHolder(holder: RowListnameofcollegeVH, position: Int) {
    val listnameofcollegeRowModel = ListnameofcollegeRowModel()
    // TODO uncomment following line after integration with data source
    // val listnameofcollegeRowModel = list[position]
    holder.binding.listnameofcollegeRowModel = listnameofcollegeRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListnameofcollegeRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ListnameofcollegeRowModel
    ) {
    }
  }

  inner class RowListnameofcollegeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListnameofcollegeBinding = RowListnameofcollegeBinding.bind(itemView)
  }
}
