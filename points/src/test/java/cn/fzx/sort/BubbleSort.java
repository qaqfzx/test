package cn.fzx.sort;

/**
 * 冒泡排序
 * 个人理解：就像冒气泡一样，最大的元素从底部上升的顶部。（感觉像是废话）
 *
 *
 *
 * 第一次遍历：依次遍历相邻的两个元素（1和2，  2和3，……），如果第一个比第二个大，就交换他们两个。
 *
 * （第一次遍历完就可以保证最大的元素在最后一位
 *
 * 循环不变量：遍历的过程中，可以保证当前遍历的位置，比前面所有元素都要大）
 * @author fangzhixiang
 * @date 2023-01-03
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] arrays = {3, 38, 5, 44, 15, 36};
		System.out.print("原始arrays = ");
		for (int array : arrays) {
			System.out.print(array +", ");
		}
		bubbleSort(arrays);
		System.out.println();
		System.out.print("排序后arrays = ");
		for (int array : arrays) {
			System.out.print(array +", ");
		}

	}

	public static void bubbleSort(int[] arrays){

		int temp = 0;
		for (int i = 0; i < arrays.length - 1; i++) {
			for (int j = i; j < arrays.length -1; j++) {
				if (arrays[j] > arrays[j + 1]) {
					temp = arrays[j];
					arrays[j] = arrays[j + 1];
					arrays[j + 1] = temp;
				}
			}
		}
	}

}
