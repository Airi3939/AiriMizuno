package lion;



public class LionMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		LionProcess lion = new LionProcess();
		
		lion.setName("ライオン");
		lion.setLength(2.1);
		lion.setSpeed(80);
		
		System.out.println("動物名：" + lion.getName());
		System.out.println("体長：" + lion.getLength() + "m");
		System.out.println("速度：" + lion.getSpeed() + "kn/h");
	}
	

}
