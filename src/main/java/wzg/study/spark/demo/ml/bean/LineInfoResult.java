package wzg.study.spark.demo.ml.bean;

import lombok.Getter;
import lombok.Setter;
import org.apache.spark.ml.linalg.DenseVector;
import org.apache.spark.ml.linalg.Vector;

import java.io.Serializable;

@Getter
@Setter
public class LineInfoResult implements Serializable {
    private long id;
    private String text;
    private String probability;
    private double prediction;

    @Override
    public String toString() {
        return "[id=" + id + ", text=" + text + ", probability=" +
                probability + ", prediction=" + prediction +
                "]";
    }
}
