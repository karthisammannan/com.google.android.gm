import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.search.global.SetExperimentIdsCall.Request;

public final class fzv
  implements Parcelable.Creator<SetExperimentIdsCall.Request>
{
  public static SetExperimentIdsCall.Request a(Parcel paramParcel)
  {
    boolean bool = false;
    int j = emh.a(paramParcel);
    byte[] arrayOfByte = null;
    int i = 0;
    while (paramParcel.dataPosition() < j)
    {
      int k = paramParcel.readInt();
      switch (0xFFFF & k)
      {
      default: 
        emh.b(paramParcel, k);
        break;
      case 1000: 
        i = emh.e(paramParcel, k);
        break;
      case 1: 
        arrayOfByte = emh.p(paramParcel, k);
        break;
      case 2: 
        bool = emh.c(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new emi("Overread allowed size end=" + j, paramParcel);
    }
    return new SetExperimentIdsCall.Request(i, arrayOfByte, bool);
  }
}

/* Location:
 * Qualified Name:     fzv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */