package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends zzb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f2223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2224b;

    public k0(f fVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f2223a = fVar;
        this.f2224b = i;
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i10) {
        int i11 = this.f2224b;
        if (i == 1) {
            int i12 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
            zzc.zzb(parcel);
            i0.j(this.f2223a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f2223a.onPostInitHandler(i12, strongBinder, bundle, i11);
            this.f2223a = null;
        } else if (i == 2) {
            parcel.readInt();
            zzc.zzb(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i13 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            o0 o0Var = (o0) zzc.zza(parcel, o0.CREATOR);
            zzc.zzb(parcel);
            f fVar = this.f2223a;
            i0.j(fVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            i0.i(o0Var);
            f.zzj(fVar, o0Var);
            Bundle bundle2 = o0Var.f2232a;
            i0.j(this.f2223a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f2223a.onPostInitHandler(i13, strongBinder2, bundle2, i11);
            this.f2223a = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
