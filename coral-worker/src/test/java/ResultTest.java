import com.google.gson.Gson;
import coral.core.scaladsl.common.Result;

/**
 * Created by taoistwar on 2017/6/17.
 */
public class ResultTest {

    public static void main(String[] args) {
        Result result = new Result(200, "xx");
        Gson gson = new Gson();
        System.out.println(gson.toJson(result));

    }

}
