package org.example;

public class DStack {

    int capacity = 2;
    int stack[] = new int[capacity];
    int top = 0;

    /*public void push(int data){
        if(size()==capacity)
            expand();
        stack[top] = data;
        top++;
    }

    private void expand() {
        int length = size();
        int newStack[] = new int[capcity*2];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack = newStack;
        capacity *= 2;
    }
    private void shrink(){
        int length = size();
        if(length<=(capacity/2)/2)
            capacity /= 2;
        int newStack[]
    }
    public int pop(){
        int data = 0;
        if(isEmpty())
    }*/
}
