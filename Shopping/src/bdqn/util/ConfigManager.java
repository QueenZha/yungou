package bdqn.util;

import java.io.InputStream;
import java.util.Properties;



public class ConfigManager {
	//��������ľ�̬����
	private static ConfigManager manager=new ConfigManager();	
	// ������ȡproperties�ļ��Ķ���
	private static Properties properties;	
	//˽�л�����
	protected ConfigManager(){
		//�����ǵ�jdbc.propertiesת����������
		properties=new Properties();
		InputStream stream =ConfigManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		try {
			//�����ļ�
			properties.load(stream);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				//�ͷ���Դ
				stream.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	//�����ṩ���ʱ���Ľӿ�
	public static synchronized ConfigManager getInstance(){
		return manager;
	}
	//����Key��ȡvalue
	public static String getValue(String key){
		return properties.getProperty(key);
		
	}
}
