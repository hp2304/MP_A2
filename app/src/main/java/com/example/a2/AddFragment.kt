package com.example.a2

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AddFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AddFragment : Fragment() {
    companion object{
        val recipeData = ArrayList<recipe>()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_add, container, false)
        val recipeName = view.findViewById<EditText>(R.id.editRecipeName)
        val recipeDesc = view.findViewById<EditText>(R.id.editRecipeDesc)
        val add_btn = view.findViewById<Button>(R.id.add_btn)
        add_btn.setOnClickListener{
            if (recipeName.text.toString().isNotEmpty() && recipeDesc.text.toString().isNotEmpty()){

                recipeData.add(recipe(recipeData.size.toString(),recipeName.text.toString(),recipeDesc.text.toString()))
                recipeName.text.clear()
                recipeDesc.text.clear()

            }
        }
        return view
    }


}