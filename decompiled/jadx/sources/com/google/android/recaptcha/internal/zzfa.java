package com.google.android.recaptcha.internal;

import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
import ub.f;
import vb.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfa {
    public static final zzfa zza = new zzfa();

    private zzfa() {
    }

    public static final Map zza() {
        f[] fVarArr = {new f(-4, zzl.zzz), new f(-12, zzl.zzA), new f(-6, zzl.zzv), new f(-11, zzl.zzx), new f(-13, zzl.zzB), new f(-14, zzl.zzC), new f(-2, zzl.zzw), new f(-7, zzl.zzD), new f(-5, zzl.zzE), new f(-9, zzl.zzF), new f(-8, zzl.zzP), new f(-15, zzl.zzy), new f(-1, zzl.zzG), new f(-3, zzl.zzI), new f(-10, zzl.zzJ)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(t.A(15));
        t.C(linkedHashMap, fVarArr);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            linkedHashMap.put(-16, zzl.zzH);
        }
        if (i >= 27) {
            linkedHashMap.put(1, zzl.zzL);
            linkedHashMap.put(2, zzl.zzM);
            linkedHashMap.put(0, zzl.zzN);
            linkedHashMap.put(3, zzl.zzO);
        }
        if (i >= 29) {
            linkedHashMap.put(4, zzl.zzK);
        }
        return linkedHashMap;
    }
}
