package array.controller;

public class ArrayController
{
	private int [] [] NumberofBooks;
	private String [] [] Monkies;
	private String [] [] Fruits;
	
		public ArrayController()
		{
			int [][] NumberofBooks = new int [5][3];
			String [][] Monkies= new String [4][4];
		}
	
		/**
		 * @return the chooChooTrain
		 */
		public int[][] getChooChooTrain()
		{
			return NumberofBooks;
		}

		/**
		 * @param chooChooTrain the chooChooTrain to set
		 */
		public void setChooChooTrain(int[][] chooChooTrain)
		{
			NumberofBooks = chooChooTrain;
		}

		/**
		 * @return the monkies
		 */
		public String[][] getMonkies()
		{
			return Monkies;
		}

		/**
		 * @param monkies the monkies to set
		 */
		public void setMonkies(String[][] monkies)
		{
			Monkies = monkies;
		}

		/**
		 * @return the fruits
		 */
		public String[][] getFruits()
		{
			return Fruits;
		}

		/**
		 * @param fruits the fruits to set
		 */
		public void setFruits(String[][] fruits)
		{
			Fruits = fruits;
		}

		public void start()
		{
			fillTheMonkies();
			fillTheTwoDArray();
			fillTheFruitBasket();
		}
		
		
		public int[][] fillTheTwoDArray()
		{
			int [][] numberOfBooks = new int [5][3];
			 for (int row = 0; row < numberOfBooks.length; row++)
			{
				for(int col = 0; col < numberOfBooks[0].length; col++)
				{
					numberOfBooks [row][col] = 4;
				}
			}
			
			return numberOfBooks;
		}
		
		public void fillTheMonkies()
		{
			String[][] Monkies = new String [4][4];
			
			Monkies [0][0] = new String("Baboon");
			Monkies [0][1] = new String("Orangutan");
			Monkies [0][2] = new String("SpiderMonkey");
			Monkies [0][3] = new String("Bobo");
			Monkies [1][0] = new String("DiddyKong");
			Monkies [1][1] = new String("BatMonkey");
			Monkies [1][2] = new String("IronMonkey");
			Monkies [1][3] = new String("Jerry");
			Monkies [2][0] = new String("Jake From State Farm");
			Monkies [2][1] = new String("President Monkey");
			Monkies [2][2] = new String("Chef Monkey");
			Monkies [2][3] = new String("British spying monkey");
			Monkies [3][0] = new String("The bananna addict");
			Monkies [3][1] = new String("Monkey Chairman");
			Monkies [3][2] = new String("CEO monkey");
			Monkies [3][3] = new String("Robot Monkey");
		}
		
		public String[][] fillTheFruitBasket()
		{
			String [] [] Fruits = new String[6][4];
			 for (int row = 0; row < Fruits.length; row++)
			{
				for(int col = 0; col < Fruits[0].length; col++)
				{
					Fruits[row][col] = "Bananna";
				}
			}
			
			return Fruits;
		}
}
