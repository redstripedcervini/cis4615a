public class Main
{
	public static void main(String[] args)
	{

	}

  public static long getInteger(DataInputStream is) throws IOException
  {
    return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
  }

}
