package com.jay.navdrawerwithoutbasicfragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.jay.navdrawerwithoutbasicfragments.levelsfragments.LevelFiveFragment
import com.jay.navdrawerwithoutbasicfragments.levelsfragments.LevelFourFragment
import com.jay.navdrawerwithoutbasicfragments.levelsfragments.LevelOneFragment
import com.jay.navdrawerwithoutbasicfragments.levelsfragments.LevelThreeFragment
import com.jay.navdrawerwithoutbasicfragments.levelsfragments.LevelTwoFragment

class LevelAdapter(private val level: ArrayList<Semester>)  : RecyclerView.Adapter<LevelAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // Inflate the layout for each item and return a new ViewHolder object
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.semester_list, parent, false)
        return MyViewHolder(itemView)
    }

    // This method returns the total
    // number of items in the data set
    override fun getItemCount(): Int {
        return level.size
    }

    // This method binds the data to the ViewHolder object
    // for each item in the RecyclerView
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentCourse = level[position]
        holder.semester.text = currentCourse.whatSemester
        //Next, implementing what happens when the recyclerview is clicked
        holder.itemView.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {
                val activity = v!!.context as AppCompatActivity
                if (position == 0) {
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, LevelOneFragment())
                        .addToBackStack(null).commit()
                }
                if (position == 1) {
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, LevelTwoFragment())
                        .addToBackStack(null).commit()
                }
                if (position == 2) {
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, LevelThreeFragment())
                        .addToBackStack(null).commit()
                }
                if (position == 3) {
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, LevelFourFragment())
                        .addToBackStack(null).commit()
                }
                if (position == 4) {
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, LevelFiveFragment())
                        .addToBackStack(null).commit()
                }
            }
        })
    }

    // This class defines the ViewHolder object for each item in the RecyclerView
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val semester : TextView = itemView.findViewById(R.id.semesterSelect)
    }
}