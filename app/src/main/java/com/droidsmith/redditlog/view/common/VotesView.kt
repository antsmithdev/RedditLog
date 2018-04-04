package com.droidsmith.redditlog.view.common

import android.content.Context
import android.util.AttributeSet
import android.widget.TextView


class VotesView : TextView{

    constructor(context: Context) : this(context, null)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs, 0)

    fun updateVotes(votes: String) {
        text = votes
    }

}