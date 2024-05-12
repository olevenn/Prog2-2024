package Uebung5.Uebung1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrassenbewohnerTest {

    static Strassenbewohner[] tmp;
    Strassenbewohner s1;
    Strassenbewohner s2;
    Strassenbewohner s3;
    Strassenbewohner s4;

    @BeforeEach
    void init() {
        tmp = new Strassenbewohner[5];
        s1 = new Strassenbewohner(1, "Anna");
        s2 = new Strassenbewohner(2, "Ben");
        s3 = new Strassenbewohner(3, "Chris");
        s4 = new Strassenbewohner(4, "Didi");
    }

    @Test
    void test(){
        tmp[0] = null;
        tmp[1] = s1;
        tmp[2] = s2;
        tmp[3] = s3;
        tmp[4] = s4;

        IteratorStrassenbewohner is = new IteratorStrassenbewohner(tmp);

        while(is.hasNext()){
            System.out.println(is.next());
        }
    }

}