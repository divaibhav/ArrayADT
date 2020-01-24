/*
 *   Created by IntelliJ IDEA.
 *   User:  Vaibhav
 *   Date: 14/01/20
 *   Time: 7:18 PM
 */

package implementation;

import adt.ArrayADTInterface;

import java.util.Arrays;

public class ArrayADTImplementationClass implements ArrayADTInterface {
    private int[] data;
    private int size;
    private int end;

    public ArrayADTImplementationClass(int size){
        this.size = size;
        data = new int[this.size];
        end = 0;
    }





    @Override
    public boolean insert(int element) {
        boolean response = false;
        if(!isFull()){
            data[end] = element;
            end++;
            response = true;
        }
        return response;
    }

    private boolean isFull() {
        boolean response = false;
        if(end == size){
            response = true;
        }
        return response;
    }

    @Override
    public void traverse() {
        System.out.println("Printing Elements....");
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]);
            if(i != end -1){
                System.out.print(",");
            }
        }
        System.out.println();
    }

    @Override
    // deleting the last element
    public int delete() {
        int response = 0;
        if(!isEmpty()){
            end--;
            response = data[end];

        }

        return response;
    }

    @Override
    public boolean isEmpty() {
        boolean response = false;
        if(end == 0){
            response = true;
        }
        return response;
    }

    @Override
    public boolean search(int element) {
        boolean response = false;
        for (int i = 0; i < end ; i++) {
            if(data[i] == element){
                response = true;
                break;
            }
        }
        return response;
    }

    public int getEnd() {
        return end;
    }

    @Override
    public int[] sort() {
        // cloning original array
        int[] response = data.clone();
        for (int i = 0; i < end - 1; i++) {
            for (int j = 0; j < end - i - 1 ; j++) {
                if(response[j] > response[j+1]){
                    int temp = response[j];
                    response[j] = response[j+1];
                    response[j+1] = temp;
                }
            }
        }
        return  response;
    }
}
