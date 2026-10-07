package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public interface zzaux {
    String zzd(Context context, String str, View view);

    String zze(Context context, String str, View view, Activity activity);

    String zzf(Context context);

    String zzg(Context context);

    String zzh(Context context, View view, Activity activity);

    void zzk(MotionEvent motionEvent);

    @Deprecated
    void zzl(int i, int i10, int i11);

    void zzn(StackTraceElement[] stackTraceElementArr);

    void zzo(View view);
}
