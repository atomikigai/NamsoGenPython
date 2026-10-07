package com.google.android.gms.internal.p000authapi;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.internal.i0;
import x6.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zbn {
    public static PendingIntent zba(Context context, a aVar, HintRequest hintRequest, String str) {
        i0.j(context, "context must not be null");
        i0.j(hintRequest, "request must not be null");
        if (TextUtils.isEmpty(str)) {
            str = zbbb.zba();
        } else {
            i0.i(str);
        }
        Intent intentPutExtra = new Intent("com.google.android.gms.auth.api.credentials.PICKER").setPackage("com.google.android.gms").putExtra("claimedCallingPackage", (String) null).putExtra("logSessionId", str);
        Parcel parcelObtain = Parcel.obtain();
        hintRequest.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        intentPutExtra.putExtra("com.google.android.gms.credentials.HintRequest", bArrMarshall);
        return PendingIntent.getActivity(context, 2000, intentPutExtra, zbbc.zba | 134217728);
    }
}
