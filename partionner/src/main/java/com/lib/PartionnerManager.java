package com.lib;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

/**
 * @author AKOURTIM Ahmed on 2020-10-10
 */
public class PartionnerManager {

    public static List<List<Integer>> partition(List<Integer> list,int partionSize) throws Exception{

            if(list==null || list.size()==0 || partionSize <=0){
                throw new Exception("list is empty or null or the partition size is null or negative");
            }

            if(list.size()<partionSize){
                throw new IndexOutOfBoundsException("Size of partition must be not be greater the list size");
            }

            if(list.size()==partionSize){
                List<List<Integer>> defaultPartion = new ArrayList<>();
                defaultPartion.add(list);
                return defaultPartion;
            }


            final AtomicInteger indexCouneter = new AtomicInteger();

            final Collection<List<Integer>> partions=list.stream().collect(Collectors.groupingBy
                    (it->indexCouneter.getAndIncrement()/ partionSize)).values();


        ArrayList<List<Integer>> finalList = new ArrayList<>(partions);
        System.out.println(finalList);


       return finalList;
    }
}
