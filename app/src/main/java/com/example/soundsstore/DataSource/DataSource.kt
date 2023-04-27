package com.example.soundsstore.DataSource

import com.example.soundsstore.DataModel.DataUse
import com.example.soundsstore.R

class DataSource {
    fun loadFunction():List<DataUse>{
        return listOf<DataUse>(
            DataUse(R.drawable.airpods2nd,R.string.Title1,R.string.Price1),
            DataUse(R.drawable.airpods3rd,R.string.Title2,R.string.Price2),
            DataUse(R.drawable.airpodspro,R.string.Title3,R.string.Price3),
            DataUse(R.drawable.airpodsmax,R.string.Title4,R.string.Price4),
            DataUse(R.drawable.oneplusbudspro2,R.string.Title5,R.string.Price5),
            DataUse(R.drawable.oneplusbudspro2r,R.string.Title6,R.string.Price6)
        )
    }
}