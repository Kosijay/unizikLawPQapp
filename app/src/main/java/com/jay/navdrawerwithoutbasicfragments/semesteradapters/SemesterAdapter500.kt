package com.jay.navdrawerwithoutbasicfragments.semesteradapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.jay.navdrawerwithoutbasicfragments.R
import com.jay.navdrawerwithoutbasicfragments.Semester
import com.jay.navdrawerwithoutbasicfragments.coursefragments.CourseFragment500First
import com.jay.navdrawerwithoutbasicfragments.coursefragments.CourseFragment500Second

class SemesterAdapter500(private val semList: ArrayList<Semester>)  : RecyclerView.Adapter<SemesterAdapter500.MyViewHolder>()  {
    // This method creates a new ViewHolder object for each item in the RecyclerView
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        // Inflate the layout for each item and return a new ViewHolder object
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.semester_list, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentSem = semList[position]
        holder.semester.text = currentSem.whatSemester
        holder.itemView.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val activity = v!!.context as AppCompatActivity
                if (position == 0) {
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, CourseFragment500First())
                        .addToBackStack(null).commit()
                }
                if (position == 1) {
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, CourseFragment500Second())
                        .addToBackStack(null).commit()
                }
            }
        })    }

    // This method returns the total
    // number of items in the data set
    override fun getItemCount(): Int {
        return semList.size
    }

    // This class defines the ViewHolder object for each item in the RecyclerView
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val semester: TextView = itemView.findViewById(R.id.semesterSelect)

    }
}