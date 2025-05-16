package org.example;



import javax.swing.*;
import java.awt.*;

public class JavaGui extends JFrame {
    GridBagLayout layout;
    Container container;

    JLabel FullName, rs, ts;
    JTextField Name,rss,tss;
    JButton but, relod;

    JScrollPane jScrollPane1;
    Tablee tablee;
    JTable lol;
    JPanel please;

    JButton add, del;
    JPanel panel;
    JPanel pane;
    JPanel a;

    public JavaGui(){
        setTitle("Frame");

        Name = new JTextField("Tester",30);
        FullName = new JLabel("Name: ");

        rss = new JTextField(7);
        tss = new JTextField(7);
        rs = new JLabel("rs");
        ts = new JLabel("ts");
        del = new JButton("Del");

        panel = new JPanel();
        panel.add(rs);
        panel.add(rss);
        panel.add(ts);
        panel.add(tss);

        pane = new JPanel();

        pane.add(FullName);
        pane.add(Name);
        a= new JPanel();


        but = new JButton("Save");

        tablee = new Tablee();
        lol = new JTable(tablee);
        jScrollPane1 = new JScrollPane(lol);
        please = new JPanel();
        relod = new JButton("Reload");

        add = new JButton("ADD");
        a.add(add);
        //a.add(del);

        container = this.getContentPane();
        layout = new GridBagLayout();
        container.setLayout(layout);

        lol.getTableHeader().setReorderingAllowed(false);
        lol.getTableHeader().setResizingAllowed(false);

        UIset(pane, 0,0,1,1);

        UIset(panel,0,1,1,1);

        UIset(jScrollPane1,0,2,1,1);
        UIset(a,0,3,1,1);

        this.setVisible(true);
        this.pack();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }



    public void UIset(Container e, int x, int y, int wx, int wy){
        GridBagConstraints gridBagConstraints = new GridBagConstraints();

        gridBagConstraints.gridx=x;
        gridBagConstraints.gridy=y;
        gridBagConstraints.gridwidth=wx;
        gridBagConstraints.gridheight=wy;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.insets = new Insets(5,5,5,5);

        container.add(e,gridBagConstraints);
    }
}