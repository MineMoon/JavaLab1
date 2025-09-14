import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		UserInput input = new UserInput();
		Check check = new Check();
		String userInput;
		int[] arr;

		int choice = 2;
		int choiceTask = 0;

		Test test = new Test();

		int argument;
		int firstArgument;
		int secondArgument;
		boolean exit = false;

		do{

			if(choice == 2){
				choiceTask = input.inputDiaposonInt(1,20,"задание");
			}

			switch (choiceTask) {
				case 1:

					System.out.println("Введите число (не менее двух знаков):");
					userInput = scanner.nextLine();
					while (true) {
						if (!check.isInteger(userInput)) {
							System.out.println("Некорректный ввод!");
							System.out.println("Введите число (не менее двух знаков):");
							userInput = scanner.nextLine();
							continue;
						}
						if (userInput.length() < 2) {
							System.out.println("Знаков в числе должно быть не менее двух!");
							System.out.println("Введите число (не менее двух знаков):");
							userInput = scanner.nextLine();
							continue;
						}
						break;
					}
					firstArgument= Integer.parseInt(userInput);
					System.out.println(test.sumLastNums(firstArgument));
					break;

				case 2:

					argument = input.inputInt(0);

					System.out.println(test.isPositive(argument));
					break;

				case 3:

					System.out.println("Введите символ:");
					userInput = scanner.nextLine();
					while (userInput.length()!=1) {
						System.out.println("Некорректный ввод! Вводимым значением должнен быть 1 символ!");
						userInput = scanner.nextLine();
					}

					System.out.println(test.isUpperCase((userInput.charAt(0))));
					break;

				case 4:

					firstArgument = input.inputInt(1);
					secondArgument = input.inputInt(2);

					System.out.println(test.isDivisor(firstArgument, secondArgument));
					break;

				case 5:

					int sum = 0;
					for (int i = 1; i <= 5; i++) {
						argument = input.inputPositiveInt(i);

						if(i==1){
							sum = argument;
							continue;
						}

						System.out.print(sum + " + " + argument + " = ");
						sum=test.lastNumSum(sum, argument);
						System.out.println(sum);
					}
					break;

				case 6:

					firstArgument = input.inputInt(1);
					secondArgument = input.inputInt(2);

					double double_result = test.safeDiv(firstArgument, secondArgument);

					System.out.print("Результат: ");
					if(double_result==Math.floor(double_result)){
						System.out.println(Math.round(double_result));
					} else{
						System.out.println(double_result);
					}
					break;

				case 7:

					firstArgument = input.inputInt(1);
					secondArgument = input.inputInt(2);

					System.out.println(test.makeDecision(firstArgument, secondArgument));
					break;

				case 8:

					argument = input.inputInt(1);
					firstArgument = input.inputInt(2);
					secondArgument = input.inputInt(3);

					System.out.println(test.max3(argument, firstArgument, secondArgument));
					break;

				case 9:

					argument=input.inputInt(0);

					System.out.println(test.age(argument));
					break;

				case 10:

					userInput=input.inputString("день недели");
					test.printDays(userInput);
					break;

				case 11:

					argument=input.inputPositiveInt(0);
					System.out.println(test.reverseListNums(argument));
					break;

				case 12:

					firstArgument = input.inputPositiveInt(1);
					secondArgument = input.inputPositiveInt(2);

					System.out.println(test.pow(firstArgument, secondArgument));
					break;

				case 13:

					argument=input.inputInt(0);
					System.out.println(test.equalNum(argument));
					break;

				case 14:

					argument=input.inputPositiveInt(0);
					test.leftTriangle(argument);
					break;

				case 15:

					test.guessGame();
					break;

				case 16:

					System.out.println("Введите размер массива: ");
					argument=input.inputPositiveInt(0);
					arr=input.inputIntArray(argument);

					argument=input.inputInt(0);
					System.out.println("Результат: " + test.findLast(arr, argument));
					break;

				case 17:

					System.out.println("Введите размер массива: ");
					argument=input.inputPositiveInt(0);
					arr=input.inputIntArray(argument);
					test.PrintArray(arr);

					firstArgument=input.inputDiaposonInt(0,argument,"позицию");
					secondArgument=input.inputPositiveInt(0);
					arr=test.add(arr, secondArgument, firstArgument);
					test.PrintArray(arr);
					break;

				case 18:

					System.out.println("Введите размер массива: ");
					argument=input.inputPositiveInt(0);
					arr=input.inputIntArray(argument);
					test.PrintArray(arr);

					test.reverse(arr);
					test.PrintArray(arr);
					break;

				case 19:

					int[] arr1;
					System.out.println("Введите размер 1-го массива: ");
					argument=input.inputPositiveInt(0);
					arr=input.inputIntArray(argument);

					System.out.println("Введите размер 2-го массива: ");
					argument=input.inputPositiveInt(0);
					arr1=input.inputIntArray(argument);

					System.out.print("1-ый ");
					test.PrintArray(arr);
					System.out.print("2-ый ");
					test.PrintArray(arr1);

					arr=test.concat(arr, arr1);
					test.PrintArray(arr);
					break;

				case 20:

					System.out.println("Введите размер массива: ");
					argument=input.inputPositiveInt(0);
					arr=input.inputIntArray(argument);
					test.PrintArray(arr);

					arr=test.deleteNegative(arr);
					test.PrintArray(arr);
					break;
			}
			System.out.println();

			System.out.println("Повторить?\n1. Да\n2. К выбору задания\n3. Выход");
			choice = input.inputDiaposonInt(1, 3, "вариант");
			if(choice == 3){
				exit = true;
			}
			System.out.println();

		}while(!exit);
	}
}