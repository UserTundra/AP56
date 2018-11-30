package com.example.tbilisi

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView

class ChurchFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_church, container, false)
        var listView = view.findViewById<ListView>(R.id.churchlistView) as ListView
        var arrChurch: ArrayList<Church> = ArrayList()

        arrChurch.add(
            Church(
                "წმინდა სამება, Цминда Самеба, главный кафедральный собор Грузинской православной церкви",
                R.drawable.cminda
            )
        )
        arrChurch.add(
            Church(
                "მეტეხის ღვთისმშობლის შობის ტაძარი, Храм Метехи, церковь во имя Успения Пресвятой Богородицы в Тбилиси, в подчинении Грузинской православной церкви",
                R.drawable.metekhi
            )
        )
        arrChurch.add(
            Church(
                "კუს ტბა, Черепашье озеро, южная часть района Ваке-Сабуртало на северном склоне горы Мтацминда",
                R.drawable.turtle
            )
        )
        arrChurch.add(
            Church(
                "ანჩისხატი, Анчисхати, церковь VI века, посвящённая празднику Рождества Богородицы. Самая старая церковь Тбилиси из сохранившихся",
                R.drawable.anchishati
            )
        )
        arrChurch.add(
            Church(
                "მეიდანი, Мейдан, одна из центральных площадей Старого города, расположена у реки Кура",
                R.drawable.meidan
            )
        )

        listView.adapter = ChurchAdapter(this.context as Context, arrChurch)

        return view

    }
}
