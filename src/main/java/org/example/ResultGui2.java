package org.example;

import javax.swing.*;
import java.awt.*;

public class ResultGui2 extends JFrame {
    GridBagLayout layout;
    Container container;

    public ResultGui2(){
        setTitle("Table Result");



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
