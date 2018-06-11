/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gertrogan;

import java.io.*;
public class HighScore {
    private int playerScore;
    private String playerName;
    
    public HighScore(String name, int score){
        playerScore = score;
        playerName = name;
    }
    
    public String getHighScores(){

        String output = "";
        try{
            FileReader fr = new FileReader("src\\gertrogan\\Highscores.txt");
            BufferedReader br = new BufferedReader(fr);
            boolean eof = false;
            output = br.readLine();
            String highScore = " ";
            String name = " ";
            while(!eof){
                name = br.readLine();
                if(name == null){
                    eof = true;
                }else{
                    highScore = br.readLine();
                    output += "\nName: " + name + " Score: " + highScore + "\n";
                }
            }
        }catch(IOException e){
            System.out.println("Error: " + e);
        }
        return output;
    }
    
    public void addHighScore(){
        String add = "\n" + playerName + "\n" + playerScore;
        try{
            FileWriter fw = new FileWriter("src\\gertrogan\\Highscores.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(add);
            bw.close();
        }catch(IOException e){
            System.out.println("Error: " + e);
        }
        
    }
}
