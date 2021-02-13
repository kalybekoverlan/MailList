package com.erik;

import java.util.LinkedList;
import java.util.Iterator;

public class MailList {

    public static void main(String[] args) {
        LinkedList<Address> ml= new LinkedList<Address>();
        ml.add(new Address("Alice","34 First Ave","Moscow","1200456"));
        ml.add(new Address("Erik","78 Second Ave","Bishkek","4500789"));
        ml.add(new Address("Ralph","35 Baker str","London","7800789"));
        Iterator<Address> itr= ml.iterator();
        while(itr.hasNext() ){
            System.out.println(itr.next());
        }

    }
}
