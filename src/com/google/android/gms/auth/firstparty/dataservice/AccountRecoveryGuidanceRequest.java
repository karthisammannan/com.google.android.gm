package com.google.android.gms.auth.firstparty.dataservice;

import android.accounts.Account;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import eee;
import emj;

public class AccountRecoveryGuidanceRequest
  implements SafeParcelable
{
  public static final eee CREATOR = new eee();
  final int a;
  @Deprecated
  public final String b;
  public final Account c;
  
  public AccountRecoveryGuidanceRequest(int paramInt, String paramString, Account paramAccount)
  {
    a = paramInt;
    b = paramString;
    if ((paramAccount == null) && (!TextUtils.isEmpty(paramString)))
    {
      c = new Account(paramString, "com.google");
      return;
    }
    c = paramAccount;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    int i = emj.a(paramParcel, 20293);
    emj.b(paramParcel, 1, a);
    emj.a(paramParcel, 2, b, false);
    emj.a(paramParcel, 3, c, paramInt, false);
    emj.b(paramParcel, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.firstparty.dataservice.AccountRecoveryGuidanceRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */