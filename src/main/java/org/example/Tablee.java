package org.example;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class Tablee extends AbstractTableModel {
    ArrayList<Person> person;

    String[] columns ={"RS" , "TS"};
    public Tablee(){
        person = new ArrayList<>();
    }

    public void adding(Person student){
        person.add(student);
        fireTableDataChanged();
    }

    public String getColumnName(int column){
        return columns[column];
    }
    @Override
    public int getRowCount() {
        return person.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Person po = person.get(rowIndex);

        if(columnIndex==0){
            return po.getFirst();
        }else {
            return po.getLast();
        }
    }
}