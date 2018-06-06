package end.of.year.project;

import java.awt.Color;
import java.util.concurrent.TimeUnit;
import java.util.Timer;
import java.util.TimerTask;

public class SatActTimer extends javax.swing.JFrame {

    int minutes = 0;
    int seconds = 0;
    int subSeconds = 0;
    int totalSeconds = 0;
    int testNumber = 0;
    int questionNumber = 0;
    int numberOfQuestions = 0;
    int broadcastNext = 0;
    Timer secondaryTimer = new Timer();
    Timer primaryTimer = new Timer();
    

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
            activatePrimaryTimer(45);
            totalSeconds = 2700;
            questionNumber = 0;
            numberOfQuestions = 60;
            questionNumberLabel.setText(String.valueOf(questionNumber) + "/" + String.valueOf(numberOfQuestions) + "questions");
            activateSecondaryTimer(30);

        }
        if (testNumber == 1) {
            loadTimerPage();
            activatePrimaryTimer(60);
            totalSeconds = 3600;
            questionNumber = 0;
            numberOfQuestions = 60;
            questionNumberLabel.setText(String.valueOf(questionNumber) + "/" + String.valueOf(numberOfQuestions) + "questions");
            activateSecondaryTimer(30);
        }
        if (testNumber == 2) {
            loadTimerPage();
            activatePrimaryTimer(35);
            totalSeconds = 2100;
            questionNumber = 0;
            numberOfQuestions = 60;
            questionNumberLabel.setText(String.valueOf(questionNumber) + "/" + String.valueOf(numberOfQuestions) + "questions");
            activateSecondaryTimer(30);
        }
        if (testNumber == 3) {
            loadTimerPage();
            activatePrimaryTimer(35);
            totalSeconds = 2100;
            questionNumber = 0;
            numberOfQuestions = 60;
            questionNumberLabel.setText(String.valueOf(questionNumber) + "/" + String.valueOf(numberOfQuestions) + "questions");
            activateSecondaryTimer(30);
        }
        if (testNumber == 10) {
            loadTimerPage();
            activatePrimaryTimer(65);
            totalSeconds = 3900;
            questionNumber = 0;
            numberOfQuestions = 60;
            questionNumberLabel.setText(String.valueOf(questionNumber) + "/" + String.valueOf(numberOfQuestions) + "questions");
            activateSecondaryTimer(30);
        }
        if (testNumber == 11) {
            loadTimerPage();
            activatePrimaryTimer(35);
            totalSeconds = 2100;
            questionNumber = 0;
            numberOfQuestions = 60;
            questionNumberLabel.setText(String.valueOf(questionNumber) + "/" + String.valueOf(numberOfQuestions) + "questions");
            activateSecondaryTimer(30);
        }
        if (testNumber == 12) {
            loadTimerPage();
            activatePrimaryTimer(55);
            totalSeconds = 3300;
            questionNumber = 0;
            numberOfQuestions = 60;
            questionNumberLabel.setText(String.valueOf(questionNumber) + "/" + String.valueOf(numberOfQuestions) + "questions");
            activateSecondaryTimer(30);
        }
        if (testNumber == 13) {
            loadTimerPage();
            activatePrimaryTimer(25);
            totalSeconds = 1500;
            questionNumber = 0;
            numberOfQuestions = 60;
            questionNumberLabel.setText(String.valueOf(questionNumber) + "/" + String.valueOf(numberOfQuestions) + "questions");
            activateSecondaryTimer(30);
        }
    }

    public void activatePrimaryTimer(int duration) {
        minutes = duration;
        seconds = 0;
        primaryTimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                timerSecondLabel.setText(String.valueOf(seconds));
                timerMinuteLabel.setText(String.valueOf(minutes));
                if (seconds == 0) {
                    seconds = 59;
                    minutes--;
                }
                if (minutes == -1) {
                    primaryTimer.cancel();
                    secondaryTimer.cancel();
                    testNumber++;
                    if (testNumber == 4 || testNumber == 14) {
                        loadEndPage();
                    } else {
                        loadStartPage();
                    }
                }
                seconds--;
                totalSeconds--;
            }
        }, 10, 10);
    }

    public void activateSecondaryTimer(int answerTime) {
        subSeconds = answerTime;
        secondaryTimer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                secondaryTimerLabel.setForeground(Color.GREEN);
                if (broadcastNext == 1) {
                    subSeconds = totalSeconds / (numberOfQuestions - questionNumber);
                    broadcastNext = 0;
                }
                if (subSeconds < 0) {
                    secondaryTimerLabel.setForeground(Color.RED);
                    secondaryTimerLabel2.setText("Take a guess!");
                }
                secondaryTimerLabel.setText(String.valueOf(subSeconds));
                subSeconds--;
            }
        }, 10, 10);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
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
        questionNumberLabel = new java.awt.Label();
        nextButton = new java.awt.Button();
        secondaryTimerLabel2 = new java.awt.Label();
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
        secondaryTimerLabel.setText("30");

        questionNumberLabel.setText("0/60 questions");

        nextButton.setLabel("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        secondaryTimerLabel2.setText("seconds left for this question");

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
                            .addGroup(timerPageLayout.createSequentialGroup()
                                .addComponent(secondaryTimerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(secondaryTimerLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(timerPageLayout.createSequentialGroup()
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(timerSecondLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timerPageLayout.createSequentialGroup()
                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(245, 245, 245))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, timerPageLayout.createSequentialGroup()
                        .addComponent(questionNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(232, 232, 232))))
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
                .addGroup(timerPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(timerPageLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(secondaryTimerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(timerPageLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(secondaryTimerLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(80, 80, 80)
                .addComponent(questionNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void ActButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActButtonActionPerformed
        loadStartPage();
    }//GEN-LAST:event_ActButtonActionPerformed

    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        startTest();
    }//GEN-LAST:event_startButtonActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        loadHomePage();
    }//GEN-LAST:event_returnButtonActionPerformed

    private void SatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SatButtonActionPerformed
        loadStartPage();
        testNumber = testNumber + 10;
    }//GEN-LAST:event_SatButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        if (questionNumber < numberOfQuestions) {
            secondaryTimerLabel2.setText("seconds left for this question");
            questionNumber++;
            broadcastNext = 1;
        }
         if (questionNumber == 60) { 
                    primaryTimer.cancel();
                    secondaryTimer.cancel();
                    testNumber++;
                    if (testNumber == 4 || testNumber == 14) {
                        loadEndPage();
                    } else {
                        loadStartPage();
                    }
                }
        questionNumberLabel.setText(String.valueOf(questionNumber) + "/" + String.valueOf(numberOfQuestions) + "questions");
    }//GEN-LAST:event_nextButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button ActButton;
    private java.awt.Button SatButton;
    private java.awt.Label Title;
    private javax.swing.JPanel endPage;
    private java.awt.Label finishedLabel;
    private java.awt.Label intermissionLabel;
    private java.awt.Label label1;
    private java.awt.Button nextButton;
    private javax.swing.JPanel page1;
    private java.awt.Label questionNumberLabel;
    private java.awt.Button returnButton;
    private java.awt.Label secondaryTimerLabel;
    private java.awt.Label secondaryTimerLabel2;
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
    // End of variables declaration//GEN-END:variables
}
