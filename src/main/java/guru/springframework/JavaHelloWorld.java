package guru.springframework;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by jt on 2018-12-09.
 */
@Data @NoArgsConstructor
public class JavaHelloWorld {

    public String getHello(){
        return "Hello World";
    }


}
