package com.jay.navdrawerwithoutbasicfragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class CourseAdapter200II (private val courseList: ArrayList<Semester>)  :
    RecyclerView.Adapter<CourseAdapter200II.MyViewHolder>()   {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.semester_list, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentCourse = courseList[position]
        holder.semester.text = currentCourse.whatSemester
        //Next, implementing what happens when the recyclerview is clicked
        holder.itemView.setOnClickListener { v ->
            val activity = v!!.context as AppCompatActivity

            if (position == 0) {
                activity.supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, Contract2Fragment())
                    .addToBackStack(null).commit()
            }
/*            if (position == 1) {
                activity.supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, Cons1Fragment())
                    .addToBackStack(null).commit()
            }*/
            if (position == 1) {
                activity.supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, Tort2Fragment())
                    .addToBackStack(null).commit()
            }
            if (position == 2) {
                activity.supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, LegalSystem2Fragment())
                    .addToBackStack(null).commit()
            }
/*            if (position == 4) {
                activity.supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, Psycho1Fragment())
                    .addToBackStack(null).commit()
            }*/
        }
    }

    override fun getItemCount(): Int {
        return courseList.size
    }
    // This class defines the ViewHolder object for each item in the RecyclerView
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val semester: TextView = itemView.findViewById(R.id.semesterSelect)
    }
}