package com.wwt.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterJFrame extends JFrame implements ActionListener {

    public RegisterJFrame() {
        // 初始化界面
        initJFrame();
        // 初始化提示内容
        initInfo();
        // 显示
        this.setVisible(true);
    }

    private void initInfo() {
        JLabel infoLabel = new JLabel("该功能还在开发中~敬请期待");
        infoLabel.setBounds(10, 10, 200, 50);
        this.getContentPane().add(infoLabel);
        JLabel loginLabel = new JLabel("用户名1：wwt   用户名2：yqn   密码：123456");
        loginLabel.setBounds(10, 80, 300, 50);
        this.getContentPane().add(loginLabel);
        JButton jButton = new JButton("去登录");
        jButton.setBounds(10, 180, 100, 30);
        jButton.addActionListener(this);
        this.getContentPane().add(jButton);
    }

    private void initJFrame() {
        this.setSize(488, 500);//设置宽高
        this.setTitle("拼图小游戏 V1.0注册");//设置标题
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//设置关闭模式
        this.setLocationRelativeTo(null);//居中
        //this.setAlwaysOnTop(true);//置顶
        this.setLayout(null);//取消内部默认布局
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getActionCommand() == "去登录") {
           this.setVisible(false);
           new LoginJFrame();
       }
    }
}
