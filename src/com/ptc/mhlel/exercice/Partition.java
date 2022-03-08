package com.ptc.mhlel.exercice;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;


public final class Partition {
	
	public static List<List<Integer>> partition(List<Integer> liste, int taille) throws Exception
    {
        if(liste == null) {
            throw new Exception("La liste est nulll");
        } else if(taille <= 0) {
            throw new Exception("La taille est null ou negative");
        }

         List resultOfPartition= new ArrayList<>(liste.stream()
                .collect(Collectors.groupingBy(s -> (s - 1) / taille))
                .values());
         return resultOfPartition;
    }
	
}