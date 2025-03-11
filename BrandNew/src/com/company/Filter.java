package com.company;

import java.util.ArrayList;

import static com.company.Items.filtered_items_array;
import static com.company.Items.items_array;

public abstract class Filter {
  public static    ArrayList<Items> FilterMen(ArrayList<Items> items_array){

      return items_array;
  }
  public static ArrayList<Items> FilterWomen(ArrayList<Items> items_array){

      return items_array;
  }
   public static ArrayList<Items> FilterKids(ArrayList<Items> items_array){

       return items_array;
   }
   public ArrayList<Items> FilterItems(){
       return filtered_items_array;
   }
}
