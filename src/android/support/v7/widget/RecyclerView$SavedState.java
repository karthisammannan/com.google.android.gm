package android.support.v7.widget;

import akw;
import ald;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

public class RecyclerView$SavedState
  extends View.BaseSavedState
{
  public static final Parcelable.Creator<SavedState> CREATOR = new ald();
  Parcelable a;
  
  public RecyclerView$SavedState(Parcel paramParcel)
  {
    super(paramParcel);
    a = paramParcel.readParcelable(akw.class.getClassLoader());
  }
  
  RecyclerView$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeParcelable(a, 0);
  }
}

/* Location:
 * Qualified Name:     android.support.v7.widget.RecyclerView.SavedState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */