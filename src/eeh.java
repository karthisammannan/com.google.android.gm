import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.firstparty.dataservice.AccountRemovalRequest;

public final class eeh
  implements Parcelable.Creator<AccountRemovalRequest>
{
  public static AccountRemovalRequest a(Parcel paramParcel)
  {
    Account localAccount = null;
    int j = emh.a(paramParcel);
    int i = 0;
    String str = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = paramParcel.readInt();
      switch (0xFFFF & k)
      {
      default: 
        emh.b(paramParcel, k);
        break;
      case 1: 
        i = emh.e(paramParcel, k);
        break;
      case 2: 
        str = emh.m(paramParcel, k);
        break;
      case 3: 
        localAccount = (Account)emh.a(paramParcel, k, Account.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new emi("Overread allowed size end=" + j, paramParcel);
    }
    return new AccountRemovalRequest(i, str, localAccount);
  }
}

/* Location:
 * Qualified Name:     eeh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */