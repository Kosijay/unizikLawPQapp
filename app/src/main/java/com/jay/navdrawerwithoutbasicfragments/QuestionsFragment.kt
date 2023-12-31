package com.jay.navdrawerwithoutbasicfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
private const val ARG_PARAM3 = "param3"
private const val ARG_PARAM4 = "param4"


class QuestionsFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null
    private var param3: String? = null
    private var param4: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activity?.title = "Questions"

        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
            param3 = it.getString(ARG_PARAM3)
            param4 = it.getString(ARG_PARAM4)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_questions, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.title = "Questions"
        val title = view.findViewById<TextView>(R.id.CourseTitle)
        val session = view.findViewById<TextView>(R.id.YearOrSession)
        val semester = view.findViewById<TextView>(R.id.firstOrSecondSemester)
        val questions = view.findViewById<TextView>(R.id.Questions)
        title.text= param1
        session.text = param2
        semester.text = param3
        questions.text = param4


        /*        fun outOfPatience(questionsList: ArrayList<QuestionsFormat>, position: Int) {
                    val currentData = questionsList[position]
                    val title = view.findViewById<TextView>(R.id.CourseTitle)
                    val session = view.findViewById<TextView>(R.id.YearOrSession)
                    val semester = view.findViewById<TextView>(R.id.firstOrSecondSemester)
                    val questions = view.findViewById<TextView>(R.id.Questions)
                    title.text = currentData.courseTitle
                    session.text = currentData.session
                    semester.text = currentData.semester
                    questions.text = currentData.questions
                }

                outOfPatience(FirstOrSecond.getQuestions(), 0)*/
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ContactFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
            fun newInstance(param1: String, param2: String, param3: String, param4: String) =
            QuestionsFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                    putString(ARG_PARAM3, param3)
                    putString(ARG_PARAM4, param4)
                }
            }
    }

}