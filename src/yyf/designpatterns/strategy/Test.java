package yyf.designpatterns.strategy;

/**
 * 策略模式测试
 * 
 * @author Yu Yufeng
 *
 */
public class Test {
	public static void main(String[] args) {
		Context context;
		context = new Context(new StrategyA());
		context.operate();

		context.setStrategy(new StrategyB());
		context.operate();
	}

}
