package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DrivePreferences;
import emj;
import fcx;

public class OnDrivePreferencesResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator<OnDrivePreferencesResponse> CREATOR = new fcx();
  final int a;
  DrivePreferences b;
  
  public OnDrivePreferencesResponse(int paramInt, DrivePreferences paramDrivePreferences)
  {
    a = paramInt;
    b = paramDrivePreferences;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = emj.a(paramParcel, 20293);
    emj.b(paramParcel, 1, a);
    emj.a(paramParcel, 2, b, paramInt, false);
    emj.b(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.internal.OnDrivePreferencesResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */