package com.google.android.gms.auth.frp;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import egq;
import emj;

public class UnlockFactoryResetProtectionResponse
  implements SafeParcelable
{
  public static final egq CREATOR = new egq();
  final int a;
  public final int b;
  
  public UnlockFactoryResetProtectionResponse(int paramInt1, int paramInt2)
  {
    a = paramInt1;
    b = paramInt2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = emj.a(paramParcel, 20293);
    emj.b(paramParcel, 1, a);
    emj.b(paramParcel, 2, b);
    emj.b(paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.frp.UnlockFactoryResetProtectionResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */