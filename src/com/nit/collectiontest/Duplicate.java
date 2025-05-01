package com.nit.collectiontest;

import java.util.ArrayList;
import java.util.List;

public class Duplicate
{
     private List<Integer> numberList;

    public Duplicate(List<Integer> numberList) {
        this.numberList = numberList;
    }
    public Duplicate()
    {
        this.numberList=new ArrayList<>();
    }

    public List<Integer> getNumberList() {
        return numberList;
    }

    public void setNumberList(List<Integer> numberList) {
        this.numberList = numberList;
    }

    public  List<Integer> getDuplicatesList()
   {

       if(numberList==null|| numberList.isEmpty())
       {
           return null;
       }
       List<Integer> duplicate=new ArrayList<>();
      for(int i=0;i< numberList.size();i++)
      {
          int first= numberList.get(i);
          for(int j=0;j< numberList.size();j++)
          {
              if(i!=j && first== numberList.get(j))
              {
                  if(duplicate.contains(first))
                  {
                      break;
                  }
                  duplicate.add(first);
              }
          }
      }


         return duplicate;
       }



    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(33);
        list.add(45);
        list.add(2);
        list.add(33);
        list.add(67);
        list.add(89);
        list.add(22);
        list.add(89);
        list.add(33);
        Duplicate d1=new Duplicate(list);
        List<Integer> i1= d1.getDuplicatesList();;

        for(int i=0;i<i1.size();i++)
        {
            System.out.print(i1.get(i)+" ");
        }
    }

}
