package _03_To_Do_List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoList implements ActionListener{
	ArrayList<String> tasks= new ArrayList<String>();
	FileWriter filewriter;
	JFrame frame;
	JPanel panel;
	JButton addTask;
	JButton viewTask;
	JButton removeTask;
	JButton saveList;
	JButton loadList;
	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save list, and load list. 
	 *
	 * When add task is clicked:
	 * 		Create a JOptionPane to ask the user for a task and add it to an ArrayList
	 * 
	 * When the view tasks button is clicked:
	 *		show all the tasks in the list
	 * 
	 * When the remove task button is clicked:
	 * 		Create a JOptionPane to prompt the user for which task to remove and take it off of the list.
	 * 
	 * When the save list button is clicked:
	 * 		Save the list to a file
	 * 
	 * When the load list button is clicked:
	 * 		Create a JOptionPane to Prompt the user for the location of the file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file into the list. 
	 */
	
	public static void main(String[] args) {
		new ToDoList().createFrame();
	}

	private void createFrame() {
		frame= new JFrame();
		panel= new JPanel();
		addTask= new JButton("Add Task");
		viewTask= new JButton("View Task");
		removeTask= new JButton("Remove Task");
		saveList= new JButton("Save List");
		loadList= new JButton("Load List");
		frame.add(panel);
		panel.add(addTask);
		panel.add(viewTask);
		panel.add(removeTask);
		panel.add(saveList);
		panel.add(loadList);
		addTask.addActionListener(this);
		viewTask.addActionListener(this);
		removeTask.addActionListener(this);
		saveList.addActionListener(this);
		loadList.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	if(e.getSource()==(addTask)) {
tasks.add(JOptionPane.showInputDialog("Enter a task:"));
	}
	else if(e.getSource()== (viewTask)) {
		for(int i=0; i< tasks.size();i++) {	
			System.out.println(tasks.get(i));
		}
	}
	else if(e.getSource()== (removeTask))	{
		String[] options = new String[tasks.size()];
		for(int i=0; i< tasks.size(); i++) {
			options[i] = tasks.get(i);
		}
		int remove = JOptionPane.showInputDialog("What task would you like to remove?","task removal", JOptionPane.DEFAULT_OPTION,  JOptionPane.INFORMATION_MESSAGE, null, options,options[options.length-1] );
		tasks.remove(remove);
	}
	else if(e.getSource()== (saveList)) {
		
	}
	else if(e.getSource()==(loadList)) {
		
	}
	}
}
