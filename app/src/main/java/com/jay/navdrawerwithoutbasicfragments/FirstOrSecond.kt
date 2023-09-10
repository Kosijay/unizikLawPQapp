package com.jay.navdrawerwithoutbasicfragments

object FirstOrSecond {
    // Arraylist and return the Arraylist
    fun getSemesterData():ArrayList<Semester>{
        // create an arraylist of type Semester class for what Semester
        val semesterList=ArrayList<Semester>()
        val sem1=Semester("First Semester")
        semesterList.add(sem1)
        val sem2=Semester("Second Semester")
        semesterList.add(sem2)
        return  semesterList
    }
    fun getCourseData1():ArrayList<Semester>{
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
    fun getCourseData2():ArrayList<Semester>{
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
}