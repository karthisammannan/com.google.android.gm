public final class hrk
  extends hln<hrk>
{
  private static volatile hrk[] d;
  public hqs a;
  public Integer b = null;
  public Long c = null;
  
  public hrk()
  {
    E = -1;
  }
  
  public static hrk[] b()
  {
    if (d == null) {}
    synchronized (hlr.c)
    {
      if (d == null) {
        d = new hrk[0];
      }
      return d;
    }
  }
  
  protected final int a()
  {
    int j = super.a();
    int i = j;
    if (a != null) {
      i = j + hll.d(1, a);
    }
    j = i;
    if (b != null) {
      j = i + hll.c(2, b.intValue());
    }
    i = j;
    if (c != null) {
      i = j + hll.c(3, c.longValue());
    }
    return i;
  }
  
  public final void a(hll paramhll)
  {
    if (a != null) {
      paramhll.b(1, a);
    }
    if (b != null) {
      paramhll.a(2, b.intValue());
    }
    if (c != null) {
      paramhll.a(3, c.longValue());
    }
    super.a(paramhll);
  }
}

/* Location:
 * Qualified Name:     hrk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */