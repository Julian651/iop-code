import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
public class GUI extends JFrame implements ActionListener {
        String title ="Incorporating Computer Science with <i>The Sound and the Fury</i><br><font size='2' face='TimesRoman' colr='black'>by: Julian Herrera & Jonathan Riess</br>";
        String info = "In dedication to our English teacher, Mrs. McElhiney, for helping us understand complex texts, such as <i>The Sound and the Fury</i>, and guiding us on how to write a quick poetry analysis. <br><br>In dedication to Mr. Greene for teaching us everything we know about programming.</br></br> <br><br>The purpose of this program is to give users the ability for quick access to useful information from the <i>The Sound and the Fury</i>, such as the various characters, the summaries and quotes of each section, and the analyses of the varying themes.</br></br>";
        JMenu[] menus = {new JMenu("Characters"), new JMenu("Summaries"), new JMenu("Symbols"), new JMenu("Analyzations"), new JMenu("Useful Quotes"), new JMenu("About")};
        JMenuItem[] items1 = {new JMenuItem("Jason Compson III (Mr. Compson)"), new JMenuItem("Caroline Bascomb Compson (Mrs. Compson)"), new JMenuItem("Quentin Compson")
        , new JMenuItem("Caddy Compson (Candace)"), new JMenuItem("Jason Compson IV"), new JMenuItem("Benjy Compson (Maury)"), new JMenuItem("Miss Quentin"), new JMenuItem("Dilsey")
        , new JMenuItem("Roskus"), new JMenuItem("T.P."), new JMenuItem("Versh"), new JMenuItem("Frony"), new JMenuItem("Luster"), new JMenuItem("Damuddy"), new JMenuItem("Uncle Maury Bascomb")
        , new JMenuItem("Mr. and Mrs. Patterson"), new JMenuItem("Charlie"), new JMenuItem("Dalton Ames"), new JMenuItem("Shreve MacKenzie"), new JMenuItem("Spoade")
        , new JMenuItem("Gerald Bland"), new JMenuItem("Mrs. Bland"), new JMenuItem("Deacon"), new JMenuItem("Julio"), new JMenuItem("Herbert head")
        , new JMenuItem("Lorraine"), new JMenuItem("Earl"), new JMenuItem("Uncle Job"), new JMenuItem("Reverend Shegog")};
        JMenuItem[] items3 = {new JMenuItem("Watch/Clock"), new JMenuItem("Water: Regatta/Charles River"), new JMenuItem("Water: Rain"), new JMenuItem("Quentin's Shadow"), new JMenuItem("Blood"), new JMenuItem("Fire"), new JMenuItem("Flowers/Trees")};
        JMenuItem[] items2 = {new JMenuItem("Chapter 1, Benjy's Chapter"), new JMenuItem("Chapter 2, Quentin's Chapter"), new JMenuItem("Chapter 3, Jason's Chapter")
        , new JMenuItem("Chapter 4, Dilsey's Chapter"), new JMenuItem("Chapter 2, Book Summary")};
        JMenuItem[] items4 = {new JMenuItem("Time"), new JMenuItem("Title"), new JMenuItem("Suicide"), new JMenuItem("Old South vs New South")
        , new JMenuItem("Decay of the Compson Family (Decay of the Southern Aristocracy)"), new JMenuItem("Faulkner’s style"), new JMenuItem("Religious Allusions")};
        JMenuItem[] items5 = {new JMenuItem("Benjy's Section"), new JMenuItem("Quentin's Section"), new JMenuItem("Jason's Section"), new JMenuItem("Dilsey's Section")
        , new JMenuItem("Passage Analysis Jason’s Section")};
        JMenuItem[] items6 = {new JMenuItem("Dedication and Information")};
        JLabel label1 = new JLabel(title,JLabel.CENTER);
        JLabel label2 = new JLabel(info, JLabel.LEADING);
    public void GUI() {
        label1.setText("<html>"+ title + "</html>");
        label2.setText("<html> <p style='margin-left: 10px'>"+ info + "</p></html>");
        label1.setVerticalAlignment(JLabel.TOP);
	label1.setFont(new Font("TimesRoman", Font.BOLD, 24));
        label2.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        label2.setPreferredSize(new Dimension(100,100));
        //JScrollPane js = new JScrollPane(label2, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        JFrame fr = new JFrame();
        fr.setLayout(new BorderLayout());
	fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//fr.add(scroller);
        //JPanel p = new JPanel(new GridLayout(5,3));
	fr.getContentPane().add(label1, BorderLayout.NORTH);
        fr.getContentPane().add(label2, BorderLayout.CENTER);
        fr.setSize(1280,720);
        fr.setJMenuBar(Menu());
        fr.setLocationRelativeTo(null);
        //fr.add(p);
        fr.show();
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
        for (int i=0; i<items5.length; i++) {
            menus[4].add(items5[i]); 
            items5[i].addActionListener(this);
        }
        for (int i=0; i<items6.length; i++) {
            menus[5].add(items6[i]); 
            items6[i].addActionListener(this);
        }
        for (int i=0; i<menus.length; i++) {
            menuBar.add(menus[i]);
        }
        return menuBar;
    }
	public void setLables(String title, String info)
	{
	  label1.setText("<html>"+ title + "</html>");
          label2.setText("<html> <p style='margin-left: 10px'>"+ info + "</p></html>");
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
            info = "Benjy Compson is the youngest son of Jason and Caroline Compson. He is a thirty-three year old disabled man who is often compared as a christ figure. He was first names Maury, after his uncle, but soon after his family found out he was disabled, his mother renamed him to Benjamin Compson because she thought it was an insult to her brother. The first chapter is told from his perspective and since Benjy lacks the concept of time, so does the chapter. He cannot talk either and thus the chapter uses rather short sentence structure and syntax with rather low level vocabulary. His chapter is filled with flashbacks, giving the reader a better perspective of the past. [He gets castrated].";
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
            info = "The initial three sections of the novel comprise of the tangled considerations, voices, and recollections of the three Compson siblings, caught on three distinctive days. The siblings are Benjy, an extremely hindered thirty-three-year-elderly person, talking in April, 1928; Quentin, a youthful Harvard understudy, talking in June, 1910; and Jason, a harsh homestead supply store laborer, talking again in April, 1928. Faulkner tells the fourth section in his very own account voice, yet centers around Dilsey, the Compson family's committed \"Negro\" cook who has had an extraordinary influence in bringing up the youngsters. Faulkner bridles the siblings' recollections of their sister Caddy, utilizing a solitary emblematic minute to figure the decrease of the once conspicuous Compson family and to analyze the decay of the Southern privileged class since the Civil War. The Compsons are one of a few unmistakable names in the town of Jefferson, Mississippi. Their predecessors helped settle the territory and in this manner guarded it amid the Civil War. Since the war, the Compsons have steadily observed their riches, land, and status disintegrate away. Mr. Compson is a heavy drinker. Mrs. Compson is a self-assimilated despondent person who depends on the whole upon Dilsey to bring up her four youngsters. Quentin, the most established tyke, is a touchy heap of mental issues. Caddy is obstinate, however adoring and merciful. Jason has been troublesome and gutless since birth and is to a great extent spurned by the other kids. Benjy is seriously rationally crippled, a \"moron\" with no comprehension of the ideas of time or profound quality. Without oneself retained Mrs. Compson, Caddy fills in as a mother figure and image of love for Benjy and Quentin. As the youngsters become more established, in any case, Caddy starts to carry on indiscriminately, which torments Quentin and sends Benjy into attacks of groaning and crying. Quentin is planning to go to Harvard, and Mr. Compson moves a substantial segment of the family land to give assets to the educational cost. Caddy loses her virginity and winds up pregnant. She can't or reluctant to name the dad of the kid, however it is likely Dalton Ames, a kid from town. Caddy's pregnancy leaves Quentin candidly broke. He endeavors to guarantee false obligation regarding the pregnancy, deceiving his dad that he and Caddy have submitted interbreeding. Mr. Compson is apathetic regarding Caddy's wantonness, rejecting Quentin's story and advising his child to leave ahead of schedule for the Northeast. Endeavoring to conceal her thoughtless activities, Caddy rapidly weds Herbert Head, a financier she met in Indiana. Herbert guarantees Jason Compson work in his bank. Herbert promptly separates from Caddy and revokes Jason's activity offer when he understands his better half is pregnant with another man's youngster. In the mean time, Quentin, still buried in sadness over Caddy's wrongdoing, submits suicide by suffocating himself in the Charles River just before the finish of his first year at Harvard. The Compsons abandon Caddy from the family, yet take in her infant little girl, Miss Quentin. The assignment of raising Miss Quentin falls solidly on Dilsey's shoulders. Mr. Compson passes on of liquor abuse about a year after Quentin's suicide. As the most seasoned enduring child, Jason turns into the leader of the Compson family unit. Sharply utilized at a modest activity in the neighborhood cultivate supply store, Jason devises a cunning plan to take the cash Caddy sends to help Miss Quentin's childhood. Miss Quentin grows up to be a despondent, insubordinate, and unbridled young lady, always in struggle with her oppressive and horrendous uncle Jason. On Easter Sunday, 1928, Miss Quentin takes a few thousand dollars from Jason and flees with a man from a voyaging appear. While Jason pursues Miss Quentin without much of any result, Dilsey takes Benjy and whatever is left of her family to Easter administrations at the neighborhood church.";
        }
        if (e.getSource() == items3[0]) {
            title = "Symbols: Watch/Clock";
            info = "";
        }
        if (e.getSource() == items3[1]) {
            title = "Symbols: Water - Regatta/Charles River";
            info = "yes";
        }
        if (e.getSource() == items3[2]) {
            title = "Symbols: Water - Rain";
            info = "yes";
        }
        if (e.getSource() == items3[3]) {
            title = "Symbols: Quentin's Shadow";
            info = "yes";
        }
        if (e.getSource() == items3[4]) {
            title = "Symbols: Blood";
            info = "yes";
        }
        if (e.getSource() == items3[5]) {
            title = "Symbols: Fire";
            info = "yes";
        }
        if (e.getSource() == items3[6]) {
            title = "Symbols: Flowers/Trees";
            info = "yes";
        }
        if (e.getSource() == items4[1]) {
            title = "Analysis: Title";
            info = "The title, <i>The Sound and the Fury</i>, is a direct allusion to a verse written by William Shakespeare in the play Macbeth:<br><br></br></br><blockquote>Life’s but a walking shadow; a poor player,<br>That struts and frets his hour upon the stage,</br><br>And then is heard no more; it is a taleTold by an idiot, full of sound and fury,</br><br>Signifying nothing (V, v, 23-26).</br></blockquote><br></br><p style='margin-left: 10px'>The beginning two lines of the allusion summarize the plot of the story. The \"poor player that struts and frets his hour upon the stage\" is symbolically the entire Compson family which sees its demise in the book. The \"poor player\" can also be interpreted as any given character, for example: Mr. Compson, who lives underneath the shadow of his nihilistic philosophy and ends up living his last hour with a bottle in his hand. Rarely is he, moreover anyone who dies, ever mentioned after his or her death as described by the following line, \"And then is heard no more.\" The allusion also mentions \"a tale told by an idiot.\" The idiot can be interpreted as any narrator of a chapter telling his tale. For example, Benjy is often referred to and treated as an idiot both because he is disabled and because he has no concept of time. Quentin is an idiot because he focuses too much on small, insignificant details which ends up being the cause for his suicide. Jason is an idiot because he still has the <q>Old South</q> mentality of racism, sexsim, anti semitism, or any other kind of discrimination against a \"normal\" white male. Dilsey, rather than being an idiot herself, represents and idiot because she is seen and treated as one in her former and current society. The phrase \"full of sound and fury\" represent: Quentin, as in sound mind, Benjy, as he perceives the world through his senses, and Jason, his anger and fury. In addition, each character’s tale signifies nothing as all the events lead to the decline of the Compson family which will be forgotten. This directly corresponds to or agrees with Mr. Compson’s philosophy that life is meaningless.</p>";
        }
        if (e.getSource() == items4[2]) {
            title = "Analysis: Suicide";
            info = "Quentin’s suicide can be attributed to four main components: his father, the absence of his mother, his sister Caddy, and himself. As stated in the previous question, Mrs. Compson was not the best of mothers. She did not raise her children well and didn’t give them the love, affection, and attention all children need as seen in the quote referenced above stated by Quentin, “If only I could say mother mother…” In addition, his father, ignorant of the fact, was not the best mentor for him. Mr. Compson’s philosophy is very nihilistic- everything equates to nothing- there is no meaning in life. In contrast to that, Quentin believed almost the complete opposite. Throughout his life, Quentin tried to look for a meaning in life, a hope, a pathway for humanity to the common good for which he hoped for. He couldn’t because he was constantly reminded by his father’s statements. Even on the first page of the chapter, his father’s nihilistic ideas seep through into Quentin’s mind and are stated, “The field only reveals to man his own folly and despair, and victory is an allusion of philosophers and fools” (Faulkner 76). This quote is just one of many thousands that effect Quentin so much that it leads him to commit suicide. In addition, the fact that his sister Caddy got pregnant from a most disrespectful guy and out of wedlock really messed with his mind. He constantly alludes to Caddy or when he told his father, “I have commited incest” (Faulkner 79). This quote also demonstrates how Quentin himself led to his own madness. In the quote he tries to restore Caddy’s innocence by using himself as a means. It shows how he worries and thinks so much about something that in the end he cant change. In a general scheme, Quentin focuses too much about the small, meticulous, meaningless things, trying to pull out something from nothing. This quality of him is ultimately what drives him to commit suicide. It his tragic hero’s flaw; overthinking. Thus, since he cannot live in the modern world due to the events happening in his family such as the event with Caddy and since he cannot find meaning in a meaningless world he becomes a defeated idealist. His ideal- everything has a meaning and morals will govern the world, but this cannot be achieved due to his sister Caddy not behaving to his moral code and he cannot get past his father’s philosophy that nothing has meaning.";
        }
        if (e.getSource() == items4[3]) {
            title = "Analysis: Old South vs New South";
            info = "The south is split into three parts in Faulkner’s story: the old south, the transition phase, and the new south. The novel is in the transition period from the old south, the pre-civil war to the new south. Faulkner views the old south as the old wretched place which needed to change due to the racism and other bad qualities. The old south is represented by Jason. One quote to support this claim is at the end of the book when Jason hits luster and slashes the horse with a whip, “With a backhanded blow he [Jason] hurled Luster aside and caught the reins and sawed Queenie about and doubled the reins back and slashed her across the hips” (Faulkner 320). Jason’s violent tendencies are shown here which was a part of the typical old south. The new south, in contrast, is the better, perfected south which isn’t racist, which is completely new and revised. Everyone here lives by a moral code and this south can be displayed by people such as Dilsey or Quentin. Benjy represents the transition era, stuck in time and not being able to get out. The transition era is marked a diverse and confused new being. There is no slavery but segregation has not been completely abolished.";
        }
        if (e.getSource() == items4[4]) {
            title = "Analysis: Decay of the Compson Family (Decay of the Southern Aristocracy)";
            info = "The Compson family in The Sound and the Fury is one example of the decline of the southern aristocracy after the Civil War. The decline can be attributed to many factors but mainly due to the change in economic systems. Before the Civil War, the southern aristocracy was mainly based on the exploitation of African American workers. This allowed white plantation owners to profit profoundly. After the Civil War, American law banned slavery and thus the the system of exploitation, which the plantation owners used, was nulled. Now, the rich aristocratic families, such as the Compson family, needed to pay their workers and many other reforms had to be implemented. This badly influenced the families leading to their gradual decline as their expenses outgrew their profits. For example, this can be seen when the Compson family slowly by slowly sells pieces of their land in order to compensate for their financial loss.";
        }
        if (e.getSource() == items4[5]) {
            title = "Analysis: Faulkner's style";
            info = "yes";
        }
        if (e.getSource() == items4[6]) {
            title = "Anyalysis: Religious Allusions";
            info = "In <i>The Sound and the Fury</i>, two main symbols throughout the story are the holy trinity and the devil. Benjy can be analyzed as being a Christ figure as he is: thirty three years old, celibate, hunted and protected as a child, wounded, in agony, and known to spend time in the wilderness. Benjy, as Christ, is “speechless” and ineffective to elicit change in his society. Dilsey can be interpreted as a Godly figure as she is purely good and treats everyone as if they were her child. She serves as an equalizer between the good and the bad, Benjy and Jason. In addition she is alluded to Alpha and Omega, meaning she has always been there since the beginning and stays all the way to the end. Caddy can be seen as the Holy Spirit as she is kind to everyone her and, although she left the family, she is still in everyone’s hearts and thoughts. In contrast, Jason symbolizes the devil because he is violent, racist, sexist and plain evil.";
        }
        if (e.getSource() == items5[0]) {
            title = "Quotes: Benjy's Section";
            info = "yes";
        }
        if (e.getSource() == items5[1]) {
            title = "Quotes: Quentin's Section";
            info = "yes";
        }
        if (e.getSource() == items5[2]) {
            title = "Quotes: Jason's Section";
            info = "yes";
        }
        if (e.getSource() == items5[3]) {
            title = "Quotes: Dilsey's Section";
            info = "yes";
        }
        if (e.getSource() == items5[4]) {
            title = "Quotes: Passage Analysis Jason's Section";
            info = "yes";
        }
        if (e.getSource() == items6[0]) {
            title ="Incorporating Computer Science with <i>The Sound and the Fury</i><br><font size='2' face='TimesRoman' colr='black'>by: Julian Herrera & Jonathan Riess</br>";
            info = "In dedication to our English teacher, Mrs. McElhiney, for helping us understand complex texts, such as <i>The Sound and the Fury</i>, and guiding us on how to write a quick poetry analysis. In dedication to Mr. Greene for teaching us everything we know about programming. <br><br>The purpose of this program is to give users the ability of quick access to useful information from the book, such as the various characters, the summaries and quotes of each section, and the analyses of the varying themes.</br></br>";
        }
	setLables(title, info);
        revalidate();
    }
    /*public JLabel getLabel1() {
        return label1;
    }
    /*public String getTitle() {
        return title;
    }
    public String getInfo() {
        return info;
    }
    /*public void paint(Graphics g) {
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
    }*/
}
