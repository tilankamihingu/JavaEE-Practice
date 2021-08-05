/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Hp
 */
@Named(value = "emrController")
@SessionScoped
public class EmrController implements Serializable {

    /**
     * Creates a new instance of EmrController
     */
   
    private Integer first = 20;
    private Integer second = 10;
    private Integer notvac = 5;
    private Integer availableone = 50;
    private Integer availabletwo = 30;;
    public EmrController() {
    }

    public Integer getAvailableone() {
        return availableone;
    }

    public void setAvailableone(Integer availableone) {
        this.availableone = availableone;
    }

    public Integer getAvailabletwo() {
        return availabletwo;
    }

    public void setAvailabletwo(Integer availabletwo) {
        this.availabletwo = availabletwo;
    }
    
    public Integer getFirst() {
        return first;
    }

    public void setFirst(Integer first) {
        this.first = first;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }

    public Integer getNotvac() {
        return notvac;
    }

    public void setNotvac(Integer notvac) {
        this.notvac = notvac;
    }
    
    public void firstAdd(){
        first++;
    }
    public void secondAdd(){
        second++;
    }
    public void notAdd(){
        notvac++;
    }
    public void notremove(){
        notvac--;
    }
    
}
