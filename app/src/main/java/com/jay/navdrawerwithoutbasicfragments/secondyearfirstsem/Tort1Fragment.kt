package com.jay.navdrawerwithoutbasicfragments.secondyearfirstsem

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jay.navdrawerwithoutbasicfragments.FirstOrSecond
import com.jay.navdrawerwithoutbasicfragments.ItemsInterClickListener
import com.jay.navdrawerwithoutbasicfragments.QuestionsFormat
import com.jay.navdrawerwithoutbasicfragments.QuestionsFragment
import com.jay.navdrawerwithoutbasicfragments.R
import com.jay.navdrawerwithoutbasicfragments.SessionAdapter

class Tort1Fragment : Fragment(),ItemsInterClickListener {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        activity?.title = "Select Year"
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tort1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // getting the employeelist
        val questionsList = FirstOrSecond.getQuestionsTortI()
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
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Tort1Fragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Tort1Fragment().apply {
                arguments = Bundle().apply {
                }
            }
    }

    override fun onItemClick(questionsFormat: QuestionsFormat) {
        val fragment: Fragment = QuestionsFragment.newInstance(
            questionsFormat.courseTitle,
            questionsFormat.session,
            questionsFormat.semester,
            questionsFormat.questions
        )
        val transaction: FragmentTransaction = requireActivity().supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container,fragment,"questions_fragment")
        transaction.addToBackStack(null)
        transaction.commit()
    }
}