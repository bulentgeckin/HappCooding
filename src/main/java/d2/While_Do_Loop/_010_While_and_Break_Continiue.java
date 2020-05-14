package d2.While_Do_Loop;

public class _010_While_and_Break_Continiue {

	public static void main(String args[]) {

		// 1.2.3 stop

		int i = 0;
		while (i < 6) {
			System.out.print(i+" ");
			i++;
			if (i == 4) {
				break;
			}
		}

		System.out.println();

		// 1.2.3.5.6
		i = 0;
		while (i < 6) {
			if (i == 4) {
				i++;
				continue;
			}
			System.out.print(i+" ");
			i++;
		}

	}

}
