package com.lib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author AKOURTIM Ahmed on 2020-10-10
 */
public class Partition {

    public static void main(String[] args){

        try {

            String list = args[0];
            String partitionSize = args[1];
            List<Integer> mylist = new ArrayList<>();
            int size = Integer.valueOf(partitionSize);

             Arrays.stream(list.split(","))
                                          .forEach(s-> mylist.add(Integer.valueOf(s)));


            PartitionManager.partition(mylist,size);
        }catch (IndexOutOfBoundsException ioobe){

            System.out.println("please set a valid args to run the jar :");

        } catch (Exception e){

            System.out.println(e.getMessage());
        }








    }
}
