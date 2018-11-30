package com.example.tbilisi

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView

class FoodFragment  : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_food, container, false)
        var listView = view.findViewById<ListView>(R.id.foodlistView) as ListView
        var arrFood: ArrayList<Food> = ArrayList()

        arrFood.add(Food("Restaurant Meama, Dzmebi Zdanevichebi St. 8, кухня - грузинская, подходит для вегетарианцев, веганов, \$\$\$\$, № 9 из 974",  R.drawable.meama))
        arrFood.add(Food("Qalaqi, Kostava St., 45B, кухня - европейская, грузинская, подходит для вегетарианцев, \$\$\$\$, № 37 из 974",  R.drawable.qalaqi))
        arrFood.add(Food("Barbarestan, D. Aghmashenebeli Ave. 132, кухня - грузинская, подходит для вегетарианцев + винный бар, \$\$\$\$, № 47 из 974",  R.drawable.barbarestan))

        listView.adapter = FoodAdapter(this.context as Context, arrFood)

        return view

    }
}