package yyf.javax.swing.hello;

import java.io.File;

import javax.swing.*;

public class Hello {
	
	public static void main(String[] args) {
		 // 创建 JFrame 实例
        JFrame frame = new JFrame("Login Example");
        // Setting the width and height of frame
        frame.setSize(550, 400);
        frame.setLocation(500, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* 创建面板，这个类似于 HTML 的 div 标签
         * 我们可以创建多个面板并在 JFrame 中指定位置
         * 面板中我们可以添加文本字段，按钮及其他组件。
         */
        JPanel panel = new JPanel();    
        // 添加面板
        frame.add(panel);
        /* 
         * 调用用户定义的方法并添加组件到面板
         */
        placeComponents(panel);

        // 设置界面可见
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {

        /* 布局部分我们这边不多做介绍
         * 这边设置布局为 null
         */
        panel.setLayout(null);

        // 创建 JLabel
        JLabel userLabel = new JLabel("User:");
        /* 这个方法定义了组件的位置。
         * setBounds(x, y, width, height)
         * x 和 y 指定左上角的新位置，由 width 和 height 指定新的大小。
         */
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);
        /* 
         * 创建文本域用于用户输入
         */
        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        // 创建登录按钮
        JButton loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);
        
        JFileChooser jf = new JFileChooser();  
        jf.setBounds(10, 160, 165, 100);
        jf.setFileSelectionMode(JFileChooser.SAVE_DIALOG | JFileChooser.DIRECTORIES_ONLY);  
        jf.showDialog(null,null);  
//        File fi = jf.getSelectedFile();  
//        String f = fi.getAbsolutePath();  
//        System.out.println("save: "+f); 
        panel.add(jf);
        
        
	}
}
