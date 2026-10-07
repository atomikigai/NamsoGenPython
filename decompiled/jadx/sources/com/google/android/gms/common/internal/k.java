package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.common.zzc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends h7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2212c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f2213d;
    public IBinder e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Scope[] f2214f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Bundle f2215r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Account f2216s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public g7.d[] f2217t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public g7.d[] f2218u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f2219v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f2220w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f2221x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f2222y;
    public static final Parcelable.Creator<k> CREATOR = new b8.f(16);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Scope[] f2209z = new Scope[0];
    public static final g7.d[] A = new g7.d[0];

    public k(int i, int i10, int i11, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, g7.d[] dVarArr, g7.d[] dVarArr2, boolean z4, int i12, boolean z10, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? f2209z : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        g7.d[] dVarArr3 = A;
        g7.d[] dVarArr4 = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr3 = dVarArr2 != null ? dVarArr2 : dVarArr3;
        this.f2210a = i;
        this.f2211b = i10;
        this.f2212c = i11;
        if ("com.google.android.gms".equals(str)) {
            this.f2213d = "com.google.android.gms";
        } else {
            this.f2213d = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i13 = a.f2173a;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface v0Var = iInterfaceQueryLocalInterface instanceof n ? (n) iInterfaceQueryLocalInterface : new v0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        v0 v0Var2 = (v0) v0Var;
                        Parcel parcelZzB = v0Var2.zzB(2, v0Var2.zza());
                        Account account3 = (Account) zzc.zza(parcelZzB, Account.CREATOR);
                        parcelZzB.recycle();
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    }
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    throw th;
                }
            }
            this.f2216s = account2;
        } else {
            this.e = iBinder;
            this.f2216s = account;
        }
        this.f2214f = scopeArr2;
        this.f2215r = bundle2;
        this.f2217t = dVarArr4;
        this.f2218u = dVarArr3;
        this.f2219v = z4;
        this.f2220w = i12;
        this.f2221x = z10;
        this.f2222y = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        b8.f.a(this, parcel, i);
    }
}
