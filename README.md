package end.of.year.project;

import java.util.concurrent.TimeUnit;
import java.util.Timer;
import java.util.TimerTask;


public class SatActTimer extends javax.swing.JFrame {

    int minutes = 0;
    int seconds = 0;
    int testNumber = 0;

    public void loadHomePage() {
        testNumber = 0;
        startPage.setVisible(false);
        timerPage.setVisible(false);
        endPage.setVisible(false);
        page1.setVisible(true);
        page1.setLocation(608, 1);
    }

    public void loadStartPage() {
        page1.setVisible(false);
        timerPage.setVisible(false);
        endPage.setVisible(false);
        startPage.setVisible(true);
        if (testNumber == 0) {
            testMapLabel.setText("English");
        }
        if (testNumber == 1) {
            testMapLabel.setText("Math");
        }
        if (testNumber == 2) {
            testMapLabel.setText("Reading");
        }
        if (testNumber == 3) {
            testMapLabel.setText("Science");
        }
    }

    public void loadTimerPage() {
        page1.setVisible(false);
        startPage.setVisible(false);
         endPage.setVisible(false);
        timerPage.setVisible(true);
    }
    
    public void loadEndPage() {
        page1.setVisible(false);
        startPage.setVisible(false);
        timerPage.setVisible(false);
        endPage.setVisible(true);
        
    }

    public SatActTimer() {
        initComponents();
        loadHomePage();
    }

    public void startTest() {
        if (testNumber == 0) {
            loadTimerPage();
            activateTimer(45);
        }
        if (testNumber == 1) {
            loadTimerPage();
            activateTimer(45);
        }
        if (testNumber == 2) {
            loadTimerPage();
            activateTimer(45);
        }
        if (testNumber == 3) {
            loadTimerPage();
            activateTimer(45);
        }
    }

    public void activateTimer(int duration) {
        minutes = duration;
        seconds = 0;
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                timerSecondLabel.setText(String.valueOf(seconds));
                timerMinuteLabel.setText(String.valueOf(minutes));
                if (seconds == 0) {
                    seconds = 59;
                    minutes--;
                }
                if (minutes == -1) {
                    timer.cancel();
                    testNumber++;
                    if (testNumber == 4 || testNumber ==14) {
                        loadEndPage();
                    }else{
                        loadStartPage();
                    }

                }
                seconds--;
            }
        }, 1, 1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        page1 = new javax.swing.JPanel();
        SatButton = new java.awt.Button();
        Title = new java.awt.Label();
        ActButton = new java.awt.Button();
        startPage = new javax.swing.JPanel();
        testMapLabel = new java.awt.Label();
        startButton = new java.awt.Button();
        timerPage = new javax.swing.JPanel();
        timerSecondLabel = new java.awt.Label();
        timerMinuteLabel = new java.awt.Label();
        label1 = new java.awt.Label();
        intermissionLabel = new java.awt.Label();
        endPage = new javax.swing.JPanel();
        finishedLabel = new java.awt.Label();
        returnButton = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        SatButton.setLabel("SAT");
        SatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SatButtonActionPerformed(evt);
            }
        });

        Title.setFont(new java.awt.Font("Consolas", 0, 72)); // NOI18N
        Title.setText("SAT and ACT Timer");

        ActButton.setLabel("ACT");
        ActButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout page1Layout = new javax.swing.GroupLayout(page1);
        page1.setLayout(page1Layout);
        page1Layout.setHorizontalGroup(
            page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(page1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(page1Layout.createSequentialGroup()
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, page1Layout.createSequentialGroup()
                        .addComponent(SatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ActButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        page1Layout.setVerticalGroup(
            page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(page1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addGroup(page1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ActButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SatButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103))
        );

        testMapLabel.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        testMapLabel.setText("English");

        startButton.setLabel("Start");
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout startPageLayout = new javax.swing.GroupLayout(startPage);
        startPage.setLayout(startPageLayout);
        startPageLayout.setHorizontalGroup(
            startPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startPageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(testMapLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(939, Short.MAX_VALUE))
        );
        startPageLayout.setVerticalGroup(
            startPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startPageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(testMapLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 516, Short.MAX_VALUE)
                .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        startButton.getAccessibleContext().setAccessibleName("");

        timerSecondLabel.setFont(new java.awt.Font("Dialog", 0, 200)); // NOI18N
        timerSecondLabel.setText("    ");

        timerMinuteLabel.setFont(new java.awt.Font("Dialog", 0, 200)); // NOI18N
        timerMinuteLabel.setText("    ");

        label1.setFont(new java.awt.Font("Dialog", 0, 200)); // NOI18N
        label1.setText(":");

        javax.swing.GroupLayout timerPageLayout = new javax.swing.GroupLayout(timerPage);
        timerPage.setLayout(timerPageLayout);
        timerPageLayout.setHorizontalGroup(
            timerPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timerPageLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(timerMinuteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timerSecondLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        timerPageLayout.setVerticalGroup(
            timerPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timerPageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(timerPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(timerSecondLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timerMinuteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(timerPageLayout.createSequentialGroup()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        finishedLabel.setText("Congradualtions! You finished the test!");

        returnButton.setLabel("Return");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout endPageLayout = new javax.swing.GroupLayout(endPage);
        endPage.setLayout(endPageLayout);
        endPageLayout.setHorizontalGroup(
            endPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(endPageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(finishedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        endPageLayout.setVerticalGroup(
            endPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(endPageLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(endPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finishedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(830, 830, 830)
                .addComponent(page1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(intermissionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(395, 395, 395))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(timerPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(334, 334, 334)
                        .addComponent(startPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1290, 1290, 1290)
                        .addComponent(endPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(939, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(page1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(intermissionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(timerPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(341, 341, 341))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(startPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(endPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(53, 53, 53))))
        );

        pack();
    }// </editor-fold>                        

    private void ActButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        loadStartPage();
    }                                         

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        startTest();
    }                                           

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        loadHomePage();
    }                                            

    private void SatButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        loadStartPage();
    }                                         


    // Variables declaration - do not modify                     
    private java.awt.Button ActButton;
    private java.awt.Button SatButton;
    private java.awt.Label Title;
    private javax.swing.JPanel endPage;
    private java.awt.Label finishedLabel;
    private java.awt.Label intermissionLabel;
    private java.awt.Label label1;
    private javax.swing.JPanel page1;
    private java.awt.Button returnButton;
    private java.awt.Button startButton;
    private javax.swing.JPanel startPage;
    private java.awt.Label testMapLabel;
    private java.awt.Label timerMinuteLabel;
    private javax.swing.JPanel timerPage;
    private java.awt.Label timerSecondLabel;
    // End of variables declaration                   
}
