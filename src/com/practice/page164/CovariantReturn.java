package com.practice.page164;
import static com.shadowvip.util.Print.*;//静态引用需要看一下
public class CovariantReturn {
	public static void main(String args[]){
		Father f = new Father();
	}
}

class Father{
	public void say(){//如果这里也叫print，会覆盖掉util中的print。
		print("father");
	}
}
class Child extends Father{
	public void say(){//原来继承的方法返回值也是要兼容的,这里如果void改成int就会出错。
		print("child");
	}
}
class Mill{
	Father say(){
		return new Father();
	}
}
class LittleMill extends Mill{
	Child say(){//这里就用到了java5之后支持的协同返回值
		return new Child();
	}
}
