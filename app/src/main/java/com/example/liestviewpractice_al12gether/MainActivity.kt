package com.example.liestviewpractice_al12gether

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.liestviewpractice_al12gether.datas.Student

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<>()

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

    }
}