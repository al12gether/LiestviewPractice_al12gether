package com.example.liestviewpractice_al12gether

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.liestviewpractice_al12gether.adapters.StudentAdapter
import com.example.liestviewpractice_al12gether.datas.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<Student>()

    lateinit var mAdapter : StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add( Student("이윤민", birthYear = 1966) )
        mStudentList.add( Student("김민상", birthYear = 1995) )
        mStudentList.add( Student("조상민", birthYear = 1975) )
        mStudentList.add( Student("이영희", birthYear = 1995) )
        mStudentList.add( Student("박철수", birthYear = 2000) )
        mStudentList.add( Student("정민규", birthYear = 1984) )
        mStudentList.add( Student("장소영", birthYear = 1962) )


        mAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList)

        studentListView.adapter = mAdapter


        studentListView.setOnItemClickListener { parent, view, position, id ->

            val clickedStudent = mStudentList[position]

            Toast.makeText(this, "${clickedStudent.name} 이 클릭 됨", Toast.LENGTH_SHORT).show()

        }


        studentListView.setOnItemLongClickListener { parent, view, position, id ->

            val longClickedStudent = mStudentList[position]

            Toast.makeText(this, "${longClickedStudent.name} 길게 클릭됨", Toast.LENGTH_SHORT).show()

            return@setOnItemLongClickListener true

        }


    }
}