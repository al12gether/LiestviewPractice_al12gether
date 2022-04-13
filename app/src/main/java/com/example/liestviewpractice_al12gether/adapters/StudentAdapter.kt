package com.example.liestviewpractice_al12gether.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.example.liestviewpractice_al12gether.datas.Student
import java.util.ArrayList
import kotlin.collections.ArrayList

class StudentAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mList) {
}