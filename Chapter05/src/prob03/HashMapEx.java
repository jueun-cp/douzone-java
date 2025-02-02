package prob03;

import java.util.*;

public class HashMapEx {

	public static void main(String[] args) {
		//Map collection ���� 
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//��ü ����
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		// ���� ȫ�浿�̶�� Ű�� �̹� �־� �������� ������ ������ ��ġ
		map.put("ȫ�浿", 95); 
		System.out.println("�� Entry ��: "+ map.size());
		
		//��ü ã��
		//Ű�� �� �˻�
		System.out.println("\tȫ�浿 : " + map.get("ȫ�浿"));
		System.out.println("");
		
		//��ü �ϳ��� ó��
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}System.out.println("");

		//��ü ����
		map.remove("ȫ�浿");
		System.out.println("�� Entry ��: "+map.size());
		
		//��ü �ϳ��� ó��
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println("");
		
		//��ü ��ü ����
		map.clear();
		System.out.println("�� Entry ��: " + map.size());
	}

}
