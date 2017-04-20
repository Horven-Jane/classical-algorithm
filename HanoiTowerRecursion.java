/**
 * 汉诺塔问题,递归实现.
 * 
 * 当只有一个盘子的时候，只需要将A塔上的一个盘子移到C塔上。
 * 
 * 当A塔上有两个盘子时，先将A塔上的1号盘子（编号从上到下）移动到B塔上，再将A塔上的2号盘子移动的C塔上，
 * 最后将B塔上的小盘子移动到C塔上。
 * 
 * 当A塔上有3个盘子时，先将A塔上编号1至2的盘子（共2个）移动到B塔上（需借助C塔），然后将A塔上的3号最大的盘子移动到C塔，
 * 最后将B塔上的两个盘子借助A塔移动到C塔上。
 * 
 * 当A塔上有n个盘子时，先将A塔上编号1至n-1的盘子（共n-1个）移动到B塔上（借助C塔），然后将A塔上最大的n号盘子移动到C塔上，
 * 最后将B塔上的n-1个盘子借助A塔移动到C塔上。
 * 
 * 综上所述，除了只有一个盘子时不需要借助其他塔外，其余情况均一样（只是事件的复杂程度不一样）。
 * @author zhf
 *
 */
public class HanoiTowerRecursion {
	
	public static void main(String[] args) {
		int n = 3;
		char a = 'A', b = 'B', c = 'C';		
		hanoiTower(n, a, b, c);
	}

	/**
	 * 将个盘子，从柱子a 移动到柱子 c，借助柱子 b 完成
	 */
	private static void hanoiTower(int n, char a, char b, char c) {
		if(n == 1){  //只有一个盘子时,直接从a移动到c即可。
			move(n, a, c);
		} else {
			hanoiTower(n-1, a, c, b);
			move(n, a, c);
			hanoiTower(n-1, b, a, c);
		}
	}

	private static void move(int n, char a, char c) {
		System.out.printf("将%d号盘子,从柱子%c移动到柱子%c\n", n, a, c);
	}
	
} 
