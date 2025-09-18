package com.example.createmood
import com.example.createmood.R
import com.example.createmood.Feel


class FeelRepository{
    val list = arrayListOf(
        Feel(1, R.drawable.calm_img,  "Спокойным"),
        Feel(2, R.drawable.relax_img, "Расслабленным"),
        Feel(3, R.drawable.focus_img ,  "Сосредоточенным"),
        Feel(4, R.drawable.anxious_img ,  "Взволнованным")
    )
}