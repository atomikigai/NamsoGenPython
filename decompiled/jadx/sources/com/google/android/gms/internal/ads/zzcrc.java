package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import d6.p;
import e6.s;
import i6.d;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcrc extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context zza;
    private View zzb;

    private zzcrc(Context context) {
        super(context);
        this.zza = context;
    }

    public static zzcrc zza(Context context, View view, zzfet zzfetVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        zzcrc zzcrcVar = new zzcrc(context);
        if (!zzfetVar.zzu.isEmpty() && (resources = zzcrcVar.zza.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            zzfeu zzfeuVar = (zzfeu) zzfetVar.zzu.get(0);
            float f10 = zzfeuVar.zza;
            float f11 = displayMetrics.density;
            zzcrcVar.setLayoutParams(new FrameLayout.LayoutParams((int) (f10 * f11), (int) (zzfeuVar.zzb * f11)));
        }
        zzcrcVar.zzb = view;
        zzcrcVar.addView(view);
        p pVar = p.C;
        zzcaw zzcawVar = pVar.B;
        zzcaw.zzb(zzcrcVar, zzcrcVar);
        zzcaw zzcawVar2 = pVar.B;
        zzcaw.zza(zzcrcVar, zzcrcVar);
        JSONObject jSONObject = zzfetVar.zzah;
        RelativeLayout relativeLayout = new RelativeLayout(zzcrcVar.zza);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            zzcrcVar.zzc(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            zzcrcVar.zzc(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        zzcrcVar.addView(relativeLayout);
        return zzcrcVar;
    }

    private final int zzb(double d10) {
        d dVar = s.f3427f.f3428a;
        return d.o(this.zza, (int) d10);
    }

    private final void zzc(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.zza);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int iZzb = zzb(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, iZzb, 0, iZzb);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, zzb(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.zzb.setY(-iArr[1]);
    }
}
