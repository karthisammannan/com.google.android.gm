import java.io.ByteArrayOutputStream;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class guh
  extends ByteArrayOutputStream
{
  private int a;
  private final int b;
  private boolean c;
  private final Level d;
  private final Logger e;
  
  public guh(Logger paramLogger, Level paramLevel, int paramInt)
  {
    e = ((Logger)hbe.a(paramLogger));
    d = ((Level)hbe.a(paramLevel));
    if (paramInt >= 0) {}
    for (boolean bool = true;; bool = false)
    {
      hbe.a(bool);
      b = paramInt;
      return;
    }
  }
  
  private static void a(StringBuilder paramStringBuilder, int paramInt)
  {
    if (paramInt == 1)
    {
      paramStringBuilder.append("1 byte");
      return;
    }
    paramStringBuilder.append(NumberFormat.getInstance().format(paramInt)).append(" bytes");
  }
  
  public final void close()
  {
    try
    {
      if (!c)
      {
        if (a != 0)
        {
          StringBuilder localStringBuilder = new StringBuilder("Total: ");
          a(localStringBuilder, a);
          if ((count != 0) && (count < a))
          {
            localStringBuilder.append(" (logging first ");
            a(localStringBuilder, count);
            localStringBuilder.append(")");
          }
          e.config(localStringBuilder.toString());
          if (count != 0) {
            e.log(d, toString("UTF-8").replaceAll("[\\x00-\\x09\\x0B\\x0C\\x0E-\\x1F\\x7F]", " "));
          }
        }
        c = true;
      }
      return;
    }
    finally {}
  }
  
  /* Error */
  public final void write(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 61	guh:c	Z
    //   6: ifne +38 -> 44
    //   9: iconst_1
    //   10: istore_2
    //   11: iload_2
    //   12: invokestatic 34	hbe:a	(Z)V
    //   15: aload_0
    //   16: aload_0
    //   17: getfield 63	guh:a	I
    //   20: iconst_1
    //   21: iadd
    //   22: putfield 63	guh:a	I
    //   25: aload_0
    //   26: getfield 73	guh:count	I
    //   29: aload_0
    //   30: getfield 36	guh:b	I
    //   33: if_icmpge +8 -> 41
    //   36: aload_0
    //   37: iload_1
    //   38: invokespecial 107	java/io/ByteArrayOutputStream:write	(I)V
    //   41: aload_0
    //   42: monitorexit
    //   43: return
    //   44: iconst_0
    //   45: istore_2
    //   46: goto -35 -> 11
    //   49: astore_3
    //   50: aload_0
    //   51: monitorexit
    //   52: aload_3
    //   53: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	54	0	this	guh
    //   0	54	1	paramInt	int
    //   10	36	2	bool	boolean
    //   49	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	9	49	finally
    //   11	41	49	finally
  }
  
  /* Error */
  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 61	guh:c	Z
    //   6: ifne +74 -> 80
    //   9: iconst_1
    //   10: istore 6
    //   12: iload 6
    //   14: invokestatic 34	hbe:a	(Z)V
    //   17: aload_0
    //   18: aload_0
    //   19: getfield 63	guh:a	I
    //   22: iload_3
    //   23: iadd
    //   24: putfield 63	guh:a	I
    //   27: aload_0
    //   28: getfield 73	guh:count	I
    //   31: aload_0
    //   32: getfield 36	guh:b	I
    //   35: if_icmpge +42 -> 77
    //   38: aload_0
    //   39: getfield 73	guh:count	I
    //   42: iload_3
    //   43: iadd
    //   44: istore 5
    //   46: iload_3
    //   47: istore 4
    //   49: iload 5
    //   51: aload_0
    //   52: getfield 36	guh:b	I
    //   55: if_icmple +14 -> 69
    //   58: iload_3
    //   59: aload_0
    //   60: getfield 36	guh:b	I
    //   63: iload 5
    //   65: isub
    //   66: iadd
    //   67: istore 4
    //   69: aload_0
    //   70: aload_1
    //   71: iload_2
    //   72: iload 4
    //   74: invokespecial 110	java/io/ByteArrayOutputStream:write	([BII)V
    //   77: aload_0
    //   78: monitorexit
    //   79: return
    //   80: iconst_0
    //   81: istore 6
    //   83: goto -71 -> 12
    //   86: astore_1
    //   87: aload_0
    //   88: monitorexit
    //   89: aload_1
    //   90: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	this	guh
    //   0	91	1	paramArrayOfByte	byte[]
    //   0	91	2	paramInt1	int
    //   0	91	3	paramInt2	int
    //   47	26	4	i	int
    //   44	22	5	j	int
    //   10	72	6	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	9	86	finally
    //   12	46	86	finally
    //   49	69	86	finally
    //   69	77	86	finally
  }
}

/* Location:
 * Qualified Name:     guh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */