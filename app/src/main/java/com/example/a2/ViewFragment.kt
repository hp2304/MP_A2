package com.example.a2

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView


class ViewFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_view, container, false)
        var spinner =view.findViewById<Spinner>(R.id.spinner)
        var recipe_description = view.findViewById<TextView>(R.id.recipeDesc)
        val receipeArray = AddFragment.recipeData
        var recipeName = arrayOf<String>()

        for(recipe in receipeArray){
            recipeName+=recipe.name

        }
        context?.let {
            val adapter = ArrayAdapter(it, android.R.layout.simple_list_item_1, recipeName)
            spinner.adapter = adapter
            spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                    recipe_description.text = receipeArray[p2].description
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }

            }
        }


        return view
    }


}