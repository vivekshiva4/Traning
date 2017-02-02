package inheritance;

public class Test {

	public static void main(String[] args) {
		PlayerPeice p=new PlayerPeice();
		TilePeice t=new TilePeice();
		doshapes(p);
		doshapes(t);
	}
		public  static void doshapes(GamePeice s)
		{
			s.diplay();
		}

	}


