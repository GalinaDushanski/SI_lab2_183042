import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;



class SILab2Test {

    List<String> list1 = Arrays.asList();
    List<String> list2 = Arrays.asList("0","#","0","#","#","0");
    List<String> rez2 = Arrays.asList("1","#","2","#","#","1");
    List<String> list3 =Arrays.asList("0","#","0","#","#","0","0");
    List<String> rez3 =Arrays.asList("1","#","2","#","#","1","0");

    @Test
        void everyStatementTest() {
            IllegalArgumentException ex;
            ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(list1));
            assertTrue(ex.getMessage().contains("List length should be greater than 0"));
            assertTrue(SILab2.function(list2).equals(rez2));
    }


    @Test
    void testEveryPath() {

       //1,2, 3, 17
        IllegalArgumentException ex;
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(list1));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        //1,2, 4, 5.1, 5.2, 16, 17 -ne moze da se sluci

        //1,2, 4, 5.1, (5.2, 6, 13, 14, 15, 5.3, 5.2), 16, 17
        //1,2, 4, 5.1, (5.2, 6, 7,8, 10, 12, 15, 5.3, 5.2), 16, 17
        //1,2, 4, 5.1, (5.2, 6, 7,8, 10, 11, 12, 15, 5.3, 5.2), 16, 17
        //1,2, 4, 5.1, (5.2, 6, 7,8, 9, 10, 12, 15, 5.3, 5.2), 16, 17
        //1,2, 4, 5.1, (5.2, 6, 7,8, 9, 10, 11, 12, 15, 5.3, 5.2), 16, 17

        assertTrue(SILab2.function(list3).equals(rez3));

    }
}