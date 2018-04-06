package com.droidsmith.redditlog.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.droidsmith.redditlog.R
import com.droidsmith.redditlog.utility.voteFormat
import com.droidsmith.redditlog.view.*
import kotlinx.android.synthetic.main.activity_main.*
import com.github.jreddit.entity.Submission
import com.github.jreddit.retrieval.params.SubmissionSort
import com.github.jreddit.retrieval.Submissions
import com.github.jreddit.entity.User
import com.github.jreddit.utils.restclient.PoliteHttpRestClient
import com.github.jreddit.utils.restclient.RestClient
import java.util.concurrent.Callable
import java.util.concurrent.ExecutionException
import java.util.concurrent.ExecutorCompletionService
import java.util.concurrent.Executors


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




    }
}
