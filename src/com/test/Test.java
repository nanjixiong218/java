package com.test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.practice.page123.*;
import com.practice.page210.*;
public class Test {
	public static void main(String arges[]){
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(1);
		numList.add(2);
		numList.add(3);
		numList.add(4);
		
		/*Iterator<Integer> numI = numList.iterator();
		while(numI.hasNext()){
			System.out.println(numI.next());
			//java������Ϊʲô�����޸�Ԫ�أ��Ҳ�����������
			if(numI.next()==2){
				numI.remove();
			}
		}
		System.out.println(numList.size());
		*/
		
		while(numList.size()>0){
			for(int it : new ArrayList<Integer>(numList)){//�´���һ��ArrayList�����˱�����ͬʱ�����޸ĵ����⡣
				System.out.println(it);
					numList.remove((Integer)it);
					
					//numList.remove(it);����������ͬ�����ص���
			}
		}
		System.out.println(numList.size());
		
		/*for(int i = 0, len = numList.size(); i<len; i++){
			int a = numList.get(i);
			System.out.println(a);
			numList.remove(i);
		}*/
		
	}
}
