package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.nativead.NativeAd;
import d6.p;
import n6.b;
import n6.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdwi {
    public static final void zza(Context context, ViewGroup viewGroup, AdView adView) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setTag("layout");
        zzf(linearLayout, -1, -1);
        linearLayout.setGravity(17);
        linearLayout.addView(adView);
        adView.setTag("ad_view");
        viewGroup.addView(linearLayout);
    }

    public static final void zzb(Context context, ViewGroup viewGroup, NativeAd nativeAd) {
        i iVar = new i(context);
        iVar.setTag("ad_view_tag");
        zzf(iVar, -1, -1);
        viewGroup.addView(iVar);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setTag("layout_tag");
        linearLayout.setOrientation(1);
        zzf(linearLayout, -1, -1);
        linearLayout.setBackgroundColor(-1);
        iVar.addView(linearLayout);
        Resources resourcesZze = p.C.f2982g.zze();
        linearLayout.addView(zzc(context, resourcesZze == null ? "Headline" : resourcesZze.getString(R.string.native_headline), "headline_header_tag"));
        View viewZzd = zzd(context, zzfxf.zzc(nativeAd.getHeadline()), "headline_tag");
        iVar.setHeadlineView(viewZzd);
        linearLayout.addView(viewZzd);
        linearLayout.addView(zzc(context, resourcesZze == null ? "Body" : resourcesZze.getString(R.string.native_body), "body_header_tag"));
        View viewZzd2 = zzd(context, zzfxf.zzc(nativeAd.getBody()), "body_tag");
        iVar.setBodyView(viewZzd2);
        linearLayout.addView(viewZzd2);
        linearLayout.addView(zzc(context, resourcesZze == null ? "Media View" : resourcesZze.getString(R.string.native_media_view), "media_view_header_tag"));
        b bVar = new b(context);
        bVar.setTag("media_view_tag");
        iVar.setMediaView(bVar);
        linearLayout.addView(bVar);
        iVar.setNativeAd(nativeAd);
    }

    private static TextView zzc(Context context, String str, String str2) {
        return zze(context, str, android.R.style.TextAppearance.Small, -9210245, 0.0f, str2);
    }

    private static TextView zzd(Context context, String str, String str2) {
        return zze(context, str, android.R.style.TextAppearance.Medium, -16777216, 12.0f, str2);
    }

    private static TextView zze(Context context, String str, int i, int i10, float f10, String str2) {
        TextView textView = new TextView(context);
        textView.setTag(str2);
        zzf(textView, -2, -2);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, f10, textView.getResources().getDisplayMetrics());
        textView.setLayoutParams(marginLayoutParams);
        textView.setTextAppearance(context, i);
        textView.setTextColor(i10);
        textView.setText(str);
        return textView;
    }

    private static void zzf(View view, int i, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
        layoutParams2.height = i;
        layoutParams2.width = i10;
        view.setLayoutParams(layoutParams2);
    }
}
