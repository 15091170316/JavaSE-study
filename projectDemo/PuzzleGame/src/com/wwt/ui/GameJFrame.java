package com.wwt.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {

    // 图片地址前序
    String imgPath = "image\\girl\\girl7\\";
    // 打乱后的二维数组
    int[][] initArr = new int[4][4];
    // 空白图片在二维数组中的坐标
    int x = 0;
    int y = 0;
    // 胜利的二维数组格式
    int[][] win = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };
    // 计步
    int step = 0;

    public GameJFrame() {
        // 初始化界面
        initJFrame();
        // 初始化菜单
        initJMenuBar();
        // 初始化数据（打乱图片）
        initData();
        // 初始化图片
        initImage();
        // 显示窗口(要放在最后)
        this.setVisible(true);
    }

    // 打乱图片顺序(并输出二维数组)
    private void initData() {
        // 定义图片名数组
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        // 打乱数组顺序
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = random.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        // 将乱序数组添加到二维数组中
        for (int i = 0; i < arr.length; i++) {
            // 获取空白图片在二维数组中的坐标
            if (arr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            initArr[i / 4][i % 4] = arr[i];
        }
    }

    // 初始化图片
    private void initImage() {
        // 每次调用这个方法，就删除上次渲染出的图片，然后再重新根据移动后的二维数组进行图片渲染
        this.getContentPane().removeAll();

        // 判断是否胜利，胜利后就添加胜利的图片
        if (victory()) {
            // 创建并添加胜利的图片
            JLabel winLabel = new JLabel(new ImageIcon("image\\win.png"));
            winLabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winLabel);
        }

        // 循环创建多个图片
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // 创建图片对象（构造参数传递图片地址）
                ImageIcon icon = new ImageIcon(imgPath + initArr[i][j] + ".jpg");
                // 创建一个容器对象（管理容器，图片和文字需要放在管理容器当中，以确定位置大小）
                JLabel label = new JLabel(icon);
                // 指定管理容器位置
                label.setBounds(j * 105 + 83, i * 105 + 134, 105, 105);
                // 添加边框
                label.setBorder(new BevelBorder(BevelBorder.RAISED));
                // 将管理容器添加到界面中
                this.getContentPane().add(label);
            }
        }

        // 添加背景图片(注：先添加的图片在顶层显示，后添加的图片会被先添加的盖住)
        JLabel bgLabel = new JLabel(new ImageIcon("image\\background.png"));
        bgLabel.setBounds(40, 40, 508, 560);
        this.getContentPane().add(bgLabel);

        // 添加计步功能
        JLabel stepLabel = new JLabel("步数：" + step);
        stepLabel.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepLabel);

        // 刷新界面
        this.getContentPane().repaint();
    }

    // 初始化菜单
    private void initJMenuBar() {
        // 创建整个菜单栏对象
        JMenuBar jMenuBar = new JMenuBar();

        // 创建菜单项对象
        JMenu functionMenu = new JMenu("功能");
        JMenu aboutMenu = new JMenu("关于我们");
        // 二级菜单
        JMenu changeMenu = new JMenu("更换图片");

        // 创建菜单项条目对象
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");
        JMenuItem accountItem = new JMenuItem("公众号");
        JMenuItem animalItem = new JMenuItem("动物");
        JMenuItem girlItem = new JMenuItem("美女");
        JMenuItem sportItem = new JMenuItem("运动");

        // 给菜单条目添加action事件
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);
        animalItem.addActionListener(this);
        girlItem.addActionListener(this);
        sportItem.addActionListener(this);

        // 添加条目对象-菜单项
        functionMenu.add(changeMenu);
        functionMenu.add(replayItem);
        functionMenu.add(reLoginItem);
        functionMenu.add(closeItem);
        aboutMenu.add(accountItem);
        changeMenu.add(animalItem);
        changeMenu.add(girlItem);
        changeMenu.add(sportItem);

        // 添加菜单项-菜单栏
        jMenuBar.add(functionMenu);
        jMenuBar.add(aboutMenu);

        // 将菜单栏放入界面中
        this.setJMenuBar(jMenuBar);
    }

    // 初始化界面
    private void initJFrame() {
        // 设置窗口尺寸
        this.setSize(603, 689);
        // 设置窗口title标题
        this.setTitle("拼图游戏单机版 v1.0");
        // 设置窗口打开后居中显示
        this.setLocationRelativeTo(null);
        // 设置窗口一直置顶
        // this.setAlwaysOnTop(true);
        // 设置窗口关闭模式（关闭窗口后，同时停止虚拟机运行）
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 取消默认的内容居中方式
        this.setLayout(null);
        // 给整个界面添加键盘事件
        this.addKeyListener(this);

    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    // 按下不松时的事件
    @Override
    public void keyPressed(KeyEvent e) {
        // 判断是否胜利，胜利后所有键盘事件失效
        if (victory()) {
            return;
        }
        // 查看完整图片（A）：65
        int code = e.getKeyCode();
        if (code == 65) {
            // 把界面中的所有图片全部删除
            this.getContentPane().removeAll();
            // 创建完整图片
            JLabel allLabel = new JLabel(new ImageIcon(imgPath + "all.jpg"));
            allLabel.setBounds(83, 134, 420, 420);
            // 添加完整图片到界面中
            this.getContentPane().add(allLabel);
            // 创建背景图片并添加
            JLabel bgLabel = new JLabel(new ImageIcon("image\\background.png"));
            bgLabel.setBounds(40, 40, 508, 560);
            this.getContentPane().add(bgLabel);
            // 刷新界面
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // 判断是否胜利，胜利后所有键盘事件失效
        if (victory()) {
            return;
        }
        // 左：37 上：38 右：39 下：40
        int code = e.getKeyCode();
        if (code == 37) {
            // 向左移动
            if (y == 3) {
                return;
            }
            initArr[x][y] = initArr[x][y + 1];
            initArr[x][y + 1] = 0;
            y++;
            // 计步
            step++;
            // 移动完成后，重新初始化图片
            initImage();
        } else if (code == 38) {
            // 向上移动
            if (x == 3) {
                return;
            }
            initArr[x][y] = initArr[x + 1][y];
            initArr[x + 1][y] = 0;
            x++;
            // 计步
            step++;
            // 移动完成后，重新初始化图片
            initImage();
        } else if (code == 39) {
            // 向右移动
            if (y == 0) {
                return;
            }
            initArr[x][y] = initArr[x][y - 1];
            initArr[x][y - 1] = 0;
            y--;
            // 计步
            step++;
            // 移动完成后，重新初始化图片
            initImage();
        } else if (code == 40) {
            // 向下移动
            if (x == 0) {
                return;
            }
            initArr[x][y] = initArr[x - 1][y];
            initArr[x - 1][y] = 0;
            x--;
            // 计步
            step++;
            // 移动完成后，重新初始化图片
            initImage();
        } else if (code == 65) {
            // 松开A键，隐藏完整图片。重新显示拼图
            this.getContentPane().removeAll();
            initImage();
        } else if (code == 87) {
            // W键，作弊码，一键通关
            initArr = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}
            };
            x = 3;
            y = 3;
            initImage();
        }
    }

    // action事件
    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        Random random = new Random();
        if (actionCommand == "重新游戏") {
            // 重新打乱图片数据
            initData();
            // 重置计步器
            step = 0;
            // 重新生成图片
            initImage();
        } else if (actionCommand == "重新登录") {
            // 隐藏游戏窗口
            this.setVisible(false);
            // 创建登陆窗口
            new LoginJFrame();
        } else if (actionCommand == "关闭游戏") {
            // 直接关闭虚拟机
            System.exit(0);
        } else if (actionCommand == "公众号") {
            // 创建一个弹窗对象
            JDialog jDialog = new JDialog();
            // 创建图片容器
            JLabel jLabel = new JLabel(new ImageIcon("image\\about.png"));
            jLabel.setBounds(0, 0, 258, 258);
            // 将图片容器添加到弹窗容器中
            jDialog.getContentPane().add(jLabel);
            // 给弹窗设置大小
            jDialog.setSize(344, 344);
            // 设置弹窗title
            jDialog.setTitle("关于我们");
            // 设置弹窗置顶
            jDialog.setAlwaysOnTop(true);
            // 设置弹窗居中
            jDialog.setLocationRelativeTo(null);
            // 设置弹窗不关闭则不能操作下面的界面
            jDialog.setModal(true);
            // 设置弹窗显示
            jDialog.setVisible(true);
        } else if (actionCommand == "动物") {
            // 随机动物中的图片
            int randomIndex = random.nextInt(7) + 1;
            imgPath = "image\\animal\\animal" + randomIndex + "\\";
            // 重新打乱图片数据
            initData();
            // 重置计步器
            step = 0;
            // 重新生成图片
            initImage();
        } else if (actionCommand == "美女") {
            // 随机动物中的图片
            int randomIndex = random.nextInt(12) + 1;
            imgPath = "image\\girl\\girl" + randomIndex + "\\";
            // 重新打乱图片数据
            initData();
            // 重置计步器
            step = 0;
            // 重新生成图片
            initImage();
        } else if (actionCommand == "运动") {
            // 随机动物中的图片
            int randomIndex = random.nextInt(9) + 1;
            imgPath = "image\\sport\\sport" + randomIndex + "\\";
            // 重新打乱图片数据
            initData();
            // 重置计步器
            step = 0;
            // 重新生成图片
            initImage();
        }
    }

    // 判断是否胜利
    private boolean victory() {
        for (int i = 0; i < initArr.length; i++) {
            for (int j = 0; j < initArr[i].length; j++) {
                if (initArr[i][j] != win[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

}
