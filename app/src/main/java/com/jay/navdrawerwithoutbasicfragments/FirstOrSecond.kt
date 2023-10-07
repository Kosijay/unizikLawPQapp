package com.jay.navdrawerwithoutbasicfragments

object FirstOrSecond {
    // Arraylist and return the Arraylist
    fun getLevels():ArrayList<Semester>{
        val level = ArrayList<Semester>()
        val level1 = Semester("100 Level")
        level.add(level1)
        val level2 = Semester("200 Level")
        level.add(level2)
        val level3 = Semester("300 Level")
        level.add(level3)
        val level4 = Semester("400 Level")
        level.add(level4)
        val level5 = Semester("500 Level")
        level.add(level5)
        return level
    }
    fun getSemesterData():ArrayList<Semester>{
        // create an arraylist of type Semester class for what Semester
        val semesterList=ArrayList<Semester>()
        val sem1=Semester("First Semester")
        semesterList.add(sem1)
        val sem2=Semester("Second Semester")
        semesterList.add(sem2)
        return  semesterList
    }
/*    fun getSessionData():ArrayList<Semester>{
        val sessionList = ArrayList<Semester>()
        val sess1 = Semester("2013/2014")
        sessionList.add(sess1)
        val sess2 = Semester("2014/2015")
        sessionList.add(sess2)
        val sess3 = Semester("2015/2016")
        sessionList.add(sess3)
        val sess4 = Semester("2016/2017")
        sessionList.add(sess4)
        val sess5 = Semester("2017/2018")
        sessionList.add(sess5)
        val sess6 = Semester("2018/2019")
        sessionList.add(sess6)
        val sess7 = Semester("2019/2020")
        sessionList.add(sess7)
        val sess8 = Semester("2020/2021")
        sessionList.add(sess8)
        val sess9 = Semester("2021/2022")
        sessionList.add(sess9)
        val sess10 = Semester("2022/2023")
        sessionList.add(sess10)
        return sessionList
    }*/
    fun getCourseData100I():ArrayList<Semester>{
        // create an arraylist of type Semester class for what course
        val courseList=ArrayList<Semester>()
        val course1=Semester("Nigerian Legal Methods I")
        courseList.add(course1)
        val sem2=Semester("Logic and Philosophical Thought I")
        courseList.add(sem2)
        val course3=Semester("Literature I")
        courseList.add(course3)
        val course4=Semester("Mass Communication I")
        courseList.add(course4)
        val course5=Semester("Economics I")
        courseList.add(course5)
        val course6=Semester("Computer Programming I")
        courseList.add(course6)
        return  courseList
    }
    fun getCourseData100II():ArrayList<Semester>{
        // create an arraylist of type Semester class for what course
        val courseList=ArrayList<Semester>()
        val course1=Semester("Nigerian Legal Methods II")
        courseList.add(course1)
        val sem2=Semester("Logic and Philosophical Thought II")
        courseList.add(sem2)
        val course3=Semester("Literature II")
        courseList.add(course3)
        val course4=Semester("Mass Communication II")
        courseList.add(course4)
        val course5=Semester("Economics II")
        courseList.add(course5)
        val course6=Semester("Computer Programming II")
        courseList.add(course6)
        return  courseList
    }
    fun getCourseData200I():ArrayList<Semester>{
        // create an arraylist of type Semester class for what course
        val courseList=ArrayList<Semester>()
        val course1=Semester("Law of Contract I")
        courseList.add(course1)
        val sem2=Semester("Constitutional Law I")
        courseList.add(sem2)
        val course3=Semester("Law of Torts I")
        courseList.add(course3)
        val course4=Semester("Nigerian Legal System I")
        courseList.add(course4)
        val course5=Semester("Psychology I")
        courseList.add(course5)
        val course6=Semester("Introduction to Sociology I")
        courseList.add(course6)
        return  courseList
    }
    fun getCourseData200II():ArrayList<Semester>{
        // create an arraylist of type Semester class for what course
        val courseList=ArrayList<Semester>()
        val course1=Semester("Law of Contract II")
        courseList.add(course1)
        val sem2=Semester("Constitutional Law II")
        courseList.add(sem2)
        val course3=Semester("Law of Torts II")
        courseList.add(course3)
        val course4=Semester("Nigerian Legal System II")
        courseList.add(course4)
        val course5=Semester("Psychology II")
        courseList.add(course5)
        val course6=Semester("Introduction to Sociology II")
        courseList.add(course6)
        return  courseList
    }
    fun getCourseData300I():ArrayList<Semester>{
        // create an arraylist of type Semester class for what course
        val courseList=ArrayList<Semester>()
        val course1=Semester("Criminal Law I")
        courseList.add(course1)
        val sem2=Semester("Commercial Law I")
        courseList.add(sem2)
        val course4=Semester("Industrial/Labour Law I")
        courseList.add(course4)
        val course5=Semester("Law of Banking and Insurance I")
        courseList.add(course5)
        val course6=Semester("Law of Intellectual Property I")
        courseList.add(course6)
        return  courseList
    }
    fun getCourseData300II():ArrayList<Semester>{
        // create an arraylist of type Semester class for what course
        val courseList=ArrayList<Semester>()
        val course1=Semester("Criminal Law II")
        courseList.add(course1)
        val sem2=Semester("Commercial Law II")
        courseList.add(sem2)
        val course4=Semester("Industrial/Labour Law II")
        courseList.add(course4)
        val course5=Semester("Law of Banking and Insurance II")
        courseList.add(course5)
        val course6=Semester("Law of Intellectual Property II")
        courseList.add(course6)
        return  courseList
    }   fun getCourseData400I():ArrayList<Semester>{
        // create an arraylist of type Semester class for what course
        val courseList=ArrayList<Semester>()
        val course1=Semester("Introduction to Political Science I")
        courseList.add(course1)
        val sem2=Semester("Property/Land Law I")
        courseList.add(sem2)
        val course3=Semester("Equity & Trusts I")
        courseList.add(course3)
        val course4=Semester("Law of Evidence I")
        courseList.add(course4)
        val course5=Semester("Women & Minority Rights I")
        courseList.add(course5)
        val course6=Semester("Law of Energy & Natural Resources I")
        courseList.add(course6)
        val course7=Semester("Administrative Law I")
        courseList.add(course7)
        val course8=Semester("Law of Arbitration I")
        courseList.add(course8)
        val course9=Semester("Maritime Law I")
        courseList.add(course9)

        return  courseList
    }   fun getCourseData400II():ArrayList<Semester>{
        // create an arraylist of type Semester class for what course
        val courseList=ArrayList<Semester>()
        val course1=Semester("Introduction to Political Science II")
        courseList.add(course1)
        val sem2=Semester("Property/Land Law II")
        courseList.add(sem2)
        val course3=Semester("Equity & Trusts II")
        courseList.add(course3)
        val course4=Semester("Law of Evidence II")
        courseList.add(course4)
        val course5=Semester("Women & Minority Rights II")
        courseList.add(course5)
        val course6=Semester("Law of Energy & Natural Resources II")
        courseList.add(course6)
        val course7=Semester("Administrative Law II")
        courseList.add(course7)
        val course8=Semester("Law of Arbitration II")
        courseList.add(course8)
        val course9=Semester("Maritime Law II")
        courseList.add(course9)
        return  courseList
    }
    fun getCourseData500I():ArrayList<Semester>{
        // create an arraylist of type Semester class for what course
        val courseList=ArrayList<Semester>()
        val course1=Semester("Jurisprudence & Legal Theory I")
        courseList.add(course1)
        val sem2=Semester("Company Law I")
        courseList.add(sem2)
        val course3=Semester("Clinical Legal Education I")
        courseList.add(course3)
        val course4=Semester("Environmental & Planning Law I")
        courseList.add(course4)
        val course5=Semester("Conveyancing Law I")
        courseList.add(course5)
        val course6=Semester("Public International Law I")
        courseList.add(course6)
        val course7=Semester("Introduction to Advocacy I")
        courseList.add(course7)
        val course8=Semester("Family Law I")
        courseList.add(course8)
        val course9=Semester("Law of Taxation I")
        courseList.add(course9)
        return  courseList
    }
    fun getCourseData500II():ArrayList<Semester> {
        // create an arraylist of type Semester class for what course
        val courseList = ArrayList<Semester>()
        val course1 = Semester("Jurisprudence & Legal Theory I")
        courseList.add(course1)
        val sem2 = Semester("Company Law I")
        courseList.add(sem2)
        val course3 = Semester("Clinical Legal Education I")
        courseList.add(course3)
        val course4 = Semester("Environmental & Planning Law I")
        courseList.add(course4)
        val course5 = Semester("Conveyancing Law I")
        courseList.add(course5)
        val course6 = Semester("Public International Law I")
        courseList.add(course6)
        val course7 = Semester("Introduction to Advocacy I")
        courseList.add(course7)
        val course8 = Semester("Family Law I")
        courseList.add(course8)
        val course9 = Semester("Law of Taxation I")
        courseList.add(course9)
        return courseList
    }

