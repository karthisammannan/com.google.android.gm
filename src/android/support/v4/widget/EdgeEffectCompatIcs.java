package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;

class EdgeEffectCompatIcs
{
  public static boolean draw(Object paramObject, Canvas paramCanvas)
  {
    return ((EdgeEffect)paramObject).draw(paramCanvas);
  }
  
  public static void finish(Object paramObject)
  {
    ((EdgeEffect)paramObject).finish();
  }
  
  public static boolean isFinished(Object paramObject)
  {
    return ((EdgeEffect)paramObject).isFinished();
  }
  
  public static Object newEdgeEffect(Context paramContext)
  {
    return new EdgeEffect(paramContext);
  }
  
  public static boolean onPull(Object paramObject, float paramFloat)
  {
    ((EdgeEffect)paramObject).onPull(paramFloat);
    return true;
  }
  
  public static boolean onRelease(Object paramObject)
  {
    paramObject = (EdgeEffect)paramObject;
    ((EdgeEffect)paramObject).onRelease();
    return ((EdgeEffect)paramObject).isFinished();
  }
  
  public static void setSize(Object paramObject, int paramInt1, int paramInt2)
  {
    ((EdgeEffect)paramObject).setSize(paramInt1, paramInt2);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.widget.EdgeEffectCompatIcs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */