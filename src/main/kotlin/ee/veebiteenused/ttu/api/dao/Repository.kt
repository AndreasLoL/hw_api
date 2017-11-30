package ee.veebiteenused.ttu.api.dao

import org.springframework.stereotype.Repository
import com.rethinkdb.RethinkDB
import com.rethinkdb.gen.exc.ReqlError
import com.rethinkdb.gen.exc.ReqlQueryLogicError
import com.rethinkdb.model.MapObject
import com.rethinkdb.net.Connection
import com.rethinkdb.RethinkDB.r
import java.util.Calendar
import java.text.SimpleDateFormat
import java.text.DateFormat

@Repository
class Repository {

    private val sdf = SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
    private val rethinkDb = RethinkDB.r

    fun openConnection(): Connection {
        return r.connection().hostname("localhost").port(28015).connect();
    }

    fun getData() : String {
        val conn = openConnection()

        val cal = Calendar.getInstance()
        System.out.println(sdf.format(cal.time))

        rethinkDb.table("twitter");

        return "hello"
    }

}
