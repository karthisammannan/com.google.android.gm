import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;

public abstract class fhm
  extends Binder
  implements fhl
{
  public static fhl a(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IBooleanCallback");
    if ((localIInterface != null) && ((localIInterface instanceof fhl))) {
      return (fhl)localIInterface;
    }
    return new fhn(paramIBinder);
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.google.android.gms.drive.realtime.internal.IBooleanCallback");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IBooleanCallback");
      if (paramParcel1.readInt() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        a(bool);
        paramParcel2.writeNoException();
        return true;
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.drive.realtime.internal.IBooleanCallback");
    if (paramParcel1.readInt() != 0) {}
    for (paramParcel1 = (Status)Status.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
    {
      a(paramParcel1);
      paramParcel2.writeNoException();
      return true;
    }
  }
}

/* Location:
 * Qualified Name:     fhm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */