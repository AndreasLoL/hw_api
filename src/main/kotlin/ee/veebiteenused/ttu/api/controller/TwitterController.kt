package ee.veebiteenused.ttu.api.controller

import ee.veebiteenused.ttu.api.service.TwitterService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TwitterController(private val service : TwitterService) {

    @GetMapping("/tweet/{tweetId}")
    fun getTweetByTweetId(@PathVariable tweetId: String) : String {
        return service.getTweetByTweetId(tweetId)
    }

    @GetMapping("/tweets/{userId}")
    fun getTweetsByUser(@PathVariable userId: String) : String {
        return service.getTweetByTweetId(userId)
    }

    @GetMapping("/tweet/{tweetId}/{userId}")
    fun getTweetComment(@PathVariable userId: String) : String {
        return service.getTweetByTweetId(userId)
    }

    @GetMapping("/comments/{tweetId}")
    fun getTweetComments(@PathVariable userId: String) : String {
        return service.getTweetByTweetId(userId)
    }

    @PostMapping("/tweet")
    fun addTweet(@PathVariable userId: String) : String {
        return service.getTweetByTweetId(userId)
        // TODO: Correct object
    }

    @PostMapping("/tweet/{tweetId}")
    fun addCommentToTweet(@PathVariable userId: String) : String {
        return service.getTweetByTweetId(userId)
        // TODO: Correct object
    }




}
