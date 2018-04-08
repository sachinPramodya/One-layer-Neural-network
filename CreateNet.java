/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Back;

/**
 *
 * @author Sachin
 */
public class CreateNet {
    
    Nuron N1=new Nuron(0.3,0.4,0.5,0.6);
    Nuron N2=new Nuron(0.4,0.5,0.6,0.7);
    Nuron N3=new Nuron(0.7,0.2,0.1,0.6);
    Nuron N4=new Nuron(0.2,0.8,0.4,0.5);
    
    int [][] inputVal=new int[][]{
        {0,0,0,0},
        {0,0,1,1},
        {0,0,1,0},
        {0,1,0,1},
        {0,1,0,0},
        {0,1,1,1},
        {0,1,1,0},
        {1,0,0,1},
        {1,0,0,0},
        {1,0,1,1},
        {1,0,1,0},
        {1,1,0,1},
        {1,1,0,0},
        {1,1,1,1},
        {1,1,1,0},
        {1,1,1,1}
   
    };
    
   int[][] trainData = new int[][]{
        {1,1,0},
        {0,1,1},
        {0,1,0},
        {1,0,1},
        {1,0,0},
        {1,1,1},
        {1,1,0},
        {0,0,1},
        {0,0,0},
        {0,1,1},
        {0,1,0},
        {1,0,1},
        {1,0,0},
        {1,1,1},
        {1,1,0},
        {1,1,1}
    }; 
    
    
    
    
}