    fun getQuestions200I():ArrayList<QuestionsFormat>{
        val questionsList = ArrayList<QuestionsFormat>()
        val ques1 = QuestionsFormat("Psychology", "2021/2022", "First Semester", "1. \n" +
                "Briefly define Forensic Psychology, \n" +
                "b. \n" +
                "What are the duties of a Forensic Psychologist, as it relates to Psychology and Law?\n" +
                "c. \n" +
                "Differentiate between a psychologist and psychiatrist\n" +
                "2. \n" +
                "Psychology as the study of I unconscious processes; following this view, mention and discuss the technique which was adopted by Sigmund Freud to treat patients with medically unexplainable symptoms.\n" +
                "b. \n" +
                "Define personality and explain its structures as were propounded by Freud.\n" +
                "3 \n" +
                "People who do not consider their actions whether injurious to self or others can be said to be guided by the id' principles. Use the cases of yahoo boys (internet\n" +
                "fraudsters) to further justify this claim.\n" +
                "b. \n" +
                "Briefly explain drive reduction theory?\n" +
                "4 \n" +
                "In expression of emotions in man and animals, Charles Darwin argued that all people express certain basic feelings in the same ways. Enumerate and briefly comment on the basic feelings as it affects people of all races.\n" +
                "b\n" +
                "With aid of a good diagram, describe Maslow's hierarchy of Needs as a Social Motive Theory\n" +
                "5\n" +
                "What part of the brain if punctured will result in the animal eating excessively or starvation?\n" +
                "b \n" +
                "Write a short note on the following: (a) Anorexia Nervosa, (b) Bulimia (c) Homeostasis\n" +
                "\n" +
                "\n")
        questionsList.add(ques1)
        return questionsList
    }
    fun getQuestions300I():ArrayList<QuestionsFormat> {
        val questionsList = ArrayList<QuestionsFormat>()
        val ques1 = QuestionsFormat("Labour Law", "2022/2023", "First Semester", "SECTION A\n" +
                "No 1\n" +
                "a.The Labour Act of Nigeria makes provisions regulating the practice of apprenticeship in Nigeria. These provisions are defcient on several observable grounds. Discuss them highlighting the positions in Ghana and South Africa.\n" +
                "b.Discuss briefly the prerogative remedies.\n" +
                "No. 2\n" +
                "a. Discuss the ratio decidendi in Chukwumah v Shell (1993) 4 N.W.L.R ( Pt289)12\n" +
                "b. Discuss briefly remedies of injunction and recission\n" +
                "c. List the International Standards on contracts of apprenticeship.\n" +
                "\n" +
                "SECTION B\n" +
                "1. It is a known fact that once parties to a contract of employment expressly agree on any particular terms and conditions, they are bound by them and are so bound until they mutually agree to vary them. It also a fact that once fully entered into, the contract of employment is enforceable and ought to be treated with sanctity as to what the parties intended and that if any question arises in that respect, it is the contract document itself that must be interpreted to decide the question.\n" +
                "a.With the aid of statutory authorities and case law (if any) discuss the veracity of the facts stated above.\n" +
                "b. It is also a fact that there are terms which the parties may not have agreed upon but which still form part of the terms expressed in a contract of employiment. List and explain (3) three of such other terms that you know.\n" +
                "2. The duty of an employer not to provide work is not devoid of any exceptions and thus depends on the nature of the employment and so could amount to a breach of the contract of employment. With the aid of case law, critically discuss the above and any (3) three other duties of the employer under common law.\n" +
                "SECTION C\n" +
                "1. A contract of employment, like all other contracts, is governed by the general law of contract. Therefore, all the essential features which characterize ordinary contracts must be present in a contract of employment before it can be said to be a valid contract of service. With the use of case Law and statutory provisions, discuss the basic element of the formation of a contract of Employment.\n" +
                "2. The premise for the determination of the nature of a contract of employment could be determined by establishing the particular type of employment contract entered into by the parties. It is essential to argue that the protection offered by the Labour Act is only for those under a contract of service commonly referred to as “employees” and not those under a contract for services often described as “independent contractors or self-employed persons.” Over the years several tests have been propounded by jurists and legal scholars for the purpose of determining the nature of contract of employment entered into by the parties. With the aid of decided cases elucidate on these tests.")
        questionsList.add(ques1)
        val ques2 = QuestionsFormat("Labour Law", "2023/2024", "First Semester", "Demo Law Quesstions" +
        "Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law " +
                "Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law "+
        "Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law ")
        questionsList.add(ques2)
        val ques3 = QuestionsFormat("Labour Law", "2024/2025", "First Semester", "Demo Law Quesstions" +
                "Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law " +
                "Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law "+
                "Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law Labour Law ")
        questionsList.add(ques3)
        return questionsList
    }



    }