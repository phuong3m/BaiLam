package com.example.kiemtra

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TableRow
import android.widget.TextView
import java.text.FieldPosition
import kotlin.contracts.Returns

class Adapter(var context : Context , var mangmonan : ArrayList<MonAn>) : BaseAdapter() {
    class ViewHolder(row: View){
        var tenmonan : TextView
        var image : ImageView
        init {
            tenmonan = row.findViewById(R.id.tenmonan) as TextView
            image = row.findViewById(R.id.image) as ImageView
        }
    }
    override fun getCount(): Int {
        return mangmonan.size
    }

    override fun getItem(position: Int): Any {
        return mangmonan.get(position)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(position: Int, converview: View?, p2: ViewGroup?): View {
        var view: View?
        var viewholder : ViewHolder
        if(converview == null){
            var layoutInflater: LayoutInflater = LayoutInflater.from(context)
            view = layoutInflater.inflate(R.layout.dong_monan,null)
            viewholder = ViewHolder(view)
            view.tag = viewholder
        }
        else{
            view = converview
            viewholder = converview.tag as ViewHolder
        }
        var monan : MonAn = getItem(position) as MonAn
        viewholder.tenmonan.text = monan.ten
        viewholder.image.setImageResource(monan.hinhanh)
        return view as View
    }
}
