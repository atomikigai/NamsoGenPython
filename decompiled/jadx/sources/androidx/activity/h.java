package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends androidx.activity.result.g {
    public final /* synthetic */ m h;

    public h(m mVar) {
        this.h = mVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.activity.result.g
    public final void b(int i, com.bumptech.glide.d dVar, Object obj) {
        Bundle bundleExtra;
        int i10;
        m mVar = this.h;
        a4.b bVarS = dVar.s(mVar, obj);
        if (bVarS != null) {
            new Handler(Looper.getMainLooper()).post(new g(this, i, bVarS, 0));
            return;
        }
        Intent intentG = dVar.g(mVar, obj);
        if (intentG.getExtras() != null && intentG.getExtras().getClassLoader() == null) {
            intentG.setExtrasClassLoader(mVar.getClassLoader());
        }
        if (intentG.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentG.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentG.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentG.getAction())) {
            String[] stringArrayExtra = intentG.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (int i11 = 0; i11 < stringArrayExtra.length; i11++) {
                if (TextUtils.isEmpty(stringArrayExtra[i11])) {
                    throw new IllegalArgumentException(q1.a.m(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i11], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i11));
                }
            }
            int size = hashSet.size();
            String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
            if (size > 0) {
                if (size == stringArrayExtra.length) {
                    return;
                }
                int i12 = 0;
                for (int i13 = 0; i13 < stringArrayExtra.length; i13++) {
                    if (!hashSet.contains(Integer.valueOf(i13))) {
                        strArr[i12] = stringArrayExtra[i13];
                        i12++;
                    }
                }
            }
            if (mVar instanceof d0.c) {
            }
            d0.b.b(mVar, stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentG.getAction())) {
            d0.a.b(mVar, intentG, i, bundle);
            return;
        }
        androidx.activity.result.h hVar = (androidx.activity.result.h) intentG.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            i10 = i;
            try {
                d0.a.c(mVar, hVar.f402a, i10, hVar.f403b, hVar.f404c, hVar.f405d, 0, bundle);
            } catch (IntentSender.SendIntentException e) {
                e = e;
                new Handler(Looper.getMainLooper()).post(new g(this, i10, e, 1));
            }
        } catch (IntentSender.SendIntentException e4) {
            e = e4;
            i10 = i;
        }
    }
}
