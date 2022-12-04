package com.JavaCore.Collection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Runner {
    public int countUnique(List<Integer> list){
        Set<Integer> result = new HashSet<>();
        for (Integer integer : list) {
            result.add(integer);
        }
        return result.size();
    }
}
