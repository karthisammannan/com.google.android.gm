package com.android.mail.providers;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class ListParams$1
  implements Parcelable.Creator<ListParams>
{
  public ListParams createFromParcel(Parcel paramParcel)
  {
    return new ListParams(paramParcel);
  }
  
  public ListParams[] newArray(int paramInt)
  {
    return new ListParams[paramInt];
  }
}

/* Location:
 * Qualified Name:     com.android.mail.providers.ListParams.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */