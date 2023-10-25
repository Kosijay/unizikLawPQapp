package com.jay.navdrawerwithoutbasicfragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.jay.navdrawerwithoutbasicfragments.secondyearfirstsem.Cons1Fragment
import com.jay.navdrawerwithoutbasicfragments.secondyearfirstsem.Contract1Fragment
import com.jay.navdrawerwithoutbasicfragments.secondyearfirstsem.LegalSystem1Fragment
import com.jay.navdrawerwithoutbasicfragments.secondyearfirstsem.Psycho1Fragment
import com.jay.navdrawerwithoutbasicfragments.secondyearfirstsem.Tort1Fragment

class CourseAdapter200I(private val courseList: ArrayList<Semester>)  :
    RecyclerView.Adapter<CourseAdapter200I.MyViewHolder>()  {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.semester_list, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return courseList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentCourse = courseList[position]
        holder.semester.text = currentCourse.whatSemester
        //Next, implementing what happens when the recyclerview is clicked
        holder.itemView.setOnClickListener { v ->
            val activity = v!!.context as AppCompatActivity

            if (position == 0) {
                activity.supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, Contract1Fragment())
                    .addToBackStack(null).commit()
            }
            if (position == 1) {
                activity.supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, Cons1Fragment())
                    .addToBackStack(null).commit()
            }
            if (position == 2) {
                activity.supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, Tort1Fragment())
                    .addToBackStack(null).commit()
            }
            if (position == 3) {
                activity.supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, LegalSystem1Fragment())
                    .addToBackStack(null).commit()
            }
            if (position == 4) {
                activity.supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, Psycho1Fragment())
                    .addToBackStack(null).commit()
            }
        }
    }
    // This class defines the ViewHolder object for each item in the RecyclerView
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val semester: TextView = itemView.findViewById(R.id.semesterSelect)
    }
}