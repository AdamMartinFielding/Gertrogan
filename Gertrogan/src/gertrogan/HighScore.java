/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gertrogan;

import java.io.*;
import java.util.ArrayList;
public class HighScore {
    private int playerScore;
    private String playerName;
    public ArrayList<Integer> scores = new ArrayList();
    public ArrayList<String> names = new ArrayList();
    
    
    
    public HighScore(String name, int score){
        playerScore = score;
        playerName = name;
    }
    
    public String getHighScores(){
        scores = new ArrayList();
        names = new ArrayList();

        String output = "";
        try{
            FileReader fr = new FileReader("src\\gertrogan\\Highscores.txt");
            BufferedReader br = new BufferedReader(fr);
            boolean eof = false;
            output = br.readLine();
            int highScore;
            String name = " ";
            while(!eof){
                name = br.readLine();
                if(name == null){
                    eof = true;
                }else{
                    highScore = Integer.parseInt(br.readLine());
                    names.add(name);
                    scores.add(highScore);
                }
            }
        }catch(IOException e){
            System.out.println("Error: " + e);
        }
        for(int i = 0 ;i<(scores.size() - 1); i++){
            output += "Name: " + names.get(i) + "\nScore: " + scores.get(i);
        }
        return output;
    }
    
    public void addHighScore(){
        scores = new ArrayList();
        names = new ArrayList();
        String temp;
        try{
            FileReader fr = new FileReader("src\\gertrogan\\Highscores.txt");
            BufferedReader br = new BufferedReader(fr);
            boolean eof = false;
            temp = br.readLine();
            int highScore;
            String name = " ";
            while(!eof){
                name = br.readLine();
                if(name == null){
                    eof = true;
                }else{
                    highScore = Integer.parseInt(br.readLine());
                    names.add(name);
                    scores.add(highScore);
                }
            }
        }catch(IOException e){
            System.out.println("Error: " + e);
        }
        
        names.add(playerName);
        scores.add(playerScore);
        
        quickSort(names,scores, 0, (scores.size() - 1));
        
        String add = "";
        for(int i = 0 ;i<(scores.size() - 1); i++){
            add += "Name: " + names.get(i) + "\nScore: " + scores.get(i);
        }
        try{
            FileWriter fw = new FileWriter("src\\gertrogan\\Highscores.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(add);
            bw.close();
        }catch(IOException e){
            System.out.println("Error: " + e);
        }
        
    }
    
    public static void quickSort(ArrayList<String> names, ArrayList<Integer> nums, int left, int right){
        if(left > right){
            return;
        }
        int i = left;
        int j = right;
        int temp;
        String tempS;
        int pivot = nums.get((left + right) / 2);
        while(i <= j){
            while(nums.get(i) < pivot){
                i++;
            }
            while(nums.get(j) > pivot){
                j--;
            }
            if(i<= j){
                temp = nums.get(i);
                tempS = names.get(i);
                nums.set(i,nums.get(j));
                names.set(i,names.get(j));
                nums.set(j,temp);
                names.set(j, tempS);
                i++;
                j--;
            }
        }
        
        if(left < i - 1){
            quickSort(names, nums, left, i - 1);
        }
        if(i < right){
            quickSort(names, nums, i, right);
        }
    }
}
