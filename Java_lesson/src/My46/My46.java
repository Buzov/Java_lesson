package My46;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.event.*;


//ползунки

public class My46
{
	public static void main(String[] args)
	{
		System.out.println("It is program My");
		MyFrame frame=new MyFrame();
		//условие закрытия окна
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.show();
	
	}

}

class MyFrame extends JFrame
{
	private JPanel sliderPanel, lPanel;
	private JLabel label;
	private ChangeListener listener;
	private JSlider s1;
		public MyFrame()
	{
		setTitle("Dart");
		setSize(300,200);
		sliderPanel=new JPanel();
		//располжение слева
		sliderPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		s1=new JSlider(SwingConstants.VERTICAL,0,100,50);
		lPanel=new JPanel();
		lPanel.add(s1);
		
		listener=new
				ChangeListener()
		{
			public void stateChanged(ChangeEvent event)
			{
				JSlider sourse=(JSlider) event.getSource();
				
				label.setText(""+sourse.getValue());
				s1.setValue(sourse.getValue());
			}

			
			
		};
		JSlider slider =new JSlider();
		addSlider(slider,"Plain");
		
		slider=new JSlider();
		slider.setPaintTicks(true);
		//крупные деления на слайдере
		slider.setMajorTickSpacing(20);
		//мелкие деления
		slider.setMinorTickSpacing(5);
		addSlider(slider,"Ticks");
		
		slider=new JSlider();
		slider.setPaintTicks(true);
		//остановка в делениях
		slider.setSnapToTicks(true);	
		//крупные деления на слайдере
		slider.setMajorTickSpacing(20);
		//мелкие деления
		slider.setMinorTickSpacing(10);
		addSlider(slider,"TSnap to ticks");
		
		slider=new JSlider();
		slider.setPaintTicks(true);
		//крупные деления на слайдере
		slider.setMajorTickSpacing(20);
		//мелкие деления
		slider.setMinorTickSpacing(5);
		//заполнение цветом
		slider.putClientProperty("JSlider.isFilled", Boolean.TRUE);
		addSlider(slider,"Filled");
		
		
		slider=new JSlider();
		slider.setPaintTicks(true);
		//крупные деления на слайдере
		slider.setMajorTickSpacing(20);
		//мелкие деления
		slider.setMinorTickSpacing(5);
		//заполнение цветом
		slider.putClientProperty("JSlider.isFilled", Boolean.TRUE);
		//инвертирование слайдера
		slider.setInverted(true);
		addSlider(slider,"Filled");
		
		slider=new JSlider();
		slider.setPaintTicks(true);
		//цифровые метки на ползунке
		slider.setPaintLabels(true);
		//крупные деления на слайдере
		slider.setMajorTickSpacing(20);
		//мелкие деления
		slider.setMinorTickSpacing(5);
		addSlider(slider,"Label");
		
		
		//получение клиентской части
		Container pane=getContentPane();
		label=new JLabel("",JLabel.CENTER);
		pane.add(sliderPanel,BorderLayout.CENTER);
		pane.add(label,BorderLayout.SOUTH);
		pane.add(lPanel,BorderLayout.WEST);

	}
		public void addSlider(JSlider s, String name)
		{
			s.addChangeListener(listener);
			JPanel panel = new JPanel();
			panel.add(s);
			panel.add(new JLabel(name));
			sliderPanel.add(panel);
		}
	
}	


		
		