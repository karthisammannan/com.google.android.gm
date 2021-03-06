import java.nio.charset.Charset;

public final class idb
{
  public static final Charset a = Charset.forName("ISO-8859-1");
  public static final Charset b = Charset.forName("US-ASCII");
  public static final Charset c = Charset.forName("UTF-16");
  public static final Charset d = Charset.forName("UTF-16BE");
  public static final Charset e = Charset.forName("UTF-16LE");
  public static final Charset f = Charset.forName("UTF-8");
  
  public static Charset a(String paramString)
  {
    if (paramString == null) {
      return Charset.defaultCharset();
    }
    return Charset.forName(paramString);
  }
  
  public static Charset a(Charset paramCharset)
  {
    Charset localCharset = paramCharset;
    if (paramCharset == null) {
      localCharset = Charset.defaultCharset();
    }
    return localCharset;
  }
}

/* Location:
 * Qualified Name:     idb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */