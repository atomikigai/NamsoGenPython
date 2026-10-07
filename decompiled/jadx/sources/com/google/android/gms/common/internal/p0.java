package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Uri f2236d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2239c;

    public p0(String str, String str2, boolean z4) {
        i0.e(str);
        this.f2237a = str;
        i0.e(str2);
        this.f2238b = str2;
        this.f2239c = z4;
    }

    public final Intent a(Context context) {
        Bundle bundleCall;
        Intent intent = null;
        String str = this.f2237a;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.f2239c) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", str);
            try {
                bundleCall = context.getContentResolver().call(f2236d, "serviceIntentCall", (String) null, bundle);
            } catch (IllegalArgumentException e) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundleCall = null;
            }
            intent = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
            }
        }
        return intent == null ? new Intent(str).setPackage(this.f2238b) : intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return i0.m(this.f2237a, p0Var.f2237a) && i0.m(this.f2238b, p0Var.f2238b) && i0.m(null, null) && this.f2239c == p0Var.f2239c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2237a, this.f2238b, null, 4225, Boolean.valueOf(this.f2239c)});
    }

    public final String toString() {
        String str = this.f2237a;
        if (str != null) {
            return str;
        }
        i0.i(null);
        throw null;
    }
}
