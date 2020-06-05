/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicplayerui;

import jaco.mp3.player.MP3Player;
import java.awt.Dimension;
import java.awt.Font;
import java.io.File;
import java.nio.file.Paths;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Line;
import javax.sound.sampled.Mixer;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author manashi
 */
public class AudioPlayer extends javax.swing.JFrame {

    /**
     * Creates new form AudioPlayer
     */
    MP3Player player;
    File SongFile;
    String CurrentDirectory=System.getProperty("user.home");
    String appName="A Kind Of Magic";
    String CurrrentPath;
    String ImagePath;
    boolean reapeat=false;
    boolean WindowCollapsed=false;
    int xMouse,yMouse;
    
    
    
    public AudioPlayer() {
        initComponents();
        SongFile=new File("C:\\Users\\manashi\\Music\\audio\\Girl on Fire - Alicia Keys.mp3");
        String filename=SongFile.getName();
        PlayLabel.setText(filename);
        player=mp3Player();
        player.addToPlayList(SongFile);
        CurrrentPath=Paths.get(".").toAbsolutePath().normalize().toString();
        ImagePath="\\images";
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        HeaderPanel = new javax.swing.JPanel();
        Heading = new javax.swing.JLabel();
        Settings = new javax.swing.JLabel();
        PowerOff = new javax.swing.JLabel();
        BodyPanel = new javax.swing.JPanel();
        PayingPanel = new javax.swing.JPanel();
        PlayLabel = new javax.swing.JLabel();
        ButtonPanel = new javax.swing.JPanel();
        Repeat = new javax.swing.JLabel();
        Pause = new javax.swing.JLabel();
        Play = new javax.swing.JLabel();
        Stop = new javax.swing.JLabel();
        Openlb = new javax.swing.JLabel();
        VolumeDown = new javax.swing.JLabel();
        VolumeUp = new javax.swing.JLabel();
        VolumeFull = new javax.swing.JLabel();
        Mute = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 51));
        setName("frame1"); // NOI18N
        setUndecorated(true);

        MainPanel.setBackground(new java.awt.Color(7, 63, 86));
        MainPanel.setMinimumSize(new java.awt.Dimension(0, 0));

        HeaderPanel.setBackground(new java.awt.Color(0, 51, 51));
        HeaderPanel.setMinimumSize(new java.awt.Dimension(0, 0));

        Heading.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Heading.setForeground(new java.awt.Color(0, 153, 0));
        Heading.setText("A KIND OF MAGIC");
        Heading.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeadingMouseDragged(evt);
            }
        });
        Heading.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HeadingMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeadingMousePressed(evt);
            }
        });

        Settings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayerui/images/settings.png"))); // NOI18N
        Settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SettingsMouseClicked(evt);
            }
        });

        PowerOff.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PowerOff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayerui/images/quit.png"))); // NOI18N
        PowerOff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PowerOffMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout HeaderPanelLayout = new javax.swing.GroupLayout(HeaderPanel);
        HeaderPanel.setLayout(HeaderPanelLayout);
        HeaderPanelLayout.setHorizontalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Heading, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Settings, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PowerOff, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        HeaderPanelLayout.setVerticalGroup(
            HeaderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Heading, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PowerOff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Settings, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        BodyPanel.setBackground(new java.awt.Color(0, 0, 51));
        BodyPanel.setMinimumSize(new java.awt.Dimension(0, 0));

        PayingPanel.setBackground(new java.awt.Color(0, 51, 51));
        PayingPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0)));

        PlayLabel.setBackground(new java.awt.Color(0, 51, 51));
        PlayLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        PlayLabel.setForeground(new java.awt.Color(51, 204, 0));
        PlayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PlayLabel.setText("PLAYING");

        javax.swing.GroupLayout PayingPanelLayout = new javax.swing.GroupLayout(PayingPanel);
        PayingPanel.setLayout(PayingPanelLayout);
        PayingPanelLayout.setHorizontalGroup(
            PayingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PayingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PlayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PayingPanelLayout.setVerticalGroup(
            PayingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PayingPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PlayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout BodyPanelLayout = new javax.swing.GroupLayout(BodyPanel);
        BodyPanel.setLayout(BodyPanelLayout);
        BodyPanelLayout.setHorizontalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PayingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        BodyPanelLayout.setVerticalGroup(
            BodyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BodyPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(PayingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        ButtonPanel.setBackground(new java.awt.Color(7, 63, 86));
        ButtonPanel.setMinimumSize(new java.awt.Dimension(0, 0));

        Repeat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Repeat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayerui/images/repeat.png"))); // NOI18N
        Repeat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RepeatMouseClicked(evt);
            }
        });

        Pause.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayerui/images/pause.png"))); // NOI18N
        Pause.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PauseMouseClicked(evt);
            }
        });

        Play.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayerui/images/play.png"))); // NOI18N
        Play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlayMouseClicked(evt);
            }
        });

        Stop.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Stop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayerui/images/stop.png"))); // NOI18N
        Stop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StopMouseClicked(evt);
            }
        });

        Openlb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Openlb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayerui/images/open.png"))); // NOI18N
        Openlb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OpenlbMouseClicked(evt);
            }
        });

        VolumeDown.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VolumeDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayerui/images/volume_down.png"))); // NOI18N
        VolumeDown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VolumeDownMouseClicked(evt);
            }
        });

        VolumeUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VolumeUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayerui/images/volume_up.png"))); // NOI18N
        VolumeUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VolumeUpMouseClicked(evt);
            }
        });

        VolumeFull.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        VolumeFull.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayerui/images/volume_full.png"))); // NOI18N
        VolumeFull.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VolumeFullMouseClicked(evt);
            }
        });

        Mute.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mute.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musicplayerui/images/mute.png"))); // NOI18N
        Mute.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MuteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ButtonPanelLayout = new javax.swing.GroupLayout(ButtonPanel);
        ButtonPanel.setLayout(ButtonPanelLayout);
        ButtonPanelLayout.setHorizontalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Repeat, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pause, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Play)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Stop, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Openlb, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VolumeDown, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VolumeUp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VolumeFull, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mute, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ButtonPanelLayout.setVerticalGroup(
            ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Repeat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Pause, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ButtonPanelLayout.createSequentialGroup()
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Play, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ButtonPanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Stop, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Openlb, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(ButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VolumeDown, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VolumeUp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VolumeFull, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mute, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ButtonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BodyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayMouseClicked
        // TODO add your handling code here:
        player.play();
    }//GEN-LAST:event_PlayMouseClicked

    private void StopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StopMouseClicked
        // TODO add your handling code here:
        player.stop();
    }//GEN-LAST:event_StopMouseClicked

    private void PauseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PauseMouseClicked
        // TODO add your handling code here:
        player.pause();
    }//GEN-LAST:event_PauseMouseClicked

    private void RepeatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RepeatMouseClicked
        // TODO add your handling code here:
        
        if(reapeat == false){
            reapeat = true;
            player.setRepeat(reapeat);
            
            String image = CurrrentPath+ImagePath+"\\repeat_enabled.png";
            Repeat.setIcon(new ImageIcon(image));
        }else if(reapeat == true){
            reapeat = false;
            player.setRepeat(reapeat);
            
            String image = CurrrentPath+ImagePath+"\\repeat.png";
            Repeat.setIcon(new ImageIcon(image));            
        }
    }//GEN-LAST:event_RepeatMouseClicked

    private void HeadingMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeadingMousePressed
        // TODO add your handling code here:
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_HeadingMousePressed

    private void HeadingMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeadingMouseDragged
        // TODO add your handling code here:
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_HeadingMouseDragged

    private void PowerOffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PowerOffMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_PowerOffMouseClicked

    private void SettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingsMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Settings Popped Up !!");
    }//GEN-LAST:event_SettingsMouseClicked

    private void OpenlbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpenlbMouseClicked
        // TODO add your handling code here:
        JFileChooser filechoose=new JFileChooser(CurrentDirectory);
        filechoose.setFileFilter(new FileTypeFilter(".mp3", "open mp3 file only"));
        int result=filechoose.showOpenDialog(null);
        if (result==JFileChooser.APPROVE_OPTION){
            SongFile=filechoose.getSelectedFile();
            player.addToPlayList(SongFile);
            player.skipForward();
            CurrentDirectory=SongFile.getAbsolutePath();
            PlayLabel.setText("Playing..."+SongFile.getName());
        }
    }//GEN-LAST:event_OpenlbMouseClicked

    private void HeadingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeadingMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==2){
            if(WindowCollapsed==false){
                WindowCollapsed=true;
                this.setSize(new Dimension(this.getSize().width, 50));
                Heading.setFont(new Font("calibri", 1, 18));
                Heading.setText("Playing..."+SongFile.getName());
            }else{
                WindowCollapsed=false;
                this.setSize(new Dimension(this.getSize().width, 326));
                Heading.setFont(new Font("calibri", 1, 18));
                Heading.setText("Playing..."+SongFile.getName());
            }
        }
    }//GEN-LAST:event_HeadingMouseClicked

    private void VolumeDownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolumeDownMouseClicked
        // TODO add your handling code here:
        volumeDownControl(0.1);
    }//GEN-LAST:event_VolumeDownMouseClicked

    private void VolumeUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolumeUpMouseClicked
        // TODO add your handling code here:
        volumeUpControl(0.1);
    }//GEN-LAST:event_VolumeUpMouseClicked

    private void VolumeFullMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VolumeFullMouseClicked
        // TODO add your handling code here:
        volumeControl(1.1);
    }//GEN-LAST:event_VolumeFullMouseClicked

    private void MuteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MuteMouseClicked
        // TODO add your handling code here:
        volumeControl(0.0);
    }//GEN-LAST:event_MuteMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AudioPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AudioPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AudioPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AudioPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AudioPlayer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JPanel ButtonPanel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel Heading;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel Mute;
    private javax.swing.JLabel Openlb;
    private javax.swing.JLabel Pause;
    private javax.swing.JPanel PayingPanel;
    private javax.swing.JLabel Play;
    private javax.swing.JLabel PlayLabel;
    private javax.swing.JLabel PowerOff;
    private javax.swing.JLabel Repeat;
    private javax.swing.JLabel Settings;
    private javax.swing.JLabel Stop;
    private javax.swing.JLabel VolumeDown;
    private javax.swing.JLabel VolumeFull;
    private javax.swing.JLabel VolumeUp;
    // End of variables declaration//GEN-END:variables


    public static MP3Player mp3Player(){
        MP3Player mp=new MP3Player();
        return mp;
    }
    public void volumeDownControl(Double vPlusMinus){
        Mixer.Info[] mixers=AudioSystem.getMixerInfo();
        for(Mixer.Info mixerInfo : mixers){
            Mixer mixer=AudioSystem.getMixer(mixerInfo);
            Line.Info[] lineinfos=mixer.getTargetLineInfo();
            for(Line.Info lineinfo : lineinfos){
                Line line=null;
                boolean open=true;
                try{
                    line=mixer.getLine(lineinfo);
                    open=line.isOpen() || line instanceof Clip;
                    if(!open){
                        line.open();
                    }
                    FloatControl volControl=(FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    float currentVol=volControl.getValue();
                    Double volToCut=vPlusMinus;
                    float changeCalc=(float) ((float)currentVol-(double)volToCut);
                    volControl.setValue(changeCalc);
                }catch(Exception e){
                    
                }finally{
                    if(line!=null && !open){
                        line.close();
                    }
                }
            }
            
        }
    }
     public void volumeUpControl(Double vPlusMinus){
        Mixer.Info[] mixers=AudioSystem.getMixerInfo();
        for(Mixer.Info mixerInfo : mixers){
            Mixer mixer=AudioSystem.getMixer(mixerInfo);
            Line.Info[] lineinfos=mixer.getTargetLineInfo();
            for(Line.Info lineinfo : lineinfos){
                Line line=null;
                boolean open=true;
                try{
                    line=mixer.getLine(lineinfo);
                    open=line.isOpen() || line instanceof Clip;
                    if(!open){
                        line.open();
                    }
                    FloatControl volControl=(FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    float currentVol=volControl.getValue();
                    Double volToCut=vPlusMinus;
                    float changeCalc=(float) ((float)currentVol+(double)volToCut);
                    volControl.setValue(changeCalc);
                }catch(Exception e){
                    
                }finally{
                    if(line!=null && !open){
                        line.close();
                    }
                }
            }
            
        }
    }
      public void volumeControl(Double vPlusMinus){
        Mixer.Info[] mixers=AudioSystem.getMixerInfo();
        for(Mixer.Info mixerInfo : mixers){
            Mixer mixer=AudioSystem.getMixer(mixerInfo);
            Line.Info[] lineinfos=mixer.getTargetLineInfo();
            for(Line.Info lineinfo : lineinfos){
                Line line=null;
                boolean open=true;
                try{
                    line=mixer.getLine(lineinfo);
                    open=line.isOpen() || line instanceof Clip;
                    if(!open){
                        line.open();
                    }
                    FloatControl volControl=(FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    float currentVol=volControl.getValue();
                    Double volToCut=vPlusMinus;
                    float changeCalc=(float)((double)volToCut);
                    volControl.setValue(changeCalc);
                }catch(Exception e){
                    
                }finally{
                    if(line!=null && !open){
                        line.close();
                    }
                }
            }
            
        }
    }
}
