/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadpools;

/**
 *
 * @author Dias NandaIka
 */
public class ClassThread implements Runnable {
    private int  id;
    
    public ClassThread(int id){
        this.id=id;
    }
    @Override
    public void run() {
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
