import com.lib.PartitionManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * @author AKOURTIM Ahmed on 2020-10-10
 */
public class PartitionTest {

    @Test
    public void defaultPartition() throws Exception{

        List<Integer> defaultList = Arrays.asList(1,2,3,4);
        List<List<Integer>> expectedResult = new ArrayList<>();
        expectedResult.add(defaultList);


        List<List<Integer>> result = PartitionManager.partition(defaultList,4);
        Assertions.assertEquals(expectedResult,result);



    }

    @Test
    public void partionOfFourSublists() throws Exception{

        List<Integer> defaultList = Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> secondList = Arrays.asList(1,2,3,4,5,6,7,8,9);




        List<List<Integer>> result = PartitionManager.partition(defaultList,2);
        Assertions.assertEquals(4,result.size());

        List<List<Integer>> secondResult = PartitionManager.partition(secondList,2);
        Assertions.assertEquals(5,secondResult.size());




    }

    @Test
    public void partionOfFourSublistsContent() throws Exception{

        List<Integer> defaultList = Arrays.asList(1,2,3,4,5,6,7,8);



        List<List<Integer>> result = PartitionManager.partition(defaultList,2);
        Assertions.assertEquals(Arrays.asList(5,6),result.get(2));


    }

    @Test
    public void whenExceptionRelatedToPartionSize() throws Exception{

        List<Integer> defaultList = Arrays.asList(1,2,3,4,5,6,7,8);






        Exception exception = Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {
            PartitionManager.partition(defaultList,10);

        });


        String exceptionMessage = exception.getMessage();

        Assertions.assertEquals("Size of partition must be not be greater the list size",
                exceptionMessage);

    }

    @Test
    public void whenExceptionInvalidSize() {

        List<Integer> defaultList = Arrays.asList(1,2,3,4,5,6,7,8);






        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            PartitionManager.partition(defaultList,-9);

        });


        Exception exceptionNull = Assertions.assertThrows(Exception.class, () -> {
            PartitionManager.partition(null,-9);

        });



        String exceptionMessage = exception.getMessage();

        Assertions.assertEquals("list is empty or null or the partition size is null or negative",
                exceptionMessage);
        Assertions.assertEquals("list is empty or null or the partition size is null or negative",
                exceptionNull.getMessage());

    }
}
