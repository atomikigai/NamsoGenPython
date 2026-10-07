package e6;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzblw;
import com.google.android.gms.internal.ads.zzbpg;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends zzayc implements k1 {
    public i1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // e6.k1
    public final float zze() throws RemoteException {
        Parcel parcelZzdb = zzdb(7, zza());
        float f10 = parcelZzdb.readFloat();
        parcelZzdb.recycle();
        return f10;
    }

    @Override // e6.k1
    public final List zzg() throws RemoteException {
        Parcel parcelZzdb = zzdb(13, zza());
        ArrayList arrayListCreateTypedArrayList = parcelZzdb.createTypedArrayList(zzblp.CREATOR);
        parcelZzdb.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // e6.k1
    public final void zzk() throws RemoteException {
        zzdc(1, zza());
    }

    @Override // e6.k1
    public final void zzl(String str, q7.a aVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(null);
        zzaye.zzf(parcelZza, aVar);
        zzdc(6, parcelZza);
    }

    @Override // e6.k1
    public final void zzo(zzbpg zzbpgVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, zzbpgVar);
        zzdc(11, parcelZza);
    }

    @Override // e6.k1
    public final void zzs(zzblw zzblwVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzf(parcelZza, zzblwVar);
        zzdc(12, parcelZza);
    }

    @Override // e6.k1
    public final void zzt(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzdc(18, parcelZza);
    }

    @Override // e6.k1
    public final void zzu(i3 i3Var) throws RemoteException {
        Parcel parcelZza = zza();
        zzaye.zzd(parcelZza, i3Var);
        zzdc(14, parcelZza);
    }

    @Override // e6.k1
    public final boolean zzv() throws RemoteException {
        Parcel parcelZzdb = zzdb(8, zza());
        boolean zZzg = zzaye.zzg(parcelZzdb);
        parcelZzdb.recycle();
        return zZzg;
    }
}
