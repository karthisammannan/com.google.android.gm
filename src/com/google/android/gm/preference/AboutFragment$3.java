package com.google.android.gm.preference;

import android.text.style.URLSpan;
import android.view.View;
import com.google.android.gm.Utils;

class AboutFragment$3
  extends URLSpan
{
  AboutFragment$3(AboutFragment paramAboutFragment, String paramString)
  {
    super(paramString);
  }
  
  public void onClick(View paramView)
  {
    Utils.showOpenSourceLicenses(paramView.getContext());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gm.preference.AboutFragment.3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */