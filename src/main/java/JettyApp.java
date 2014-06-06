import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class JettyApp implements SparkApplication {
	@Override
	public void init() {
		get("/", (req, res) -> "hello jetty application");
	}
}
