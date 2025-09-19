import java.util.Random;

public class Test {

	private final Random rand = new Random();
	private final UserInput input = new UserInput();
	private final String[] days = {"понедельник","вторник","среда","четверг","пятница","суббота","воскресение"};


	public int sumLastNums (int x){
		x = Math.abs(x);
		if (Integer.toString(x).length() < 2){
			return 0;
		}
		int sum = 0;
		sum = x % 10;
		x = x / 10;
		sum += x % 10;
		return sum;
	}

	public boolean isPositive (int x){
		return x >= 0;
	}

	public boolean isUpperCase (char x){
		return (int)x >= 65 && (int)x <= 90;
	}

	public boolean isDivisor (int a, int b){
		return a % b == 0 || b % a == 0;
	}

	public int lastNumSum(int a, int b){
		a = Math.abs(a);
		b = Math.abs(b);
		return (a % 10)+ (b % 10);
	}

	public double safeDiv (int x, int y){
		if( y == 0 ){
			return 0;
		}
		return x / (double) y;
	}

	public String makeDecision (int x, int y){
		if(x > y){
			return x + " > " + y;
		} else if (x < y){
			return x + " < " + y;
		} else{
			return x + " == " + y;
		}
	}

	public boolean max3 (int x, int y, int z){
		return (x+y==z)||(x+z==y)||(z+y==x);
	}

	public String age (int x){
		if(x<0){
			return "ERROR";
		}
		if((x % 10) == 1 && x != 11){
			return x + " год";
		} else if(((x % 10) == 2||(x % 10) == 3||(x % 10) == 4) && !(x == 12 || x == 13 || x == 14)){
			return x + " года";
		} else {
			return x + " лет";
		}
	}

	private void printDiaposonDays(int start){
		if(start < 0 || start > 6){
			return;
		}
		if(6 >days.length-1){
			return;
		}
		if(start == 6){
			System.out.println(days[start]);
		}
		else{
			for(int i = start; i <= 6; i++){
				System.out.println(days[i]);
			}
		}

	}
	public void printDays (String x){
		switch (x){
			case "понедельник":
				printDiaposonDays(0);
				break;
			case "вторник":
				printDiaposonDays(1);
				break;
			case "среда":
				printDiaposonDays(2);

				break;
			case "четверг":
				printDiaposonDays(3);
				break;
			case "пятница":
				printDiaposonDays(4);
				break;
			case "суббота":
				printDiaposonDays(5);
				break;
			case "воскресение":
				printDiaposonDays(6);
				break;
			default:
				System.out.println("Это не день недели!");
		}
	}

	public String reverseListNums (int x){
		if(x < 0){
			return "ERROR";
		}
		String result = "";
		for (int i = x; i > 0; i--){
			result += i + " ";
		}
		result += "0";
		return result;
	}

	public int pow (int x, int y){
		if(x < 0 || y < 0){
			return 0;
		}
		if(y == 0){
			return 1;
		}
		int result = 1;
		for (int i = 0; i < y; i++) {
			result *= x;
		}
		return result;
	}

	public boolean equalNum (int x){
		x = Math.abs(x);
		while (Integer.toString(x).length() != 1){
			if(x % 10 == x / 10 % 10){
				x /= 10;
			}
			else{
				return false;
			}
		}
		return true;
	}

	public void leftTriangle (int x){
		if(x<1){
			return;
		}

		for(int i = 1; i <= x; i++){
			for(int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void guessGame(){
		int secret = rand.nextInt(0,10);
		int attempt = 0;
		int guess = input.inputDiaposonInt(0,9,"число");
		while (guess < 0 || guess > 9){
			System.out.println("Диапозон от 0 до 9!!!");
			guess = input.inputDiaposonInt(0,9,"число");
		}
		attempt++;

		while (secret != guess){
			System.out.println("Вы не угадали! ");
			guess = input.inputDiaposonInt(0,9,"число");
			while (guess < 0 || guess > 9){
				System.out.println("Диапозон от 0 до 9!!!");
				guess = input.inputDiaposonInt(0,9,"число");
			}
			attempt++;
		}
		System.out.println("Вы угадали!");
		System.out.print("Вы отгадали число за " + attempt+" попытки!");
	}

	public int findLast (int[] arr, int x){
		for(int i = arr.length-1; i >= 0; i--){
			if(arr[i] == x){
				return i;
			}
		}
		return -1;
	}

	public void PrintArray (int[] arr){
		System.out.println("Массив: ");
		if(arr.length == 0){
			System.out.println("[Пустой массив]");;
		}
		else{
			for (int j : arr) {
				System.out.print(j + " ");
			}
		}
		System.out.println();
	}
	public int[]add (int[] arr, int x, int pos){
		if(pos < 0 || pos > arr.length){
			return null;
		}
		int[] new_arr = new int[arr.length+1];
		int i = 0;
		while (i!=pos){
			new_arr[i]=arr[i];
			i++;
		}
		new_arr[pos]=x;

		while (i!=arr.length){
			new_arr[i+1]=arr[i];
			i++;
		}
		return new_arr;
	}

	public void reverse(int[] arr) {
		int i = 0;
		while (i < arr.length / 2) {
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
			i++;
		}
	}

	public int[] concat (int[] arr1, int[] arr2){
		int[] result = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			result[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			result[i + arr1.length] = arr2[i];
		}
		return result;
	}

	public int[] deleteNegative(int[] arr) {
		int count = 0;
		for (int num : arr) {
			if (num >= 0) {
				count++;
			}
		}

		int[] result = new int[count];
		int i = 0;

		for (int num : arr) {
			if (num >= 0) {
				result[i] = num;
				i++;
			}
		}

		return result;
	}
}
