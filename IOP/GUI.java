import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
public class GUI extends JFrame implements ActionListener {
        String title ="Incorporating Computer Science with <i>The Sound and the Fury</i><br><font size='2' face='TimesRoman' colr='black'><center>by: Julian Herrera & Jonathan Riess</center></br>";
        String info = "In dedication to our English teacher, Mrs. McElhiney, for helping us understand complex texts, such as <i>The Sound and the Fury</i>, and guiding us on how to write a quick poetry analysis. <br><br>In dedication to Mr. Greene for teaching us everything we know about programming.</br></br> <br><br>The purpose of this program is to give users the ability for quick access to useful information from the <i>The Sound and the Fury</i>, such as the various characters, the summaries and quotes of each section, and the analyses of the varying themes.</br></br>";
        JMenu[] menus = {new JMenu("Characters"), new JMenu("Summaries"), new JMenu("Symbols"), new JMenu("Analyzations"), new JMenu("Useful Quotes"), new JMenu("About")};
        JMenuItem[] items1 = {new JMenuItem("Jason Compson III (Mr. Compson)"), new JMenuItem("Caroline Bascomb Compson (Mrs. Compson)"), new JMenuItem("Quentin Compson")
        , new JMenuItem("Caddy Compson (Candace)"), new JMenuItem("Jason Compson IV"), new JMenuItem("Benjy Compson (Maury)"), new JMenuItem("Miss Quentin"), new JMenuItem("Dilsey")
        , new JMenuItem("Roskus"), new JMenuItem("T.P."), new JMenuItem("Versh"), new JMenuItem("Frony"), new JMenuItem("Luster"), new JMenuItem("Damuddy"), new JMenuItem("Uncle Maury Bascomb")
        , new JMenuItem("Mr. and Mrs. Patterson"), new JMenuItem("Charlie"), new JMenuItem("Dalton Ames"), new JMenuItem("Shreve MacKenzie"), new JMenuItem("Spoade")
        , new JMenuItem("Gerald Bland"), new JMenuItem("Mrs. Bland"), new JMenuItem("Deacon"), new JMenuItem("Julio"), new JMenuItem("Herbert head")
        , new JMenuItem("Lorraine"), new JMenuItem("Earl"), new JMenuItem("Uncle Job"), new JMenuItem("Reverend Shegog"), new JMenuItem("The Man With The Red Tie")};
        JMenuItem[] items3 = {new JMenuItem("Watch/Clock"), new JMenuItem("Water: Regatta/Charles River"), new JMenuItem("Water: Rain"), new JMenuItem("Quentin's Shadow"), new JMenuItem("Blood"), new JMenuItem("Fire"), new JMenuItem("Flowers/Trees")};
        JMenuItem[] items2 = {new JMenuItem("Chapter 1, Benjy's Chapter"), new JMenuItem("Chapter 2, Quentin's Chapter"), new JMenuItem("Chapter 3, Jason's Chapter")
        , new JMenuItem("Chapter 4, Dilsey's Chapter"), new JMenuItem("Chapter 2, Book Summary")};
        JMenuItem[] items4 = {new JMenuItem("Time"), new JMenuItem("Title"), new JMenuItem("Suicide"), new JMenuItem("Old South vs New South")
        , new JMenuItem("Decay of the Compson Family (Decay of the Southern Aristocracy)"), new JMenuItem("Faulkner’s style"), new JMenuItem("Religious Allusions")};
        JMenuItem[] items5 = {new JMenuItem("Benjy's Section"), new JMenuItem("Quentin's Section"), new JMenuItem("Jason's Section"), new JMenuItem("Dilsey's Section")};
        JMenuItem[] items6 = {new JMenuItem("Dedication and Information")};
        JLabel labelTitle = new JLabel(title,JLabel.CENTER);
        JEditorPane jpane = new JEditorPane();
    public void GUI() {
        labelTitle.setText("<html>"+ title + "</html>");
        labelTitle.setVerticalAlignment(JLabel.TOP);
        labelTitle.setFont(new Font("TimesRoman", Font.BOLD, 24));
        
        // set JEditor Pane 
        jpane.setEditable(false); //readonly
        jpane.setContentType("text/html");
        jpane.setBackground(new Color(239, 241, 244)); // gray background
        
        // set vertical scroll on jpane
        JScrollPane jsp = new JScrollPane(jpane);
        jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jpane.setText("<html > <p style='margin-left: 10px;font-size:15px;'>"+ info + "</p></html>");   
        
        // remove border for scrollpane (black line)
        jsp.setBorder(BorderFactory.createEmptyBorder());
        
        // set scrollpane to top
        jpane.setCaretPosition(0);
        
        // create frame
        JFrame fr = new JFrame("IOP Project");
        
        // set frame information
        fr.setLayout(new BorderLayout(0,5));  
        fr.add(labelTitle, BorderLayout.NORTH);
        fr.add(jsp, BorderLayout.CENTER);
        fr.setSize(1280,720);
        fr.setJMenuBar(Menu());
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Center screen
        fr.setLocationRelativeTo(null); 
        
        // Show Frame
        fr.setVisible(true);
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
	  labelTitle.setText("<html>"+ title + "</html>");
          jpane.setText("<html> <p style='margin-left: 10px;font-size:15px;'>"+ info + "</p></html>");
	}
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == items1[0]) {
            title = "Character: Jason Compson III (Mr. Compson)";
            info = "Jason Compson III is the head of the Compson family at the time of its decline. His fatalistic and nihilistic mindset force him to think that there is little, or nothing, he can do to prevent the downfall of the family. He marries Caroline Bascomb and has four children with her. Each child has some form of weakness: Caddy- gets pregnant, Quentin- fallen idealist, Jason- violent and prejudice, Benjy- disabled. One could argue that Quenting is his favorite child as he spends most of his time given him live advice. He also puts all of the hope for the continuance of the family name in him by selling parts of his land for a Harvard tuition. However, he does not know though that rather than helping Quentin with his philosophy, he is actually doing the opposite, hurting him. Their contrast between a nihilistic view and an idealistic hope for the common good is one of the reason why his son, Quentin, commits suicide. Soon after Quentin’s suicide, Mr. Compson dies of alcoholism.";
        }
        if (e.getSource() == items1[1]) {
            title = "Character: Caroline Bascomb Compson (Mrs Compson)";
            info = "Caroline Compson, part of the Bascomb family tree, is the hypocritical mother of the four Compson children. As Quentin describes in his chapter, she did not take care of her children but rather focused on her own issues. She leaves the job of being a mother to Caddy and Dilsey. One repeated quote about the children's’ symbolic orphanage is, “If only I could say mother mother” (132). In the end of the book after her husband dies, she sides with her third eldest child, Jason. She helps Jason steal the money from Miss Quentin and inability to raise and take care of her children is one of the many reason why the Compson family meets its decline.";
        }
        if (e.getSource() == items1[2]) {
            title = "Character: Quentin Compson";
            info = "Quentin Compson is the oldest son in the Compson family and only hope for Compson family name. He goes off to Harvard and his father sells part of the family’s property in order to pay for the school tuition. Before finishing his first year there, he ends up committing suicide because he focuses too much on small, insignificant details in his life. One thought which severely plagues his mind is Caddy losing her virtue by losing her virginity out of wedlock. This shows both Quentin’s obsession for his sister Caddy and also his strong value in tradition. Quentin can be seen as a fallen or failed idealist as he longs for a source of hope in the common good, but he is only disappointed by humanity. Quentin tries to reason that if he tells his father that he and Caddy had commited incest that her innocence would be restored. His father’s response that “virginity is an unimportant concept created by man” and his father’s indifference for Caddy’s pregnancy depealy upsets Quentin and is one of the main causes in his suicide. Overall, Quentin completely disagrees with his father’s nihilistic beliefs and Quentin’s chapter is filled with memories of his father’s quotes. In addition, Quentin is obsessed with the thought of sisters, not just his own but also the thought that every girl is a sister. He gets in fights with other men trying to protect the women’s virtues and even ends up “kidnapping” a young italian girl named Natalie.";
        }
        if (e.getSource() == items1[3]) {
            title = "Character: Caddy Compson (Candace)";
            info = "Caddy Compson is the second oldest child in the family and the ultimate caretaker of Benjy. She is the only nice and sweet person to Benjy other than Dilsey and symbolically represent the mother of the Compson children. She loses her virginity to Dalton Ames, a tennessee boy, which deeply upsets Quentin. She tries to marry a banker quickly but once her husband finds out that the child isn’t his, he divorces her. She is excommunicated by the family and gives her child, Miss Quentin, for Jason to raise up. She sends Jason money each month, a type of child support, but without her knowledge, Jason keeps this money for himself. Due to mistreatment, her child, Miss Quentin, runs away from the Compson family. Faulkner describes her as his “heart’s darling,” meaning she was his favorite character. Caddy never narrates her own chapter for various reasons. One being that she gets excommunicated from the family and she having her own chapter would not fit the plot line. In addition, her absence of a chapter highlights and signifies her importance that she is the main focus Quentin’s,Benjy’s, Jason’s, and the entire Compson family’s life.";
        }
        if (e.getSource() == items1[4]) {
            title = "Character: Jason Compson IV";
            info = "Jason Compson is a violent racist, sexsit, anti semitic, or any other form of discrimination against a non “normal” white male, human being. Every since the Compson children were young, he has been an outsider to his siblings and only focused on money. He was also his mother’s favorite child which becomes evident in the later chapters when they work together to steal money from Miss Quentin, Caddy’s child. In chapter three, the reader gets a clear view inside Jason’s mind and the events that happen after Quentin’s and Mr. Compson’s death narrated by him. Jason starts working at a farm supply store. He becomes the head of the family and tyrannizes all other characters. He doesn’t allow Caddy to hold her own child and only allows her to see it for a few seconds. He frequently disrespects, deciets, and even hits Miss Quentin. He shows minimal affection to Benjy or any other character and only cares about himself. His very narrow-minded self only focuses on the “here and now.” He is symbolic of the devil and the Old South as he represents the negative qualities of the human condition.";
        }
        if (e.getSource() == items1[5]) {
            title = "Character: Benjy Compson (Maury Compson)";
            info = "Benjy Compson is the youngest son of Jason and Caroline Compson. He is a thirty-three year old disabled man who is often compared as a christ figure. He was first names Maury, after his uncle, but soon after his family found out he was disabled, his mother renamed him to Benjamin Compson because she thought it was an insult to her brother. The first chapter is told from his perspective and since Benjy lacks the concept of time, so does the chapter. He cannot talk either and thus the chapter uses rather short sentence structure and syntax with rather low level vocabulary. His chapter is filled with flashbacks, giving the reader a better perspective of the past. His chapter ends with his “assault” on two young school girls which leads to Jason castrating him.";
        }
        if (e.getSource() == items1[6]) {
            title = "Character: Miss Quentin";
            info = "The rebellious teen and daughter of Caddy. Her father is unknown but many characters speculate it is Dalton Ames. Caddy leaves Miss Quentin to Jason III and Mrs. Compson, because she could not take care of her. Caddy offers to send Jason money each month, but instead of giving it to Miss Quentin as agreed, Jason hides the money and keeps it for himself. Towards the end of the book, Miss Quentin finds out about his deceit and decides to steal the money from Jason’s room and runs away with it. She supposedly runs away with “the man with the red tie,” a member of a traveling minstrel show, who she also is engaged to. She not only runs away because of the money, she also runs away because throughout her entire life she has been yelled at, disrespected, neglected, and sometimes hit by Jason. This leads her to become a rebellious teen and ends up causing her to become friends with people with bad influences which leads her to skip school.";
        }
        if (e.getSource() == items1[7]) {
            title = "Character: Dilsey";
            info = "Dilsey, the Compson family’s main servant who takes care of all the children as if they were her own, is the only pure good and kind-hearted person throughout the book. She serves as a balance to Jason and the rest of the corrupted Old South’s values and represents the hope for the New South. She is often compared to being a sort of Jesus or God figure as she treats everyone well and stands up against the Devil, Jason. She marries Roskus and has many children with him, some of which also work for the Compson family. By the end of the story she grows old and she believes she is about to die from her arthritis. She is described as the only person who has completely seen the decline of the Compson family from the beginning to the end. The last chapter is regarded as her section, although it is in third person, as she is the main focus.";
        }
        if (e.getSource() == items1[8]) {
            title = "Character: Roskus";
            info = "Dilsey’s husband who also works for the Compson family. He believes the Compson family has been cursed and becomes sick with rheumatism which eventually kills him.";
        }
        if (e.getSource() == items1[9]) {
            title = "Character: T.P.";
            info = "Roskus and Dilsey’s son who takes over for Roskus when he becomes ill and cannot work anymore because of his arthritis. He also becomes Benjy’s second caretaker after Versh. The event he is most known for is getting drunk at Caddy’s wedding and fighting with Quentin.";
        }
        if (e.getSource() == items1[10]) {
            title = "Character: Versh";
            info = "Son of Dilsey and Roskus and he was the first caretaker of Benjy.";
        }
        if (e.getSource() == items1[11]) {
            title = "Character: Frony";
            info = "Frony is one of Dilsey’s daughters and the mother of Luster. She, as all of Dilsey’s children, works for the Compson family as a kitchen servant.";
        }
        if (e.getSource() == items1[12]) {
            title = "Character: Luster";
            info = "Luster is Frony’s son and Benjy’s caretaker. He is only half of Benjy’s age and enjoys teasing and making him cry. During one scene in the book, Luster repeats “Caddy, Caddy” to make Benjy upset. In the last scene of the book, Luster takes control of the cart and whips the horses to run faster. Instead of going along the traditional route, Luster takes a right which both makes Benjy cry and it also symbolises him trying to save the Compson family from decay.";
        }
        if (e.getSource() == items1[13]) {
            title = "Character: Damuddy";
            info = "The Compson children’s grandmother who died when they were young.";
        }
        if (e.getSource() == items1[14]) {
            title = "Character: Uncle Maury Bascomb";
            info = "Mrs. Compson’s brother who had an affair with Mrs. Patterson, the Compson’s neighbors. He is economically dependent on the Compson family and is also an alcoholic as he drinks during Mr. Compson’s funeral. Benjy was originally named after him.";
        }
        if (e.getSource() == items1[15]) {
            title = "Character: Mr. And Mrs. Patterson";
            info = "The Compson family’s neighbors who fear Benjy. Mrs. Patterson is found to have an affair with Uncle Maury Compson when her husband intercepts a note from Uncle Maury.";
        }
        if (e.getSource() == items1[16]) {
            title = "Character: Charlie";
            info = "Caddy’s first boyfriend or suitor with whom Benjy sees together on the swing.";
        }
        if (e.getSource() == items1[17]) {
            title = "Character: Dalton Ames";
            info = "A local jefferson to whom Caddy loses her virginity to. When Quentin finds out that Caddy is pregnant, he accuses Dalton and challenges him to a fight. Quentin calls him a “Blackguard” but Dalton refuses to fight him. Contrary to how he is portrayed in the book, Dalton is kind and concerned for Caddy. When asked, Caddy claims she does not love him but it is evident that she does.";
        }
        if (e.getSource() == items1[18]) {
            title = "Character: Shreve MacKenzie";
            info = "Quentin’s canadien roommate at Harvard who is seen as inferior because he is canadien. He does not know that Quentin is suicidal but he is concerned for him.";
        }
        if (e.getSource() == items1[19]) {
            title = "Character: Spoade";
            info = "One of Quentin’s friends at Harvard who goes to the picnic on the day of Quentin’s suicide.";
        }
        if (e.getSource() == items1[20]) {
            title = "Character: Gerald Bland";
            info = "Gerald Bland is another ones of Quentin’s “friends” at Harvard. He is from the nouveau riche from Kentucky and gets into a fight with Quentin because Bland speaks bad about women.";
        }
        if (e.getSource() == items1[21]) {
            title = "Character: Mrs. Bland";
            info = "Mother of Gerald Bland who thinks of Shreve Mackenzie as inferior because he’s canadien. She comes to visits to have a picnic with the Harvard students and meets Quentin the day of his suicide. She is intrigued by Quentin because he is part of the southern aristocracy, something her family is trying to become part of. ";
        }
        if (e.getSource() == items1[22]) {
            title = "Character: Deacon";
            info = "A black man at Cambridge, Massachusetts who befriends all southern students at Harvard. To make the new southerns feel more at home, he dresses in an “Old Uncle Tom’s” style. In addition, Quentin gives him his suicide note";
        }
        if (e.getSource() == items1[23]) {
            title = "Character: Julio";
            info = "Julio is an italian immigrant and the older brother of the nameless girl that Quentin finds on the streets and walks around with. He accuses him of kidnapping her.";
        }
        if (e.getSource() == items1[24]) {
            title = "Character: Herbet Head";
            info = "A well known and respected banker who Caddy is urged to and  marries because she is pregnant with a child out of wedlock. He tries to befriend Quentin and offers Jason a job but both attempts failed. Herbert Head later divorces himself from Caddy because he realizes that she is already pregnant.";
        }
        if (e.getSource() == items1[25]) {
            title = "Character: Lorraine";
            info = "Jason’s prostitute who lives in Memphis";
        }
        if (e.getSource() == items1[26]) {
            title = "Character: Earl";
            info = "A local who is friends with Mrs. Compson and owns a farm supply store. Jason Compson IV works for him and Earl does not fire Jason because he is sympathetic towards Mrs. Compson.";
        }
        if (e.getSource() == items1[27]) {
            title = "Character: Uncle Job";
            info = "ason’s colleague at Earl’s shop. He is african-american.";
        }
        if (e.getSource() == items1[28]) {
            title = "Character: Reverend Shegog";
            info = "The black reverend who delivers a powerful sermon on Easter Sunday. Dilsey and Benjy are both affected by his words.";
        }
        if (e.getSource() == items1[29]) {
            title = "Character: The Man With The Red Tie";
            info = "The man with whom Miss Quentin runs away with and is engaged to.";
        }
        if (e.getSource() == items2[0]) {
            title = "Summary: Chapter 1, Benjy's Chapter";
            info = "The narrator of the first chapter is Benjy Compson, a thirty-three year old disabled man who also is the youngest Compson child. Although the setting of this chapter is April 7, 1928, Benjy's psychological disability makes it troublesome for him to process time, thus this chapter covers times that happen before 1928 but written in present tense. The difficulty in reading this chapter arises from Faulkner's utilization of continuous flow between events in the present and past, a form of stream of consciousness.<br><br>Some of the major key events in this chapter are: Benny’s name was changed from Maury to Benjamin when he was little after he was discovered to be disabled. Damuddy, the Compson children’s grandmother, dies and Mr. Compson sells some of the land to compensate for the school fees for Quentin’s Harvard education. This chapter focuses heavily on events when the children were little, especially on the Compson boys’ sister Caddy. A few keys focuses is Caddy’s purity which Benjy describes as, “She smelt like trees” (45). Once the children grew a little bit older, Caddy started showing interest in boys which Benjy and Quentin didn’t appreciate of. Not soon later, she becomes pregnant by a Jefferson local boy, Dalton Ames. This becomes a key event in the following chapter, but in order to hide her impurity out of wedlock, she becomes married to a wealthy Banker. After her husband divorced from her when he finds out that she is pregnant with another man’s child, her family excommunicates her. One of the last key events described in the chapter is when Benjy mistakes two school girls for his sister and “assults” them. Although a majority of the family members are against Benjy getting castrated for this action, Jason ends up taking him to the doctor to get castrated.";
        }
        if (e.getSource() == items2[1]) {
            title = "Summary: Chapter 2, Quentin's Chapter";
            info = "Quentin Compson awakens in his apartment at Harvard, hearing his watch ticking. He understands that it is somewhere in the range of seven and eight o'clock in the morning. Quentin recalls his father giving him the watch and telling him some of his life’s philosophy. Quentin starts thinking about time, private versus public time, and soon skips to thinking about sisters, a frequent occasion in this chapter. He then jumps back to a memory of his sister wedding declaration: "Mr and Mrs Jason Richmond Compson report the marriage of…” (122). addy was only married and excommunicated two months ago. Quentin then remembers a time before Caddy’s wedding when he tried to tell his father that Caddy and him had commited incest and that the father was him and not Dalton Ames. Quentin did this in order to compensate for the loss of Caddy’s purity, as he reasoned that if she had commited incest rather than normal sex, she would still be pure. These thoughts anger Quentin, leading him to break the glass face of his watch against his desk. He cuts himself and tries to wipe off the blood on a white vest. Although the clock is still functional, he brings the watch to a clock shop where he ironically instructs the clerk not to fix his watch. Afterwards, he goes to the tailors store and buys a fine “Tailor’s load” which should be "sufficiently overwhelming" (128), but he does not stait why he buys it. Quentin then rides the train home to Harvard and remembers times of when he was a young school boy. As he got off the train station and walks across a bridge, he sees Gerald Bland, a fellow harvard understudy, but then quickly noticies the shadow of the bridge in the water and thinks about suffocating, a foreshadowing of his soon to come suicide. He then switches to memories of his childhood and Caddy’s marriage. Afterwards, he thinks about how his mother never really cared for her children but swiftly switches back to memories of Caddy and her wedding. This leads him to think about his father’s advice about Caddy’s pregnancy and the concept of virginity. Mr. Compson believed that virginity is an unimportant concept created by man and thus was unconcerned for Caddy being pregnant. Quentin then walks past a bread kitchen and meets a young italian girl names Natalie with whom he later walks around in the city with. Not soon after, her brother, Julio, finds Quentin and his sister strolling around the streets and he punches Quenting, believing that he was trying to kidnap her. After that scene Quentin sees Shreve, Spoade, Gerald Bland, and Mrs. Dull driving with some young ladies to the squire's office. Later, Quentin buys weights in forms of hot irons which he puts into his new bought tailored coat pockets. The chapter ends with Quentin jumping off of the bridge near the Harvard campus and recalls his last moments during his suicide.";
        }
        if (e.getSource() == items2[2]) {
            title = "Summary: Chapter 3, Jason's Chapter";
            info = "It is the morning of Good Friday, 1928, the day before Benjy’s Chapter. Jason Compson is in the Compson house, battling with his mom and with his niece, Miss Quentin. Jason remembers the family history of the Compson’s and how his sister Caddy's marriage to Herbert Head disintegrated in 1911, when it ended up evident to Herbert that Caddy's unborn child was not his. Mrs. Compson declined to take Caddy in, yet Mr. Compson and Dilsey made sure that the family took in Caddy's youngster, Miss Quentin. Jason accepted control of the family unit when Mr. Compson died of alcoholism. Herbert Head had offered Jason an occupation at his bank, yet cancelled that offer when he separated from Caddy. This withdrawal left Jason to work at the nearby ranch supply store. Despite Mrs. Compson trusting Jason will be the owner of the store one day, Jason is mad about having lost his bank employment and having been compelled to work in the ranch supply store instead. In the present in his mid thirties, Jason has developed into an underhanded and gutless man. He has prepared a detailed plan to take the cash that Caddy sends to her niece. Mrs. Compson's poor vision and visually impaired love for Jason has kept her from recognizing his plan. Jason has stolen about fifty thousand dollars thus far from his sister and niece in the span of fifteen years. He uses the money to play the cotton showcase and to pay for a prostitute in Memphis. Caddy is the only one that distrusts Jason and suspects that he is plotting. Jason always contends with Mrs. Compson and Miss Quentin over what should be done with Miss Quentin and how she ought to be dealt with. Jason threatens and insults Miss Quentin and almost beats her with his belt until Dilsey intervenes. Jason is compelled to let Miss Quentin go, however makes a guarantee that things are not yet settled between them. Jason comes back to his work at the ranch supply store and discovers four letters, including one from Caddy and one from Uncle Maury. Jason remembers his dad's funeral, after which he agreed to take care of Miss Quentin as long as Caddy remained away and kept on sending cash. The letter from Caddy contains a money order for Miss Quentin instead of the customary check. This unforeseen development messes up Jason's plan, as Miss Quentin should sign the money order before it can be cashed in. Jason bullies Miss Quentin into signing because it is only a mere 10 dollars. He forces Miss Quentin to sign it without taking a look at how much it is and sends her on her way. Back at the Compson house for supper, Jason can barely tolerate his mom's self pitying and the annoying sight of his idiot brother Benjy. Jason is profoundly humiliated about Benjy and wants to send him to the psychological clinic in Jackson at the earliest opportunity. After returning to work, Jason contends with his supervisor, Earl, about to what extent he can take for his dinner break. Earl blames Jason for having stolen cash from his mom to pay for his vehicle. A few minutes after the fact, while Jason is in the back room tormenting Earl's black assistant, he sees Miss Quentin pass by with a man wearing a red tie. Jason pursues them through the back alleys of Jefferson. He is slowed down by a boy with a telegram, who reveals to Jason that his account in the cotton market is down significantly. Jason returns home mad, and, driving once more into town, is almost run down by a Ford driven by the man with the red tie. Jason pursues the Ford and looks for Miss Quentin and the man in some underbrush. He gets out, planning to catch Miss Quentin in the act with the man. Jason all of a sudden hears their vehicle start and blow its horn. He keeps running back to his vehicle and finds that Miss Quentin and the man have let the air out of one of his tires. Jason makes it back to town, completes his day at work, and returns home. Luster tells Jason that Miss Quentin and Mrs. Compson are upstairs fighting, and that Dilsey is attempting to keep the peace. Luster wants to go to the minstrel show and tells Jason he needs a quarter to purchase a ticket. Jason has two tickets that he doesn't need, yet he knows Luster does not have any cash, so he burns the two tickets in the stove while Luster watches. This shows Jason’s cruel and evil nature. Jason heads inside and Dilsey serves supper. Jason does not explicitly mention that he saw Miss Quentin with the man in the red tie, but alludes to it indirectly several times. Miss Quentin angrily asks Mrs. Compson why Jason is always so hostile to Miss Quentin, and claims that she misbehaves because Jason made her that way. Miss Quentin goes up to her room to study, but Jason suspects that she plans to sneak out of the house. She does sneak out and Jason gets angry but Dilsey again tries to keep the peace.";
        }
        if (e.getSource() == items2[3]) {
            title = "Summary: Chapter 4";
            info = "The setting of Dilsey’s chapter is Easter Sunday, 1928, which is one day after Benjy's chapter. The chapter starts with Dilsey walking towards the Compson house and she starts cooking although Mrs. Compson and Luster get in her way. Jason yells out, furious that somebody must have broken the window overnight. He sends Dilsey to go call Miss Quentin for breakfast. As Dilsey calls for her, there is no answer. Jason, all of a sudden grabs his mother’s keys, runs up the stairs, and forces open Miss Quentin's door. The window is open and Miss Quentin is gone. As Dilsey comforts Mrs. Compson, Jason hurries to his treasury and finds that the box is flung open. His papers are there, yet all of his cash ia gone. Jason calls the police and requests that they send an appointee to the house. He storms out. In the mean time, Dilsey takes Luster, Frony, and Benjy to an Easter administration at the nearby dark church, where Reverend Shegog gives a clamorous message about the life and demise of Christ. When they come back to the house, they find that Jason still has not returned. Jason has gone to see the sheriff to request help in finding Miss Quentin. Be that as it may, the sheriff is suspicious of Jason's case and pointedly disparaging of the manner in which he runs the Compson family. The sheriff declines to help without increasingly considerable proof of Miss Quentin's bad behavior. Jason jumps into his car and goes to discover Miss Quentin. In transit, Jason considers Lorraine, his escort in Memphis. This idea helps him to remember that he is so irate to have been ripped off by a lady once more. Jason drives to the town where the minstrel show is halting straightaway, since he trusts that Miss Quentin's darling—the man with the red tie—works for the show. Jason impolitely asks an elderly person where Miss Quentin and her sweetheart are, however the elderly person complains and winds up rough, and Jason thumps him down. Jason attempts to leave, yet the elderly person comes after him with an ax. The man who runs the minstrel show quickly drives Jason around the bend and persuades him that Miss Quentin and her darling are not there. Jason pays a dark man to drive him back to Jefferson. Back around the local area, Luster is driving Benjy in the carriage. As they land at the burial ground, Luster goes astray from the standard course T.P. used to take, and Benjy starts yelling at the new course. Jason goes over Luster and Benjy. He hits Luster over the head, requesting him never to kill the course Benjy is accustomed to taking, and strikes Benjy trying to calm him. Benjy keeps on wailing. In any case, as Luster drives Benjy home, the commonplace façades, entryways, windows, signs, and trees of the town of Jefferson all appear to Benjy in their arranged place, and he at long last calms.";
        }
        if (e.getSource() == items2[4]) {
            title = "Summary: Book Summary";
            info = "The initial three sections of the novel are comprised of the tangled voices and recollections of the three Compson siblings, each narrated on a different day. The first narrator is Benjy, a disabled thirty-three-year, talking on April seventh, 1928. The second chapter is by Quentin, a youthful Harvard understudy, whose chapter starts on June, 1910, the day of his suicide. The third section is narrated by Jason, a harsh homestead supply store laborer, whose setting is on April sixth, 1928. The fourth section is narrated by a third person omniscient voice which centers around Dilsey, the Compson family's African American cook. The book comments on the decay of the Southern aristocracy after the Civil War by writing about the Compson family. The Compsons are one of a few notorious names in the town of Jefferson, Mississippi. Their predecessors helped settle the territory and in this manner guarded it amid the Civil War. Since the war, the Compsons have steadily observed their riches, land, and status disintegrate away. Mr. Compson is a heavy drinker. Mrs. Compson is a self-assimilated despondent person who depends on the whole upon Dilsey to bring up her four youngsters. Quentin, the most established character, is a touchy heap of mental issues. Caddy is obstinate, however adoring and merciful. Jason has been troublesome and violent since birth and is to a great extent spurned by the other kids. Benjy is seriously rationally crippled, a \"moron\" with no comprehension of the ideas of time. Caddy fills in as a mother figure and image of love for Benjy and Quentin as their mother only worried about herself. As the children become more established Caddy starts to carry on indiscriminately, which torments Quentin and sends Benjy into attacks of groaning and crying. Quentin is planning to go to Harvard, and Mr. Compson sells a substantial segment of the family land to give assets to the educational cost. Caddy loses her virginity and winds up pregnant. She can't or is reluctant to name the dad of the child, however Dalton Ames, a jefferensom teenager, is likely the husband. Caddy's pregnancy leaves Quentin candidly broke. He endeavors to guarantee false obligation regarding the pregnancy, deceiving his father that he and Caddy have committed incest. Mr. Compson is apathetic regarding Caddy's wantonness, rejecting Quentin's story and advising his child to leave ahead of schedule for the Northeast. Endeavoring to conceal her thoughtless activities, Caddy rapidly weds Herbert Head, a banker she met in Indiana. Herbert offers Jason Compson a job at his bank. Later, after find out that Caddy is pregnant with another man’s child, Mr. Spencer files for a divorce and fires Jason. In the meantime, Quentin, still buried in sadness over Caddy's wrongdoing, commits suicide by drowning himself in the Charles River just before the finish of his first year at Harvard. The Compsons abandon Caddy from the family, yet take in her infant little girl, Miss Quentin. The assignment of raising Miss Quentin falls solidly on Dilsey's shoulders. Mr. Compson passes away from alcoholism about a year after Quentin's suicide. As the only competent child left, Jason becomes the leader of the Compson family. Jason devises a cunning plan to take the cash Caddy sends to help Miss Quentin's childhood. Miss Quentin grows up to be a despondent, insubordinate, and rebellious young teenager, always in struggle with her oppressive and horrendous uncle Jason. On Easter Sunday, 1928, Miss Quentin takes a few thousand dollars from Jason and flees with a mysterious man with whom she is allegedly eloped. While Jason reports the theft of Miss Quentin to the local police, Dilsey takes Benjy and Luster to an Easter sermon. The book ends with a symbolic scene of Luster taking the reins of a carriage and driving wildly around the property of the Compson Family, making Benjy cry.";
        }
        if (e.getSource() == items3[0]) {
            title = "Symbols: Watch/Clock";
            info = "The first instance of a symbolic meaning behind a clock is when Mr. Compson gives Quentin the pocket watch. This is a symbolic act of tradition, as the clock was once Mr. Compson’s grandfather’s clock and so on. Quentin’s action of breaking the clock symbolizes his anger at his dad and his father’s philosophy of nihilism. This also symbolizes that Quentin wants to escape time. Soon after, the bells of Harvard ringing, making him late, symbolize that everyone’s time is different, but everyone must meet a standard time.";
        }
        if (e.getSource() == items3[1]) {
            title = "Symbols: Water - Regatta/Charles River";
            info = "In the scene while Caddy was playing in the river, her wet drawers symbolize purity. In addition, water is used to symbolize jealousy in Jason’s quote when he says “At Harvard, they teach you how to go for a swim at night without knowing how to swim” (Faulkner 188). Furthermore, the water in the shadows underneath the bridge where Quentin will eventually commit suicide foreshadows his “escape” from his problems and his suicide. ";
        }
        if (e.getSource() == items3[2]) {
            title = "Symbols: Water - Rain";
            info = "When Quenting is in the barn Natalie, the rain symbolizes a loss and washing away of purity. Another instance is when Caddy and Quentin fight about Caddy losing her virginity. In this case, the rain is used in an ironic manner as it is supposed to calm the characters but rather they become aggravated. In addition, while the Compson family was out hunting, the rain symbolized danger, as it could lead to flooding.";
        }
        if (e.getSource() == items3[3]) {
            title = "Symbols: Quentin's Shadow";
            info = "The shadows in <i>The Sound and the Fury</i> are usually symbolic or foreshadow death. The shadow which Quentin sees in the sunlight on the Harvard Campus symbolises his inability to escape his problems and that they follow him around everywhere. The shadow which Quentin sees of himself in the river foreshadows his suicide. The shadow described during Quentin’s suicide and his final moments is described as trailing behind and leaving him which is symbolic of Quentin’s problems leaving him and he finally being free.";
        }
        if (e.getSource() == items3[4]) {
            title = "Symbols: Blood";
            info = "In the scene when Quentin cuts himself trying to break the pocket watch, his spilling of blood symbolizes him unable to escape time and his problems. As he follows, trying to smear off the blood on his white vest symbolizes sins and the act is symbolic of him blaming others for problems in his life. Furthermore, the bloody fists during the fight between Julio and Quentin symbolize jealousy.";
        }
        if (e.getSource() == items3[5]) {
            title = "Symbols: Fire";
            info = "Fire calms down Benjy as seen on page 56, “Dilsey opened the fire door and drew a chair up in front of it and I sat down. I hushed.” It also upsets Benjy when the fire disappears as seen on page 57, “The candle went away. I began to cry” (Faulkner 57), or on page 58, “The long wire came across my shoulder, and the fire went away. I began to cry” (Faulkner 58). Fire can also be interpreted as being symbolic of Caddy as both calm Benjy down and Benjy cries when they are gone.";
        }
        if (e.getSource() == items3[6]) {
            title = "Symbols: Flowers/Trees";
            info = "During Caddy’s wedding, Quentin hates the flower bouquet that she has as it symbolizes adulthood and the loss of her virginity as seen in the following quote, “Roses. Not virgins, like dogweed or milkweed… Roses” (77). In addition, Benjy is intrigued by flowers, especially by the cornflower blue as seen during the first scene of the book, when Benjy gets snatched on a nail, and the last, the wild carriage ride. These flowers symbolize his innocence as seen on page 274, “His eyes were the clear, of the pale, sweet blue of cornflowers” (274). The honeysuckle is another symbolic flower which represents the loss of Caddy’s purity as Quentin describes that the “honeysuckle was the saddest odor of them all, I think” (169).";
        }
        if (e.getSource() == items4[0]) {
            title = "Analysis: Time";
            info = "Chapter 1: Benjy has no concept of time. In his mind there exists no past or future. This can be described as either Eternalism theory or B theory of time which states, “Time is an illusion. The past, present and future are equally real, and that time is tenseless.” Benjy only lives in the present and all the verbs in his chapter are conjugated in the present. He can experience times in the past through his memories which are triggered by events in the present, but this seems to confuse him as much as it does the reader. One example of this switching can be read in the opening scene when Benjy snatches himself on a nail on the fence.<br><br>Chapter 2: Quentin's perspective of time is that his actions are driven by moments in the past. Due to his complex mind, which is brought alive by the high level of vocabulary, diction, and syntax, he covers or thinks about a lot more material than other characters such as Benjy in a given period of time. His thoughts trail on and on, as do his sentences; hence, the syntax of his chapter is very compound and complex. In his section, the theme of private time versus public time gets introduced. Faulkner highlights the difference between Quentin’s private time on his small pocket watch, given to him by his father, is different than the big public bells of harvard ringing for everyone to follow.</br></br><br><br>Chapter 3: In this chapter, time leads to demise. By this point, much of the Compson family is in ruins: Caddy got excommunicated from the family, Quentin commits suicide, Mr. Compson dies of alcoholism….The only person left now to save the family reputation is Jason, but due to his lack of respect and selfishness, he brings the family into further chaos. He destroys the bonds left between Caddy and her daughter, Miss Quentin, through deceit. All the events lead to a further and faster demise of the family. This time concept also corresponds with the second law of thermodynamics which states that everything goes from order to disorder. In addition, in this chapter, William Faulkner writes from a first person perspective narrated by Jason, showing his personal concept of time. Jason only focuses, as a primitive man, on the “here and now.” He does not think about the consequences of his actions in reference to the future, nor does he plan for it. This corresponds to the Growing-Block Universe Theory which states that the past and present do exist, but the future is not real. Jason also does not change throughout the book. Not only does this mean that he is a static character but it also tells the reader something about his time concept; time does not change and characters do not change in the future. He openly states this belief in the first line of his chapter when he narrates, “Once a bitch, always a bitch, is what I say” (Faulkner 180). His absolute and judgmental thinking does not change from when he is little, he has always had the same thoughts. In addition, he is described as always having been focused on money, one of the reason why he is disliked by his siblings. Overall, Jason’s concept of time denies the thought of change and hinders progress. He only lives in the present and does not focus on the future which is one reason why Jason brings a partially functioning family into new complete chaos. Jason represents the end.</br></br><br><br>Chapter 4: In Dilsey’s chapter, time is represented as normal and linear which is known as A theory or Presentism. This theory describes that the present is the only physical reality and that one experiences the passage of time as if one were moving on a timeline. It also describes how everyone’s actions, one reason the chapter is written in third person, lead to events in the future. For example, the chapter describes how every single action from Jason makes the Compson family decline faster, with the final reversal to the “Old South” traditions being in the last seen of the book where Jason takes hold of the cart that Luster is driving Benjy in and bringing it back on track by making a left turn. In addition, Dilsey also represents the concept of everlasting time or infinity. She is the only character who witnesses the decline of the Compson family from start to finish objective which is described by the quote, “I seed de beginnin en now, I sees de endin” (Faulkner 287).</br></br>";
        }
        if (e.getSource() == items4[1]) {
            title = "Analysis: Title";
            info = "The title, <i>The Sound and the Fury</i>, is a direct allusion to a verse written by William Shakespeare in the play Macbeth:<br><br></br></br><blockquote><p style='margin-left: 10px;font-size:15px;'>Life’s but a walking shadow; a poor player,<br>That struts and frets his hour upon the stage,</br><br>And then is heard no more; it is a taleTold by an idiot, full of sound and fury,</br><br>Signifying nothing (V, v, 23-26).</br></blockquote><br></br></p><p style='margin-left: 10px;font-size:15px;'>The beginning two lines of the allusion summarize the plot of the story. The \"poor player that struts and frets his hour upon the stage\" is symbolically the entire Compson family which sees its demise in the book. The \"poor player\" can also be interpreted as any given character, for example: Mr. Compson, who lives underneath the shadow of his nihilistic philosophy and ends up living his last hour with a bottle in his hand. Rarely is he, moreover anyone who dies, ever mentioned after his or her death as described by the following line, \"And then is heard no more.\" The allusion also mentions \"a tale told by an idiot.\" The idiot can be interpreted as any narrator of a chapter telling his tale. For example, Benjy is often referred to and treated as an idiot both because he is disabled and because he has no concept of time. Quentin is an idiot because he focuses too much on small, insignificant details which ends up being the cause for his suicide. Jason is an idiot because he still has the <q>Old South</q> mentality of racism, sexsim, anti semitism, or any other kind of discrimination against a \"normal\" white male. Dilsey, rather than being an idiot herself, represents and idiot because she is seen and treated as one in her former and current society. The phrase \"full of sound and fury\" represent: Quentin, as in sound mind, Benjy, as he perceives the world through his senses, and Jason, his anger and fury. In addition, each character’s tale signifies nothing as all the events lead to the decline of the Compson family which will be forgotten. This directly corresponds to or agrees with Mr. Compson’s philosophy that life is meaningless.</p>";
        }
        if (e.getSource() == items4[2]) {
            title = "Analysis: Suicide";
            info = "Quentin’s suicide can be attributed to four main components: his father, the absence of his mother, his sister Caddy, and himself. Mrs. Compson was not the best of mothers. She did not raise her children well and didn’t give them the love, affection, and attention all children need as seen in the quote referenced above stated by Quentin, “If only I could say mother mother…”(91). In addition, his father, ignorant of the fact, was not the best mentor for him. Mr. Compson’s philosophy is very nihilistic - everything equates to nothing - there is no meaning in life. In contrast to that, Quentin believed almost the complete opposite. Throughout his life, Quentin tried to look for a meaning in life, a hope, a pathway for humanity to the common good for which he hoped for. He couldn’t because he was constantly reminded by his father’s statements. Even on the first page of the chapter, his father’s nihilistic ideas seep through into Quentin’s mind and are stated, “The field only reveals to man his own folly and despair, and victory is an allusion of philosophers and fools” (Faulkner 76). This quote is just one of many thousands that effect Quentin so much that it leads him to commit suicide. In addition, the fact that his sister Caddy got pregnant from a most disrespectful guy and out of wedlock really messed with his mind. He constantly alludes to Caddy or when he told his father, “I have commited incest” (Faulkner 79). This quote also demonstrates how Quentin himself led to his own madness. In the quote he tries to restore Caddy’s innocence by using himself as a means. It shows how he worries and thinks so much about something that in the end he cant change. In a general scheme, Quentin focuses too much about the small, meticulous, meaningless things, trying to pull out something from nothing. This quality of him is ultimately what drives him to commit suicide. It his tragic hero’s flaw; overthinking. Thus, since he cannot live in the modern world due to the events happening in his family such as the event with Caddy and since he cannot find meaning in a meaningless world he becomes a defeated idealist. His ideal- everything has a meaning and morals will govern the world, but this cannot be achieved due to his sister Caddy not behaving to his moral code and he cannot get past his father’s philosophy that nothing has meaning.";
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
            info = "Faulkner's style can be split up into different types for each chapter. The different uses of his styles makes each character unique and come alive.<br><br>Chapter one: The syntax is short. Sentences are only in the present tense with low level vocabulary to personify the fact that Benjy is disabled and cannot tell time. The use of only present tense verbs confuses the reader which makes the reader understand what Benjy is going through. This is very common in Faulkner’s style and the essence behind his writing style.</br></br><br><br>Chapter two: Quentin’s long complex structured sentences and high level of vocabulary allow the reader to dive into Quentin’s stream of consciousness. The diction of the connotative verbs for anxiety also help the reader understand what Quentin is experiencing.</br></br><br><br>Chapter three: Chapter three’s style characterizes Jason’s madness. Purely by reading this section the reader is inclined to get mad by the actions and thoughts of Jason. Throughout the chapter, Faulkner uses common, vulgar language and a negative tone when Jason is speaking to characterize his personality as narrow minded.</br></br><br><br>Chapter four: This chapter’s style is different in that it is in third person. Faulkner does this for varying reasons such as: trying to show off his writing abilities, showing that Dilsey cares not just about herself but about others too, demonstrating that Dilsey sees the Compson family from an objective viewpoint, and helping the reader to understand that every character’s actions matter and affect the course of time. The overall style and syntax varies throughout with different lengths of sentences and varying complexities. This type of style can be characterized as “normal” writing in order to characterize Dilsey as a human being and not a slave.</br></br>";
        }
        if (e.getSource() == items4[6]) {
            title = "Anyalysis: Religious Allusions";
            info = "In <i>The Sound and the Fury</i>, two main symbols throughout the story are the holy trinity and the devil. Benjy can be analyzed as being a Christ figure as he is: thirty three years old, celibate, hunted and protected as a child, wounded, in agony, and known to spend time in the wilderness. Benjy, as Christ, is speechless and ineffective to elicit change in his society. Dilsey can be interpreted as a Godly figure as she is purely good and treats everyone as if they were her child. She serves as an equalizer between the good and the bad, Benjy and Jason. In addition she is alluded to Alpha and Omega, meaning she has always been there since the beginning and stays all the way to the end. Caddy can be seen as the Holy Spirit as she is kind to everyone and, although she left the family, she is still in everyone’s hearts and thoughts. In contrast, Jason symbolizes the devil because he is violent, racist, sexist and plain evil. He commits acts which are considered immoral such as stealing money from Miss Quentin and lying to others.";
        }
        if (e.getSource() == items5[0]) {
            title = "Quotes: Benjy's Section";
            info = "Quote 1: “‘He thirty three.’ Luster said. ‘Thirty three this morning.’ ‘You mean, he been three years old thirty three’” (Faulkner 17).<br>Quote 2: “‘Is you all seen a quarter down here.’ Luster said” (Faulkner 14).</br><br>Quote 3: “‘The one I had here this morning.’ Luster said. ‘I lost it somewhere. It fell through this here hole in my pocket. If I don’t find it I can’t go to the show tonight’” (Faulkner 14).</br><br>Quote 4: “‘We going down to the branch’” (Faulkner 14).</br><br>Quote 5: “‘You sit down here and play with your jimson weed. Look at them children playing in the branch, if you got to look at something” (Faulkner 14).</br><br>Quote 6: “They hunted in the branch. Then they all stood up quick and stopped, then they splashed and fought in the branch. Luster got it and they squatted in the water, looking up the hill through the bushes” (Faulkner 16).</br><br>Quote 7: “The man said ‘Caddie’ up the hill” (Faulkner 16).</br><br>Quote 8: “The boy went got out of the water and went up the hill” (Faulkner 16).</br><br>Quote 9: “‘Hush up’” (Faulkner 16).</br><br>Quote 10: “‘You want me to whip you’” (Faulkner 17).</br><br>Quote 11: “I hushed and got in the water and Roskus came and said to come to supper and Caddy said, ‘It's no supper time yet. I'm not going’” (Faulkner 17).</br><br>Quote 12: “‘You mean, he been three years old thirty three’” (Faulkner 17).</br><br>Quote 13: “‘Shut up that moaning.’” (Faulkner 4).</br><br>Quote 14:“‘I is done it [whipping].’ Luster said” (Faulkner 17).</br><br>Quote 15: “...I started to cry and she [Caddy] came and squatted in the water. ‘Hush now.’ she said. ‘I'm not going to run away.’ So I hushed” (Faulkner 19).</br><br>Quote 16: “How old he” (Faulkner 17).</br><br>Quote 17:  “Caddy smelled like trees” (Faulkner 19).</br><br>Quote 18: “‘Where’d you get the quarter, boy. Find it in white folks’ pocket while they aint looking’” (Faulkner 14).</br><br>Quote 19: “The others passed him running, but he never increased his pace at all” (Faulkner 79).</br><br>Quote 20:  “‘White folks gives nigger money because  know first white man comes along with a band going to get it all back, so nigger can go to work for some more’” (Faulkner 15).</br>";
        }
        if (e.getSource() == items5[1]) {
            title = "Quotes: Quentin's Section";
            info = "Quote 1: “He looked at his watch. ‘Bell in two minutes.’ ‘I didn't even know it was that late’ (Faulkner 78).<br>Quote 2: “‘You’d better slip on your pants and run,’ he said” (Faulkner 78).</br><br>Quote 3: “I said I have commited incest, Father I said” (Faulkner 77).</br><br>Quote 4:  “no but they're all bitches” (Faulkner 160).</br><br>Quote 5: “Once a bitch always a bitch, what I say” (Faulkner 180)</br><br>Quote 6: “In the south you are ashamed of being a virgin. Boys. Men. They lie about it. Because it means less to women, Father said. He said it was men who invented virginity not women” (Faulkner 78).</br><br>Quote 7: “Why couldn't it have been me and not her who is unvirgin…” (Faulkner 78).</br>";
        }
        if (e.getSource() == items5[2]) {
            title = "Quotes: Jason's Section";
            info = "Quote 1: “‘Don’t lose your temper with her,’ she says, ‘She’s just a child, remember’” (Faulkner 182).<br>Quote 2: “‘I’m afraid you’ll lose your temper with her,’ she said” (Faulkner 181).</br><br>Quote 3:  “‘I’m afraid you’ll lose your temper with her,’ she said” (Faulkner 182).</br><br>Quote 4: “When people act like niggers, no matter who they are the only thing to do is treat them like a nigger” (Faulkner 181).</br><br>Quote 5: “‘Well,’ I says. ‘You can’t, can you? You never have tried to do anything with her,’ I says. ‘How do you expect to begin this late, when she’s seventeen years old?’” (Faulkner 180).</br><br>Quote 6: “I grabbed her by the arm. She dropped the cup. It broke on the floor and she jerked back, looking at me, but I held her arm” (Faulkner 183).</br><br>Quote 7: “She came around to the desk” (Faulkner 212).</br><br>Quote 8: “Did I get a letter from Mother?” she says, looking at me” (Faulkner 212).</br><br>Quote 9: “‘What were you doing with three thousand dollars hid in the house?’” (Faulkner 303).</br>";
        }
        if (e.getSource() == items5[3]) {
            title = "Quotes: Dilsey's Section";
            info = "Quote 1: “‘Nothing,’ Jason said. ‘Not anything. I wouldn’t lay my hand on her. The bitch that cost me a job, the one chance I ever had to get ahead, that killed my father and is shortening my mother’s life every day made my name a laughing stock I town’” (Faulkner 304).<br>Quote 2: “‘Well,’ I says. ‘You can’t, can you? You never have tried to do anything with her,’ I says. ‘How do you expect to begin this late, when she’s seventeen years old?’” (Faulkner 180).</br>";
        }
        if (e.getSource() == items6[0]) {
            title ="Incorporating Computer Science with <i>The Sound and the Fury</i><br><font size='2' face='TimesRoman' colr='black'><center>by: Julian Herrera & Jonathan Riess</center></br>";
            info = "In dedication to our English teacher, Mrs. McElhiney, for helping us understand complex texts, such as <i>The Sound and the Fury</i>, and guiding us on how to write a quick poetry analysis. <br><br>In dedication to Mr. Greene for teaching us everything we know about programming.</br></br> <br><br>The purpose of this program is to give users the ability for quick access to useful information from the <i>The Sound and the Fury</i>, such as the various characters, the summaries and quotes of each section, and the analyses of the varying themes.</br></br>";
        }
	setLables(title, info);
        revalidate();
        // set scrollpane to top
        jpane.setCaretPosition(0);
    }
 }
