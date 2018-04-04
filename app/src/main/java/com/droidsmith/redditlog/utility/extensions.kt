package com.droidsmith.redditlog.utility


/*returns a string representing the number of upvotes on a post
* example: 1200 -> 1.2K, 20999 -> 20.9K, 6000000 -> 6M*/
fun Float.voteFormat(): String{
    return when{
        (this < 1000f) -> this.toString()
        (this < 1000000f) -> "%.1f".format(this / 1000f) + "K"
        else -> "%.1f".format(this / 1000000f) + "M"
    }
}