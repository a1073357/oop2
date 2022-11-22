import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class MyJFrame extends JFrame implements ListSelectionListener, ActionListener, ItemListener {
    Border borderLine = BorderFactory.createLineBorder(Color.BLACK);
    JLabel hintText = new JLabel("");
    JLabel jobText = new JLabel();
    String[] city = {"台北", "新北", "宜蘭", "台中", "台南", "高雄"};
    JComboBox<String> comboBox = new JComboBox<>(city);
    MyJFrame() {
        setTitle("各地名山");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(500, 200, 280, 300);
        setLayout(null);

       
        JPanel jobPanel = new JPanel();
        add(jobPanel);
        jobPanel.setBounds(70, 20, 80, 120);
        jobPanel.setBorder(BorderFactory.createTitledBorder(borderLine, "城市"));
        jobPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

        jobPanel.add(comboBox);
        comboBox.addItemListener(this);

        add(hintText);
        hintText.setBounds(40, 160, 150, 30);
        hintText.setBorder(borderLine);
        add(jobText);
        jobText.setBounds(50, 160, 120, 30);
        


        setVisible(true);
    }


    @Override
    public void valueChanged(ListSelectionEvent e) {

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String str = (String)comboBox.getSelectedItem();
        switch(str){
            case "台北" :
               jobText.setText(str+"名山 七星山主峰");
               break;
            case "新北" :
               jobText.setText(str+"名山 東眼山");
               break;
            case "宜蘭" :
               jobText.setText(str+"名山 陶塞峰（山）");
               break;
            case "台中" :
               jobText.setText(str+"名山 雪山");
               break;
            case "台南" :
               jobText.setText(str+"名山 大凍山");
               break;
            case "高雄" :
               jobText.setText(str+"名山 玉山南峰");
               break;
        }
    }
}

public class homework_1103 {
    public static void main(String[] args) {
        new MyJFrame();
    }
}