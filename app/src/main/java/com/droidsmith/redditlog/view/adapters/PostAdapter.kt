package com.droidsmith.redditlog.view.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.droidsmith.redditlog.R
import com.droidsmith.redditlog.utility.inflate
import kotlinx.android.synthetic.main.post_row.view.*


class PostAdapter : RecyclerView.Adapter<PostAdapter.ViewHolder> (){


    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
            = ViewHolder(parent.inflate(R.layout.post_row))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        val votes_txt = itemView.votes
        val author_txt = itemView.author
        val subreddit_txt = itemView.subreddit
        val postImage_img = itemView.postImage
        val postTitle_txt = itemView.postTitle
        val comments_btn = itemView.comments
        val saveToLog_btn = itemView.saveToLog
        val downvote_btn = itemView.downvote
        val upvote_btn = itemView.upvote


        init {
            comments_btn.setOnClickListener{v -> openComments()}
            saveToLog_btn.setOnClickListener{v -> saveToLog()}
            downvote_btn.setOnClickListener{v -> decreaseVote()}
            upvote_btn.setOnClickListener{v -> increaseVote()}
        }

        private fun increaseVote() {

        }

        private fun decreaseVote() {

        }

        private fun saveToLog() {

        }

        private fun openComments(){

        }

    }
    
}