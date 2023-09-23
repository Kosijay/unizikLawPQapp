package com.jay.navdrawerwithoutbasicfragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView


class SessionAdapter(private val sessionList: ArrayList<Semester>):
    RecyclerView.Adapter<SessionAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // Inflate the layout for each item and return a new ViewHolder object
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.semester_list, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentSession = sessionList[position]
        holder.session.text = currentSession.whatSemester
        holder.itemView.setOnClickListener(object :View.OnClickListener{
            override fun onClick(v: View?) {
                val activity = v!!.context as AppCompatActivity
                    activity.supportFragmentManager.beginTransaction()
                        .replace(R.id.fragment_container, QuestionsFragment())
                        .addToBackStack(null).commit()
            }
        })
    }


    // This method returns the total
    // number of items in the data set
    override fun getItemCount(): Int {
        return sessionList.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val session: TextView = itemView.findViewById(R.id.semesterSelect)
    }
}