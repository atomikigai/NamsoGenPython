package z7;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzbm;
import com.google.android.gms.internal.measurement.zzbo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends zzbm implements b0 {
    public a0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // z7.b0
    public final void H(f3 f3Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzd(parcelZza, f3Var);
        zzc(20, parcelZza);
    }

    @Override // z7.b0
    public final void a(Bundle bundle, f3 f3Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzd(parcelZza, bundle);
        zzbo.zzd(parcelZza, f3Var);
        zzc(19, parcelZza);
    }

    @Override // z7.b0
    public final List c(String str, String str2, String str3, boolean z4) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(null);
        parcelZza.writeString(str2);
        parcelZza.writeString(str3);
        int i = zzbo.zza;
        parcelZza.writeInt(z4 ? 1 : 0);
        Parcel parcelZzb = zzb(15, parcelZza);
        ArrayList arrayListCreateTypedArrayList = parcelZzb.createTypedArrayList(a3.CREATOR);
        parcelZzb.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // z7.b0
    public final void e(f3 f3Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzd(parcelZza, f3Var);
        zzc(6, parcelZza);
    }

    @Override // z7.b0
    public final void f(f3 f3Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzd(parcelZza, f3Var);
        zzc(4, parcelZza);
    }

    @Override // z7.b0
    public final List h(String str, String str2, f3 f3Var) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbo.zzd(parcelZza, f3Var);
        Parcel parcelZzb = zzb(16, parcelZza);
        ArrayList arrayListCreateTypedArrayList = parcelZzb.createTypedArrayList(c.CREATOR);
        parcelZzb.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // z7.b0
    public final List i(String str, String str2, String str3) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(null);
        parcelZza.writeString(str2);
        parcelZza.writeString(str3);
        Parcel parcelZzb = zzb(17, parcelZza);
        ArrayList arrayListCreateTypedArrayList = parcelZzb.createTypedArrayList(c.CREATOR);
        parcelZzb.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // z7.b0
    public final void j(a3 a3Var, f3 f3Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzd(parcelZza, a3Var);
        zzbo.zzd(parcelZza, f3Var);
        zzc(2, parcelZza);
    }

    @Override // z7.b0
    public final void k(f3 f3Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzd(parcelZza, f3Var);
        zzc(18, parcelZza);
    }

    @Override // z7.b0
    public final List l(String str, String str2, boolean z4, f3 f3Var) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        int i = zzbo.zza;
        parcelZza.writeInt(z4 ? 1 : 0);
        zzbo.zzd(parcelZza, f3Var);
        Parcel parcelZzb = zzb(14, parcelZza);
        ArrayList arrayListCreateTypedArrayList = parcelZzb.createTypedArrayList(a3.CREATOR);
        parcelZzb.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // z7.b0
    public final String m(f3 f3Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzd(parcelZza, f3Var);
        Parcel parcelZzb = zzb(11, parcelZza);
        String string = parcelZzb.readString();
        parcelZzb.recycle();
        return string;
    }

    @Override // z7.b0
    public final void q(long j4, String str, String str2, String str3) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j4);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        parcelZza.writeString(str3);
        zzc(10, parcelZza);
    }

    @Override // z7.b0
    public final void r(q qVar, f3 f3Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzd(parcelZza, qVar);
        zzbo.zzd(parcelZza, f3Var);
        zzc(1, parcelZza);
    }

    @Override // z7.b0
    public final byte[] s(q qVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzd(parcelZza, qVar);
        parcelZza.writeString(str);
        Parcel parcelZzb = zzb(9, parcelZza);
        byte[] bArrCreateByteArray = parcelZzb.createByteArray();
        parcelZzb.recycle();
        return bArrCreateByteArray;
    }

    @Override // z7.b0
    public final void z(c cVar, f3 f3Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzbo.zzd(parcelZza, cVar);
        zzbo.zzd(parcelZza, f3Var);
        zzc(12, parcelZza);
    }
}
