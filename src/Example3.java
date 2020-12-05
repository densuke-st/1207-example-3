import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Example3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Example3 frame = new Example3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Example3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel imageView = new JLabel("");
		contentPane.add(imageView, BorderLayout.CENTER);
		imageView.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel header = new JLabel("画像ファイルの読み込みサンプル");
		header.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(header, BorderLayout.NORTH);
		
		// 画像読み込み
		ImageIcon _image = new ImageIcon("drink_coffee.png");
		// リサイズして表示に使うオブジェクトにする
		ImageIcon icon = new ImageIcon(_image.getImage().getScaledInstance(200, -1, Image.SCALE_SMOOTH));
		imageView.setIcon(icon);
		
		
	}

}
