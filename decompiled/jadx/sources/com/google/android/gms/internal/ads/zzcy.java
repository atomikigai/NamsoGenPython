package com.google.android.gms.internal.ads;

import android.text.Spannable;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcy {
    public static void zza(Spannable spannable, float f10, int i, int i10, int i11) {
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) spannable.getSpans(i, i10, RelativeSizeSpan.class)) {
            if (spannable.getSpanStart(relativeSizeSpan) <= i && spannable.getSpanEnd(relativeSizeSpan) >= i10) {
                f10 = relativeSizeSpan.getSizeChange() * f10;
            }
            zzc(spannable, relativeSizeSpan, i, i10, 33);
        }
        spannable.setSpan(new RelativeSizeSpan(f10), i, i10, 33);
    }

    public static void zzb(Spannable spannable, Object obj, int i, int i10, int i11) {
        for (Object obj2 : spannable.getSpans(i, i10, obj.getClass())) {
            zzc(spannable, obj2, i, i10, 33);
        }
        spannable.setSpan(obj, i, i10, 33);
    }

    private static void zzc(Spannable spannable, Object obj, int i, int i10, int i11) {
        if (spannable.getSpanStart(obj) == i && spannable.getSpanEnd(obj) == i10 && spannable.getSpanFlags(obj) == 33) {
            spannable.removeSpan(obj);
        }
    }
}
