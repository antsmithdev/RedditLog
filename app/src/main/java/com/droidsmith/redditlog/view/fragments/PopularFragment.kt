package com.droidsmith.redditlog.view.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.droidsmith.redditlog.R


class PopularFragment : BaseFragment(){
    companion object {
        fun newInstance(): PopularFragment{
            return PopularFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val rootView: ViewGroup = inflater
                .inflate(R.layout.popular_fragment, container, false) as ViewGroup

        return rootView
    }



    override fun onAttach(context: Context?) {
        super.onAttach(context)
    }
}