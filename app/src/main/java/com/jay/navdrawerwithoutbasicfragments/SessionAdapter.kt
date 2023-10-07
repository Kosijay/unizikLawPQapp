package com.jay.navdrawerwithoutbasicfragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class SessionAdapter(questionsList: ArrayList<QuestionsFormat>, clickListener: ItemsInterClickListener):
    RecyclerView.Adapter<SessionAdapter.MyViewHolder>() {
    private val questionsList : ArrayList<QuestionsFormat>
    private val clickListener : ItemsInterClickListener


    init {
        this.questionsList = questionsList
        this.clickListener = clickListener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // Inflate the layout for each item and return a new ViewHolder object
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.semester_list, parent, false)
        return MyViewHolder(itemView)
    }

    // This method returns the total
    // number of items in the data set
    override fun getItemCount(): Int {
        return questionsList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentSession = questionsList[position]
        holder.session.text = currentSession.session
        holder.itemView.setOnClickListener{clickListener.onItemClick(questionsList[position])}
//        holder.itemView.setOnClickListener {clickListener.onItemClick(questionsList[position])
                /*v ->
            val activity = v!!.context as AppCompatActivity
            activity.supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, QuestionsFragment())
                .addToBackStack(null).commit()*/
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val session: TextView = itemView.findViewById(R.id.semesterSelect)
    }

//      interface ItemsInterClickListener{
//          fun onItemClick(questionsFormat: QuestionsFormat)
//      }

}