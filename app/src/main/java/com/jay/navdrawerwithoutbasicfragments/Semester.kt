package com.jay.navdrawerwithoutbasicfragments

data class Semester (
    val whatSemester : String
        ):java.io.Serializable

data class QuestionsFormat (
    val courseTitle : String,
    val session : String,
    val semester : String,
    val questions : String
        ):java.io.Serializable