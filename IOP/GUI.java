import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUI extends Canvas implements ActionListener {
    String title ="default";
    String info = "infodefault";
        JMenu[] menus = {new JMenu("Characters"), new JMenu("Summaries"), new JMenu("Analyzations"), new JMenu("Useful Quotes")};
        JMenuItem[] items1 = {new JMenuItem("Jason Compson III (Mr. Compson)"), new JMenuItem("Caroline Bascomb Compson (Mrs. Compson)"), new JMenuItem("Quentin Compson")
        , new JMenuItem("Caddy Compson (Candace)"), new JMenuItem("Jason Compson IV"), new JMenuItem("Benjy Compson (Maury)"), new JMenuItem("Miss Quentin"), new JMenuItem("Dilsey")
        , new JMenuItem("Roskus"), new JMenuItem("T.P."), new JMenuItem("Versh"), new JMenuItem("Frony"), new JMenuItem("Luster"), new JMenuItem("Damuddy"), new JMenuItem("Uncle Maury Bascomb")
        , new JMenuItem("Mr. and Mrs. Patterson"), new JMenuItem("Charlie"), new JMenuItem("Dalton Ames"), new JMenuItem("Shreve MacKenzie"), new JMenuItem("Spoade")
        , new JMenuItem("Gerald Bland"), new JMenuItem("Mrs. Bland"), new JMenuItem("Deacon"), new JMenuItem("Julio"), new JMenuItem("Herbert head")
        , new JMenuItem("Lorraine"), new JMenuItem("Earl"), new JMenuItem("Uncle Job"), new JMenuItem("Reverend Shegog")};
        JMenuItem[] items2 = {new JMenuItem("Chapter 1, Benjy's Chapter"), new JMenuItem("Chapter 2, Quentin's Chapter"), new JMenuItem("Chapter 3, Jason's Chapter")
        , new JMenuItem("Chapter 4, Dilsey's Chapter"), new JMenuItem("Chapter 2, Book Summary")};
        JMenuItem[] items3 = {new JMenuItem("Time"), new JMenuItem("Title"), new JMenuItem("Suicide"), new JMenuItem("Old South vs New South")
        , new JMenuItem("Decay of the Compson Family (Decay of the Southern Aristocracy)"), new JMenuItem("Faulkner’s style")};
        JMenuItem[] items4 = {new JMenuItem("Benjy's Section"), new JMenuItem("Quentin's Section"), new JMenuItem("Jason's Section"), new JMenuItem("Dilsey's Section")
        , new JMenuItem("Passage Analysis Jason’s Section")};
    public void GUI() {
    }
    public JMenuBar Menu() {
        JMenuBar menuBar = new JMenuBar();
        for (int i=0; i<items1.length; i++) {
            menus[0].add(items1[i]);
            items1[i].addActionListener(this);
        }
        for (int i=0; i<items2.length; i++) {
            menus[1].add(items2[i]);
            items2[i].addActionListener(this);
        }
        for (int i=0; i<items3.length; i++) {
            menus[2].add(items3[i]);
            items3[i].addActionListener(this);
        }
        for (int i=0; i<items4.length; i++) {
            menus[3].add(items4[i]); 
            items4[i].addActionListener(this);
        }
        for (int i=0; i<menus.length; i++) {
            menuBar.add(menus[i]);
        }
        return menuBar;
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == items1[0]) {
            title = "Character: Jason Compson III (Mr. Compson)";
            info = "yes";
        }
        if (e.getSource() == items1[1]) {
            title = "Character: Caroline Bascomb Compson (Mrs Compson)";
            info = "yes";
        }
        if (e.getSource() == items1[2]) {
            title = "Character: Quentin Compson";
            info = "yes";
        }
        if (e.getSource() == items1[3]) {
            title = "Character: Caddy Compson (Candace)";
            info = "yes";
        }
        if (e.getSource() == items1[4]) {
            title = "Character: Jason Compson IV";
            info = "yes";
        }
        if (e.getSource() == items1[5]) {
            title = "Character: Benjy Compson (Maury Compson)";
            info = "yes";
        }
        if (e.getSource() == items1[6]) {
            title = "Character: Miss Quentin";
            info = "yes";
        }
        if (e.getSource() == items1[7]) {
            title = "Character: Dilsey";
            info = "yes";
        }
        if (e.getSource() == items1[8]) {
            title = "Character: Roskus";
            info = "yes";
        }
        if (e.getSource() == items1[9]) {
            title = "Character: T.P.";
            info = "yes";
        }
        if (e.getSource() == items1[10]) {
            title = "Character: Versh";
            info = "yes";
        }
        if (e.getSource() == items1[11]) {
            title = "Character: Frony";
            info = "yes";
        }
        if (e.getSource() == items1[12]) {
            title = "Character: Luster";
            info = "yes";
        }
        if (e.getSource() == items1[13]) {
            title = "Character: Damuddy";
            info = "yes";
        }
        if (e.getSource() == items1[14]) {
            title = "Character: Uncle Maury Bascomb";
            info = "yes";
        }
        if (e.getSource() == items1[15]) {
            title = "Character: Mr. And Mrs. Patterson";
            info = "yes";
        }
        if (e.getSource() == items1[16]) {
            title = "Character: Charlie";
            info = "yes";
        }
        if (e.getSource() == items1[17]) {
            title = "Character: Dalton Ames";
            info = "yes";
        }
        if (e.getSource() == items1[18]) {
            title = "Character: Shreve MacKenzie";
            info = "yes";
        }
        if (e.getSource() == items1[19]) {
            title = "Character: Spoade";
            info = "yes";
        }
        if (e.getSource() == items1[20]) {
            title = "Character: Gerald Bland";
            info = "yes";
        }
        if (e.getSource() == items1[21]) {
            title = "Character: Mrs. Bland";
            info = "yes";
        }
        if (e.getSource() == items1[22]) {
            title = "Character: Deacon";
            info = "yes";
        }
        if (e.getSource() == items1[23]) {
            title = "Character: Julio";
            info = "yes";
        }
        if (e.getSource() == items1[24]) {
            title = "Character: Herbet Head";
            info = "yes";
        }
        if (e.getSource() == items1[25]) {
            title = "Character: Lorraine";
            info = "yes";
        }
        if (e.getSource() == items1[26]) {
            title = "Character: Earl";
            info = "yes";
        }
        if (e.getSource() == items1[27]) {
            title = "Character: Uncle Job";
            info = "yes";
        }
        if (e.getSource() == items1[28]) {
            title = "Character: Reverend Shegog";
            info = "yes";
        }
        if (e.getSource() == items2[0]) {
            title = "Summary: Chapter 1, Benjy's Chapter";
            info = "yes";
        }
        if (e.getSource() == items2[1]) {
            title = "Summary: Chapter 2, Quentin's Chapter";
            info = "yes";
        }
        if (e.getSource() == items2[2]) {
            title = "Summary: Chapter 3, Jason's Chapter";
            info = "yes";
        }
        if (e.getSource() == items2[3]) {
            title = "Summary: Chapter 4";
            info = "yes";
        }
        if (e.getSource() == items2[4]) {
            title = "Summary: Book Summary";
            info = "yes";
        }
        if (e.getSource() == items3[0]) {
            title = "Analysis: Time";
            info = "yes";
        }
        if (e.getSource() == items3[1]) {
            title = "Analysis: Title";
            info = "yes";
        }
        if (e.getSource() == items3[2]) {
            title = "Analysis: Suicide";
            info = "yes";
        }
        if (e.getSource() == items3[3]) {
            title = "Analysis: Old South vs New South";
            info = "yes";
        }
        if (e.getSource() == items3[4]) {
            title = "Analysis: Decay of the Compson Fam";
            info = "yes";
        }
        if (e.getSource() == items3[5]) {
            title = "Analysis: Faulkner's style";
            info = "yes";
        }
        if (e.getSource() == items4[0]) {
            title = "Quotes: Benjy's Section";
            info = "yes";
        }
        if (e.getSource() == items4[1]) {
            title = "Quotes: Quentin's Section";
            info = "yes";
        }
        if (e.getSource() == items4[2]) {
            title = "Quotes: Jason's Section";
            info = "yes";
        }
        if (e.getSource() == items4[3]) {
            title = "Quotes: Dilsey's Section";
            info = "yes";
        }
        if (e.getSource() == items4[4]) {
            title = "Quotes: Passage Analysis Jason's Section";
            info = "yes";
        }
        repaint();
    }
    public void paint(Graphics g) {
        FontMetrics fm = g.getFontMetrics();
        Font f;
        Rectangle rect = getBounds();
        int strW = fm.stringWidth(title);
        int width = (rect.width/2) - (strW/2);
        int length = rect.height/16;
        int iwidth = 10;
        int ilength = rect.height/6;
        f = new Font("Arial", Font.BOLD,16);
        g.setFont(f);
        g.drawString(title,width,length);
        f = new Font("TimesRoman", Font.PLAIN,12);
        g.setFont(f);
        g.drawString(info,iwidth,ilength);
    }
}
