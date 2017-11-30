package ee.veebiteenused.ttu.api.service

import ee.veebiteenused.ttu.api.dao.Repository
import org.springframework.stereotype.Service

@Service
class TwitterService(private val repository: Repository) {

    fun getTweetByTweetId(tweetId:String) : String {
        return repository.getData()
    }

}
