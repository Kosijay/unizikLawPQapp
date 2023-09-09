package com.jay.navdrawerwithoutbasicfragments

object FirstOrSecond {
    // Arraylist and return the Arraylist
    fun getSemesterData():ArrayList<Semester>{
        // create an arraylist of type employee class
        val semesterList=ArrayList<Semester>()
        val sem1=Semester("First Semester")
        semesterList.add(sem1)
        val sem2=Semester("Second Semester")
        semesterList.add(sem2)
        return  semesterList
    }
}