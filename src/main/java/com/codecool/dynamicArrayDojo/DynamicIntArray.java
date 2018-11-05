package com.codecool.dynamicArrayDojo;



// put your code here!
public class DynamicIntArray {


    private Object[] data = new Object[0];


//    public DynamicIntArray(){
//
//    }


//    public DynamicIntArray(int size){
//        Object[] objArray = new Object[size];
//    }


    public int size(){
        int arrSize = 0;

        while(arrSize <= data.length){
            arrSize++;
        }

        return arrSize;
    }



    public void add(Object obj){

        Object[] biggerArray = new Object[data.length + 1];

        for(int i = 0; i < data.length; i++){

            biggerArray[i] = data[i];

        }

        data = biggerArray;

        data[data.length - 1] = obj;


    }


    public void remove(Object obj){

        Object[] smallerArray = new Object[data.length - 1];

        for(int i = 0; i < data.length; i++){
            if(data[i] != obj){
                smallerArray[i] = data[i];
            }
        }

        data = smallerArray;


    }


    public void insert(int index, Object obj){



    }



    public String toString(){

        StringBuilder output = new StringBuilder();

        for(int i = 0; i < data.length; i++){
            output.append(" " + data[i]);
        }

        return output.toString();
    }



}
