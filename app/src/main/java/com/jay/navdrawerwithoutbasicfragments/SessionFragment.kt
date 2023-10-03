package com.jay.navdrawerwithoutbasicfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SessionFragment : Fragment(), SessionAdapter.ItemsInterClickListener{
    private val questionsList: ArrayList<QuestionsFormat> = ArrayList<QuestionsFormat>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_session, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // getting the employeelist
        val questionsList = FirstOrSecond.getQuestions()
        // Assign employeelist to ItemAdapter
        val itemSessionAdapter= SessionAdapter(questionsList, this)
        // Set the LayoutManager that
        // this RecyclerView will use.
        val recyclerView: RecyclerView =view.findViewById(R.id.session)
        recyclerView.layoutManager = LinearLayoutManager(context)
        // adapter instance is set to the
        // recyclerview to inflate the items.
        recyclerView.adapter = itemSessionAdapter
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SessionFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }

    override fun onItemClick(questionsFormat: QuestionsFormat) {
        val fragment: Fragment = QuestionsFragment.newInstance(questionsFormat.courseTitle,questionsFormat.session, questionsFormat.semester,questionsFormat.session)
        val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container,fragment,"questions_fragment")
        transaction.addToBackStack(null)
        transaction.commit()
    }
}