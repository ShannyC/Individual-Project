
public class boys
	{

		public static Object boys;
		private String names;
		private String description;
		private double height;

		
		public boys (String n, String d, double h)		
			{
				names = n;
				description = d;
				height = h;

			}
		public String getNames()
			{
				return names;
			}

		public void setNames(String name)
			{
				this.names = names;
			}

		public  String getDescription()
			{
				return description;
			}

		public void setDescription(Object object)
			{
				this.description = (String) object;
			}

		public double getHeight()
			{
				return height;
			}

		public void setHeight(int Height)
			{
				this.height = height;
			}

	}

	
