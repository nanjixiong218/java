package com.practice.page164;
import static com.shadowvip.util.Print.*;//��̬������Ҫ��һ��
public class CovariantReturn {
	public static void main(String args[]){
		Father f = new Father();
	}
}

class Father{
	public void say(){//�������Ҳ��print���Ḳ�ǵ�util�е�print��
		print("father");
	}
}
class Child extends Father{
	public void say(){//ԭ���̳еķ�������ֵҲ��Ҫ���ݵ�,�������void�ĳ�int�ͻ����
		print("child");
	}
}
class Mill{
	Father say(){
		return new Father();
	}
}
class LittleMill extends Mill{
	Child say(){//������õ���java5֮��֧�ֵ�Эͬ����ֵ
		return new Child();
	}
}
