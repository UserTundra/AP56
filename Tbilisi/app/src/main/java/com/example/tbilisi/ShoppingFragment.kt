package com.example.tbilisi

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView

class ShoppingFragment : Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_shopping, container, false)
        var listView = view.findViewById<ListView>(R.id.shoppinglistView) as ListView
        var arrShopping: ArrayList<Shopping> = ArrayList()

        arrShopping.add(Shopping("Chacha Corner, 11 Giga Lortkifanidze St., цель - покупки, магазины сувениров и деликатесов, № 1 из 82",  R.drawable.chachacorner))
        arrShopping.add(Shopping("Блошиный рынок \"Сухой мост\"\n, Flea Market Dry Bridge, Kvishketi Str 1a Tbilisi St., цель - покупки, блошиные и уличные рынки, № 32 из 188",  R.drawable.bloshrynok))
        arrShopping.add(Shopping("Yuliko & Friends Concept Store, Zeinab Botsvadze St., 5, цель - покупки, аутлеты, \$\$\$\$, № 39 из 188",  R.drawable.yuliko))

        listView.adapter = ShoppingAdapter(this.context as Context, arrShopping)

        return view

    }
}