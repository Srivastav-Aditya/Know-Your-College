package com.adityasapplication.app.modules.collegedetails.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.adityasapplication.app.R
import com.adityasapplication.app.databinding.RowListtitleofblogBinding
import com.adityasapplication.app.modules.collegedetails.`data`.model.ListtitleofblogRowModel
import kotlin.Int
import kotlin.collections.List

class ListtitleofblogAdapter(
  var list: List<ListtitleofblogRowModel>
) : RecyclerView.Adapter<ListtitleofblogAdapter.RowListtitleofblogVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListtitleofblogVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listtitleofblog,parent,false)
    return RowListtitleofblogVH(view)
  }

  override fun onBindViewHolder(holder: RowListtitleofblogVH, position: Int) {
    val listtitleofblogRowModel = ListtitleofblogRowModel()
    // TODO uncomment following line after integration with data source
    // val listtitleofblogRowModel = list[position]
    holder.binding.listtitleofblogRowModel = listtitleofblogRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListtitleofblogRowModel>) {
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
      item: ListtitleofblogRowModel
    ) {
    }
  }

  inner class RowListtitleofblogVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListtitleofblogBinding = RowListtitleofblogBinding.bind(itemView)
  }
}
