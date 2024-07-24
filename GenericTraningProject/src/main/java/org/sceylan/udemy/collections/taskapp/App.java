package org.sceylan.udemy.collections.taskapp;

import java.util.*;

public class App {
    public static void run()
    {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("arif","yapay zeka"));
        tasks.add(new Task("hsem","hava savunma"));
        tasks.add(new Task("mmu","uçak"));
        Collections.sort(tasks);

        for(var i:tasks)
            System.out.println(i);
    }



}
