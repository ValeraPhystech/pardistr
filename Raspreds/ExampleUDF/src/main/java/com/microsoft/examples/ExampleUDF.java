import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.*;


// Description of the UDF
@Description(
    name="ExampleUDF",
    value="returns a size of HTML page in MB",
    extended="select ExampleUDF(size) as udfSize from Logs ORDER BY udfSize DESC;"
)
public class ExampleUDF extends UDF {
    public double evaluate(String input) {
        if(input == null)
            return 0;
        return Integer.parseInt(input)/1024.0;
    }
}
