package end.of.year.project;

import java.util.concurrent.TimeUnit;
import java.util.Timer;
import java.util.TimerTask;

public class SatActTimer extends javax.swing.JFrame {

    int minutes = 0;
    int seconds = 0;
    int subSeconds = 0;
    int testNumber = 0;
    int questionNumber = 0;
    int numberOfQuestions = 0;
    int broadcastNext = 0;

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
            testMapLabel2.setText("Time:");
            testMapLabel3.setText("Questions:");
            testMapLabel4.setText("75 Questions");
            testMapLabel5.setText("45 Minutes");
        }
        if (testNumber == 1) {
            testMapLabel.setText("Math");
            testMapLabel2.setText("Time:");
            testMapLabel3.setText("Questions:");
            testMapLabel4.setText("60 Questions");
            testMapLabel5.setText("60 Minutes");
        }
        if (testNumber == 2) {
            testMapLabel.setText("Reading");
            testMapLabel2.setText("Time:");
            testMapLabel3.setText("Questions:");
            testMapLabel4.setText("40 Questions");
            testMapLabel5.setText("35 Minutes");
        }
        if (testNumber == 3) {
            testMapLabel.setText("Science");
            testMapLabel2.setText("Time:");
            testMapLabel3.setText("Questions:");
            testMapLabel4.setText("40 Questions");
            testMapLabel5.setText("35 Minutes");
        }
        if (testNumber == 10) {
            testMapLabel.setText("Reading");
            testMapLabel2.setText("Time:");
            testMapLabel3.setText("Questions:");
            testMapLabel4.setText("52 Questions");
            testMapLabel5.setText("65 Minutes");
        }
        if (testNumber == 11) {
            testMapLabel.setText("English");
            testMapLabel2.setText("Time:");
            testMapLabel3.setText("Questions:");
            testMapLabel4.setText("44 Questions");
            testMapLabel5.setText("35 Minutes");
        }
        if (testNumber == 12) {
            testMapLabel.setText("Math");
            testMapLabel2.setText("Time:");
            testMapLabel3.setText("Questions:");
            testMapLabel4.setText("55 Questions");
            testMapLabel5.setText("55 Minutes");
        }
        if (testNumber == 13) {
            testMapLabel.setText("Math");
            testMapLabel2.setText("Time:");
            testMapLabel3.setText("Questions:");
            testMapLabel4.setText("13 Questions");
            testMapLabel5.setText("25 Minutes");
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
            questionNumber = 0;
            numberOfQuestions = 60;
            questionNumberLabel.setText(String.valueOf(questionNumber) + "/" + String.valueOf(numberOfQuestions));
            activateSecondaryTimer(30);

        }
        if (testNumber == 1) {
            loadTimerPage();
            activateTimer(60);
            activateSecondaryTimer(30);
        }
        if (testNumber == 2) {
            loadTimerPage();
            activateTimer(35);
            activateSecondaryTimer(30);
        }
        if (testNumber == 3) {
            loadTimerPage();
            activateTimer(35);
            activateSecondaryTimer(30);
        }
        if (testNumber == 10) {
            loadTimerPage();
            activateTimer(65);
            activateSecondaryTimer(30);
        }
        if (testNumber == 11) {
            loadTimerPage();
            activateTimer(35);
            activateSecondaryTimer(30);
        }
        if (testNumber == 12) {
            loadTimerPage();
            activateTimer(55);
            activateSecondaryTimer(30);
        }
        if (testNumber == 13) {
            loadTimerPage();
            activateTimer(25);
            activateSecondaryTimer(30);
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
                    if (testNumber == 4 || testNumber == 14) {
                        loadEndPage();
                    } else {
                        loadStartPage();
                    }

                }
                seconds--;
            }
        }, 1000, 1000);
    }

    public void activateSecondaryTimer(int answerTime) {
        subSeconds = answerTime;
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if(broadcastNext == 1){
                    subSeconds = subSeconds + answerTime;
                    broadcastNext = 0;
                }
                secondaryTimerLabel.setText(String.valueOf(subSeconds));
                subSeconds--;
            }
        }, 1000, 1000);
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
        testMapLabel2 = new java.awt.Label();
        testMapLabel3 = new java.awt.Label();
        testMapLabel4 = new java.awt.Label();
        testMapLabel5 = new java.awt.Label();
        timerPage = new javax.swing.JPanel();
        timerSecondLabel = new java.awt.Label();
        timerMinuteLabel = new java.awt.Label();
        label1 = new java.awt.Label();
        secondaryTimerLabel = new java.awt.Label();
        counterLabel = new java.awt.Label();
        nextButton = new javax.swing.JButton();
        questionNumberLabel = new java.awt.Label();
        intermissionLabel = new java.awt.Label();
        endPage = new javax.swing.JPanel();
        finishedLabel = new java.awt.Label();
        returnButton = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        testMapLabel2.setText("Time:");

        testMapLabel3.setText("Questions:");

        testMapLabel4.setName(""); // NOI18N
        testMapLabel4.setText("75 Questions");

        testMapLabel5.setText("45 Minutes");

        javax.swing.GroupLayout startPageLayout = new javax.swing.GroupLayout(startPage);
        startPage.setLayout(startPageLayout);
        startPageLayout.setHorizontalGroup(
            startPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startPageLayout.createSequentialGroup()
                .addGroup(startPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(startPageLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(testMapLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(startPageLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(startPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(testMapLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(testMapLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(startPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(testMapLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testMapLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(939, Short.MAX_VALUE))
        );
        startPageLayout.setVerticalGroup(
            startPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startPageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(testMapLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(startPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(testMapLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testMapLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(startPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(testMapLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(testMapLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 380, Short.MAX_VALUE)
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

        secondaryTimerLabel.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N

        counterLabel.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N

        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout timerPageLayout = new javax.swing.GroupLayout(timerPage);
        timerPage.setLayout(timerPageLayout);
        timerPageLayout.setHorizontalGroup(
            timerPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timerPageLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(timerPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timerPageLayout.createSequentialGroup()
                        .addComponent(timerMinuteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(timerPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(secondaryTimerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(timerPageLayout.createSequentialGroup()
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(timerSecondLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timerPageLayout.createSequentialGroup()
                        .addComponent(counterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timerPageLayout.createSequentialGroup()
                        .addComponent(nextButton)
                        .addGap(79, 79, 79)
                        .addComponent(questionNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        timerPageLayout.setVerticalGroup(
            timerPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timerPageLayout.createSequentialGroup()
                .addGroup(timerPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(timerPageLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(timerPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(timerSecondLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timerMinuteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(secondaryTimerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(counterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(timerPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(timerPageLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(nextButton)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timerPageLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(questionNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))))
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
                .addGap(50, 50, 50)
                .addComponent(timerPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(startPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(684, 684, 684)
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
                .addComponent(startPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(endPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(53, 53, 53))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(timerPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
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
        testNumber = testNumber + 10;
    }                                         

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if(questionNumber < numberOfQuestions){
             questionNumber++;  
             broadcastNext = 1;
        }
        questionNumberLabel.setText(String.valueOf(questionNumber) + "/" + String.valueOf(numberOfQuestions));
    }                                          


    // Variables declaration - do not modify                     
    private java.awt.Button ActButton;
    private java.awt.Button SatButton;
    private java.awt.Label Title;
    private java.awt.Label counterLabel;
    private javax.swing.JPanel endPage;
    private java.awt.Label finishedLabel;
    private java.awt.Label intermissionLabel;
    private java.awt.Label label1;
    private javax.swing.JButton nextButton;
    private javax.swing.JPanel page1;
    private java.awt.Label questionNumberLabel;
    private java.awt.Button returnButton;
    private java.awt.Label secondaryTimerLabel;
    private java.awt.Button startButton;
    private javax.swing.JPanel startPage;
    private java.awt.Label testMapLabel;
    private java.awt.Label testMapLabel2;
    private java.awt.Label testMapLabel3;
    private java.awt.Label testMapLabel4;
    private java.awt.Label testMapLabel5;
    private java.awt.Label timerMinuteLabel;
    private javax.swing.JPanel timerPage;
    private java.awt.Label timerSecondLabel;
    // End of variables declaration                   
}

