import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.firstparty.dataservice.ValidateAccountCredentialsResponse;

public final class efo
  implements Parcelable.Creator<ValidateAccountCredentialsResponse>
{
  public static ValidateAccountCredentialsResponse a(Parcel paramParcel)
  {
    int j = 0;
    int k = emh.a(paramParcel);
    String str = null;
    int i = 0;
    while (paramParcel.dataPosition() < k)
    {
      int m = paramParcel.readInt();
      switch (0xFFFF & m)
      {
      default: 
        emh.b(paramParcel, m);
        break;
      case 1: 
        i = emh.e(paramParcel, m);
        break;
      case 2: 
        j = emh.e(paramParcel, m);
        break;
      case 3: 
        str = emh.m(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new emi("Overread allowed size end=" + k, paramParcel);
    }
    return new ValidateAccountCredentialsResponse(i, j, str);
  }
}

/* Location:
 * Qualified Name:     efo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */