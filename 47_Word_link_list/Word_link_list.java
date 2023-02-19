import java.util.*;
import java.io.*;

public class Word_link_list{
    LinkedList<String> link_list;
    
    public Word_link_list(){

        link_list = new LinkedList<String>();
    }

    public void stack_word(String word){

        link_list.add(word);
    }

    public String get_top_word(){
        
        return(link_list.getLast());        
    }

    public String unstack_word(){

        return link_list.removeLast();
    }

    public boolean stack_empty_word(){

        return link_list.isEmpty();
    }

    public static void main(String[] args){

        String strA = "Voynich";
        String strB = "Firmware";
        String strC = "Development";

        Word_link_list wll = new Word_link_list();
        wll.stack_word(strA);
        wll.stack_word(strB);
        wll.stack_word(strC);

        while(!wll.stack_empty_word()){

            System.out.println(wll.unstack_word());
        }
    }    
}
