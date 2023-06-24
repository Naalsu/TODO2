import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Entertask {
    private String task;
    private ArrayList<String> toDo;
    // alkuehdot Ei voi lisätä tyhjä syöntti.

    public Entertask(String task){
        this.task = task;
        toDo = new ArrayList<>();
    }


    public static void main(String[] args){
        Entertask entertask = new Entertask("");


        while(true){
            System.out.println("Enter task: ");
            Scanner sec = new Scanner(System.in);
            String task = sec.nextLine();
            if(task.isEmpty()){
                System.out.println("Error, task cannot be empty!");
            }else{
                entertask.enterTask(task);
                System.out.println(entertask.toDo);
            }
            }
        }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void enterTask(String task){
        toDo.add(task);
    }

}
