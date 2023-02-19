import java.util.*;
import java.io.*;

interface String_list extends Iterable<String>{
    
    String getString(int index);
    void addString(String s);
    int size();
    ListIterator<String> list_iterator_begins_with(char c);
    ListIterator<String> list_iterator();
}

class String_list_array implements String_list{
    
    private String[] list;
    private int count;

    public String_list_array(int size){
        
        list = new String[size];
        count = 0;
    }

    public void addString(String s){
        
        list[++count] = s;
    }

    public String getString(int index){

        return list[index];
    }

    public int size(){
        
        return count;
    }

    public ListIterator<String> list_iterator_begins_with(char c){

        return new List_iterator_begins_with(this, c);
    }

    public ListIterator<String> list_iterator(){
        
        return new List_iterator_array(this);
    }

    public Iterator<String> iterator(){
        
        return list_iterator();
    }
}

class List_iterator_array implements ListIterator<String>{

    private String_list l;
    private int index;

    public List_iterator_array(String_list list){

        l = list;
        index = -1;
    }

    public void add(String s){

        throw new UnsupportedOperationException();
    }

    public boolean hasNext(){

        return index < l.size() - 1;
    }

    public boolean hasPrevious(){

        return index > 0;
    }

    public String next(){

        if(index == l.size() - 1){

            throw new NoSuchElementException();
        }

        return l.getString(++index);
    }

    public int nextIndex(){

        return index + 1;
    }

    public String previous(){

        if(index == 0){

            throw new NoSuchElementException();
        }

        return l.getString(-index);
    }

    public int previousIndex(){

        return index - 1;
    }

    public void remove(){

        throw new UnsupportedOperationException();
    }

    public void set(String s){

        throw new UnsupportedOperationException();
    }
}

class List_iterator_begins_with implements ListIterator<String>{

    private String_list l;
    private int index;
    private char initial;

    public List_iterator_begins_with(String_list list, char ini){

        initial = ini;
        l = list;
        index = -1;
    }

    public void add(String s){
        
        throw new UnsupportedOperationException();
    }

    public boolean hasNext(){
        
        int i;
        for(i = index + 1; i < l.size(); i++){
            
            if(l.getString(i).charAt(0) == initial){

                return true;
            }
        }

        return false;
    }

    public boolean hasPrevious(){

        int i;

        for(i = index - 1; i >= 0; i--){

            if(l.getString(i).charAt(0) == initial){

                return true;
            }
        }

        return false;
    }

    public String next(){

        int i;

        for(i = index + 1; i < l.size(); i++){
            
            if(l.getString(i).charAt(0) == initial){
                index = i;
                return l.getString(i);
            }
        }

        throw new NoSuchElementException();
    }

    public int nextIndex(){

        int i;

        for(i = index + 1; i < l.size(); i++){

            if(l.getString(i).charAt(0) == initial){

                return i;
            }
        }

        return l.size();
    }

    public String previous(){

        int i;

        for(i = index - 1; i >= 0; i--){

            if(l.getString(i).charAt(0) == initial){

            index = i;
            return l.getString(i);
            }
        }

        throw new NoSuchElementException();
    }

    public int previousIndex(){

        int i;

        for(i = index - 1; i >= 0; i--){

            if(l.getString(i).charAt(0) == initial){

                return i;
            }
        }

        return -1;
    }

    public void remove(){

        throw new UnsupportedOperationException();
    }

    public void set(String s){

        throw new UnsupportedOperationException();
    }
}

public class Main{

    public static void main(String[] args){

        String_list l;
        l = new String_list_array(20);
        l.addString("Hi");
        l.addString("Bye");
        l.addString("one");
        l.addString("two");
        l.addString("three");
        l.addString("four");
        l.addString("five");
        l.addString("Six");
        l.addString("Seven");
        l.addString("Eight");
        l.addString("Car");
        l.addString("Truck");

        System.out.println("\"All elements list");
        ListIterator<String> it = l.list_iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        while(it.hasPrevious()){
            System.out.println(it.previous());
        }

        System.out.println("Elements with \"c\" at start");
        it = l.list_iterator_begins_with('c');

        while(it.hasNext()){
            System.out.println(it.next());
        }

        while(it.hasPrevious()){
            System.out.println(it.previous());
        }

        System.out.println("all elements list ascending");

        for(String s: l){

            System.out.println(s);
        }
    }
}
