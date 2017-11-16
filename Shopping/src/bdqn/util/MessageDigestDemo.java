package bdqn.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;



public class MessageDigestDemo {


	public static String run(String text) {
		byte data[] = null;
		MessageDigest m;
		try {
			data = text.getBytes("UTF8");
			//������Ϣժ����ɢ���룩Ҫ���ĵ�һ���Ǵ��� MessageDigest���� ʵ���������е�������һ������ȡĳ�౨��ժҪ�㷨����ɢ���㷨������MD5����  MessageDigest �����;���ǵ��� MessageDigest ���е� getInstance
			m = MessageDigest.getInstance("MD5");//����MessageDigest����
			//�������ݵ�ժҪ�ĵڶ��������ѳ�ʼ����MessageDigest�����ṩ����Ҫ���������
			m.update(data);//������Ҫ������ַ���
			//ͨ������ update ������MessageDigest�����ᴫ��Ҫ��������ݺ���Ϳ��Ե�������ĳ�� digest��ժҪ������������ժҪ��������ɢ���룩
			byte resultData[] = m.digest();//������ϢժҪ
			String encryptedString=convertToHexString(resultData);//���������
			return encryptedString;
		} catch (NoSuchAlgorithmException e) {
			return null;
		} catch (Exception e) {
			return null;
		}	
	}

	static String convertToHexString(byte data[]) {
		StringBuffer strBuffer = new StringBuffer();
		for (int i = 0; i < data.length; i++) {
			strBuffer.append(Integer.toHexString(0xff & data[i]));
		}
		return strBuffer.toString();
	}	 
}

