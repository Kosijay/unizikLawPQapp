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
    fun getSessionData():ArrayList<Semester>{
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
    }
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
        val course3=Semester("Principles of Accounting I")
        courseList.add(course3)
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
        val course3=Semester("Principles of Accounting II")
        courseList.add(course3)
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
    }   fun getCourseData500II():ArrayList<Semester> {
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

}